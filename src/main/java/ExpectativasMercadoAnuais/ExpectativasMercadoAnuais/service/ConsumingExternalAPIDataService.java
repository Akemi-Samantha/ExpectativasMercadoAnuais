package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.service;

import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.feingclient.FeingClientConsumingApi;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.converter.Converter;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.dtos.MarketDataBaseDto;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.dtos.RootDto;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.entities.MarketDataEntity;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.repositorys.SaveDataMarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumingExternalAPIDataService {

    @Autowired
    private SaveDataMarketRepository saveDataMarketRepository;
    @Autowired
    private FeingClientConsumingApi feingClientConsumingApi;


    public RootDto saveAllConsumingMarketData() {
        RootDto rootDto = feingClientConsumingApi.getAllConsumingMarketData();

        for (MarketDataBaseDto marketDataBaseDto : rootDto.getMarketDataBaseDtos()){
            MarketDataEntity marketDataEntity = Converter.dtoBaseToEntity(marketDataBaseDto);
            saveDataMarketRepository.save(marketDataEntity);
        }
        return rootDto;
    }

}

