package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.converter;

import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.dtos.MarketDataBaseDto;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.dtos.MarketDataDto;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.entities.MarketDataEntity;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.request.MarketDataRequest;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.response.MarketDataResponse;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Converter {
    public static MarketDataEntity dtoBaseToEntity(MarketDataBaseDto marketDataBaseDto){
        ModelMapper modelMapperEntityToDto = new ModelMapper();
        return modelMapperEntityToDto.map(marketDataBaseDto, MarketDataEntity.class);
    }

    public static MarketDataResponse entityToResponse(MarketDataEntity marketDataEntity){
        ModelMapper modelMapperDtoToEntity = new ModelMapper();
        return modelMapperDtoToEntity.map(marketDataEntity, MarketDataResponse.class);
    }

    public static MarketDataEntity requestToEntity(MarketDataRequest marketDataRequest){
        ModelMapper modelMapperRequestToEntity = new ModelMapper();
            return modelMapperRequestToEntity.map(marketDataRequest, MarketDataEntity.class);
    }

    public static MarketDataResponse marketDataDtoToResponse (MarketDataDto marketDataDto){
        ModelMapper modelMapperDtoToEntity = new ModelMapper();
        return modelMapperDtoToEntity.map(marketDataDto, MarketDataResponse.class);
    }

    public static MarketDataDto entitytoMarketDto (MarketDataEntity marketDataEntity){
        ModelMapper modelMapper = new ModelMapper();
        return  modelMapper.map(marketDataEntity, MarketDataDto.class);
    }

    public  static  MarketDataDto requestToDto(MarketDataRequest marketDataRequest){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(marketDataRequest, MarketDataDto.class);
    }

    public static MarketDataEntity dtoToEntity(MarketDataDto marketDataDto){
        ModelMapper modelMapperEntityToDto = new ModelMapper();
        return modelMapperEntityToDto.map(marketDataDto, MarketDataEntity.class);
    }

    public static MarketDataDto entityToDto (MarketDataEntity marketDataEntity){
        ModelMapper modelMapperEntityToDto = new ModelMapper();
        return modelMapperEntityToDto.map(marketDataEntity, MarketDataDto.class);
    }

    public  static  Page<MarketDataDto> pageableToDto(Page<MarketDataEntity> marketDataEntities){
        return marketDataEntities.map(Converter::entityToDto);
    }

    public static Page<MarketDataResponse> marketDataResponsePage (Page<MarketDataDto> marketDataDtoPage){
        return marketDataDtoPage.map(Converter::marketDataDtoToResponse);
    }

    public static List<MarketDataResponse> marketDataDtoToListResponse(List<MarketDataDto> marketDataDtos) {
        return  marketDataDtos.stream().map(Converter::marketDataDtoToResponse).collect(Collectors.toList());
    }

    public static List<MarketDataDto> entitytoListMarketDto(List<MarketDataEntity> marketDataEntities) {
        return  marketDataEntities.stream().map(Converter::entitytoMarketDto).collect(Collectors.toList());
    }

    public static List<MarketDataResponse> listEntityToListResponse(List<MarketDataEntity> marketDataEntity){
        return marketDataEntity.stream().map(Converter::entityToResponse).collect(Collectors.toList());
    }


}
