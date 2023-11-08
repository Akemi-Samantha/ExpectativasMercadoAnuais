package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.service;

import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.exceptions.BadRequestException;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.exceptions.NotFoudException;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.converter.Converter;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.dtos.MarketDataDto;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.entities.MarketDataEntity;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.repositorys.AnnualMarketExpectationsRepository;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.response.DeleteResponse;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.response.MarketDataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

import static org.apache.logging.log4j.ThreadContext.isEmpty;

@Service
public class AnnualMarketExpectationsService {
    @Autowired
    private AnnualMarketExpectationsRepository repository;

    public List<MarketDataResponse> getAllAnnualMarketData() {
        List<MarketDataEntity> marketDataEntities = repository.findAll();
            return Converter.listEntityToListResponse(marketDataEntities);
    }


    public MarketDataDto saveMarketData(@Valid MarketDataDto marketDataDto) {
        try {
            MarketDataEntity marketDataEntity = Converter.dtoToEntity(marketDataDto);
            return Converter.entityToDto(repository.save(marketDataEntity));
        }catch (Exception e) {
            throw new BadRequestException(" Bad request, please try again ;) ");
        }
    }


    public MarketDataDto findByIdMarkerData(Long id) {
        MarketDataEntity marketDataEntity = repository.findById(id).orElseThrow(() ->
                new NotFoudException(" Market Data id not found, please try again :( "));
        return Converter.entitytoMarketDto(marketDataEntity);
    }

    public MarketDataDto updatedMarketData(MarketDataDto marketDataDto, Long id) {
        marketDataDto.setId(id);
        if (repository.existsById(id)) {
            MarketDataEntity marketDataEntity = Converter.dtoToEntity(marketDataDto);
            return Converter.entityToDto(repository.save(marketDataEntity));
        } else {
            throw new BadRequestException(" Id Market Data not found, please try again to update data, thank you ;) ");
        }
    }

    public DeleteResponse deleteMarketData(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return new DeleteResponse("Market Data successfully deleted, thank you ;)");
        } else {
            throw new NotFoudException(" Id Market Data not found, please try again to delete data, thank you ;) ");
        }
    }

    public Page<MarketDataDto> getAllPage(Pageable pageable) {
        Page<MarketDataEntity> marketDataEntity = repository.findAll(pageable);
        if (marketDataEntity.isEmpty()){
            throw new NotFoudException("Empty list, there are no more pages in this list");
        }
        return Converter.pageableToDto(marketDataEntity);
    }

    public List<MarketDataDto> getAllByDataReferencia(String data_referencia) {
        List<MarketDataEntity> marketDataEntities = repository.findAllByDataReferencia(data_referencia);
        if (!marketDataEntities.isEmpty()) {
            return Converter.entitytoListMarketDto(marketDataEntities);
        } else {
            throw new NotFoudException("List not found, reference date value does not exist");
        }
    }


}