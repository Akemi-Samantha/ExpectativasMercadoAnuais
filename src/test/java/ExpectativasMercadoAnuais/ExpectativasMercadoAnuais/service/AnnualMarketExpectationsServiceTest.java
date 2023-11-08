package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.service;


import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.entities.MarketDataEntity;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.repositorys.AnnualMarketExpectationsRepository;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.request.MarketDataRequest;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.response.MarketDataResponse;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AnnualMarketExpectationsServiceTest {

    @InjectMocks
    AnnualMarketExpectationsService service;
    @Mock
    AnnualMarketExpectationsRepository repository;

    @Test
    void getAllAnnualMarketData() {
        MarketDataEntity marketDataEntity = new MarketDataEntity( 1L,"Balanco de Balanco teste","Exportações", "2002-08-22",
                "2004",  65.76, 65.2, 4.75, 56.7, 80.5, 0, 0);
        when(repository.findAll()).thenReturn(Collections.singletonList(marketDataEntity));
        List<MarketDataResponse> marketDataResponseList = service.getAllAnnualMarketData();
        Assert.assertNotNull(marketDataResponseList);
        Assert.assertFalse(marketDataResponseList.isEmpty());
        assertEquals(1L,marketDataResponseList.get(0).getId());
    }


//    @Test
//    void saveMarketData() {
//        MarketDataRequest marketDataRequest = new MarketDataRequest( 1L,"Balanco de Balanco teste","Exportações", "2002-08-22",
//                "2004",  65.76, 65.2, 4.75, 56.7, 80.5, 0, 0);
//        MarketDataEntity marketDataEntity = new MarketDataEntity(marketDataRequest.getId(), marketDataRequest.getIndicador(),
//                marketDataRequest.getIndicadorDetalhe(), marketDataRequest.getData(),
//                marketDataRequest.getDataReferencia(), marketDataRequest.getMedia(),
//                marketDataRequest.getMediana(), marketDataRequest.getDesvioPadrao(),
//                marketDataRequest.getMinimo(), marketDataRequest.getMaximo(),
//                marketDataRequest.getNumeroRespondentes(), marketDataRequest.getBaseCalculo());
//
//        when(repository.save(any())).thenReturn(marketDataEntity);
//
//        service.saveMarketData(marketDataRequest);
//
//        Mockito.verify(repository, times(1)).save(any());
//    }
//

////    @Test
////    void findByIdMarkerData() {
//
//
//    }
}