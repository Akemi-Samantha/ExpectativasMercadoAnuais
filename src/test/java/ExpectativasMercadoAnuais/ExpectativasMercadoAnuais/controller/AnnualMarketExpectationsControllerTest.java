//package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.controller;
//
//import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.converter.Converter;
//import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.dtos.MarketDataDto;
//import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.entities.MarketDataEntity;
//import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.repositorys.AnnualMarketExpectationsRepository;
//import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.request.MarketDataRequest;
//import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.response.DeleteResponse;
//import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.response.MarketDataResponse;
//import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.service.AnnualMarketExpectationsService;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.modelmapper.internal.util.Assert;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageImpl;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThat;
//import static org.mockito.Mockito.reset;
//import static org.mockito.Mockito.when;
//
//@AutoConfigureMockMvc
//@WebMvcTest(AnnualMarketExpectationsController.class)
//@ExtendWith(MockitoExtension.class)
// class AnnualMarketExpectationsControllerTest {
//
//    @InjectMocks
//    public AnnualMarketExpectationsController annualMarketExpectationsController;
//
//    @Autowired
//    private MockMvc mockMvc;
//    @MockBean
//    private AnnualMarketExpectationsService annualMarketExpectationsService;
//
//    @MockBean
//    private AnnualMarketExpectationsRepository annualMarketExpectationsRepository;
//    @Mock
//    private MarketDataResponse marketDataResponse;
//    @Mock
//    private MarketDataDto marketDataDto;
//
//    @Mock
//    private MarketDataRequest marketDataRequest;
//
//    @Mock
//    private DeleteResponse deleteResponse;
//
//
//
//    @Test
//    @DisplayName("getAllAnnualMarketData")
//    void getAllAnnualMarketData()  {
//        List<MarketDataResponse> marketDataResponseList = new ArrayList<>();
//        when(annualMarketExpectationsService.getAllAnnualMarketData()).thenReturn(marketDataResponseList);
//        List<MarketDataResponse> retorno = annualMarketExpectationsController.getAllAnnualMarketData();
//        Assert.notNull(retorno);
//    }
//
//    @Test
//    @DisplayName("getAllPage")
//    void getAllPage()   {
//        Pageable pageable = PageRequest.of(0, 10);
//        Page<MarketDataDto> marketDataDtoPage = new PageImpl<>(List.of());
//        when(annualMarketExpectationsService.getAllPage(pageable)).thenReturn(marketDataDtoPage);
//        Page<MarketDataResponse> retorno = annualMarketExpectationsController.getAllPage(pageable);
//     }
//
//        @Test
//        @DisplayName("getByIdMarketData")
//        void findByIdMarkerData(){
//        var id = marketDataDto.getId();
//        when(annualMarketExpectationsService.findByIdMarkerData(id)).thenReturn(marketDataDto);
//        MarketDataResponse retorno = annualMarketExpectationsController.findByIdMarkerData(id);
//
//    }
//    @Test
//    @DisplayName("saveMarketData")
//    void saveMarketData () {
//        MarketDataRequest marketDataRequestt = new MarketDataRequest(1L,"Balanco de Balanco teste","Exportações", "2002-08-22",
//               "2004",  65.76, 65.2, 4.75, 56.7, 80.5, 0, 0);
//        when(annualMarketExpectationsService.saveMarketData(marketDataRequest)).thenReturn(marketDataResponse);
//        MarketDataResponse retorno = annualMarketExpectationsController.saveMarketData(marketDataRequest);
//    }
//
//    @Test
//    @DisplayName("updateMarketData")
//    void updatedMarketData (){
//        MarketDataRequest marketDataRequestt = new MarketDataRequest(1L,"Balanco de Balanco teste","Exportações", "2002-08-22",
//                "2004",  65.76, 65.2, 4.75, 56.7, 80.5, 0, 0);
//        MarketDataDto marketDataDtoo = new MarketDataDto(1L,"Balanco de Balanco teste","Exportações", "2002-08-22",
//                "2004",  65.76, 65.2, 4.75, 56.7, 80.5, 0, 0);
//        var id = marketDataDtoo.getId();
//        when(annualMarketExpectationsService.updatedMarketData(Converter.requestToDto(marketDataRequestt),id)).thenReturn(marketDataDtoo);
//        MarketDataResponse response = annualMarketExpectationsController.updatedMarketData(id, marketDataRequestt);
//    }
//
//    @Test
//    @DisplayName("deleteMarketDara")
//    void deleteMarketData(){
//        var id = marketDataRequest.getId();
//        when(annualMarketExpectationsService.deleteMarketData(id)).thenReturn(deleteResponse);
//    }
//
//    @Test
//    @DisplayName("getAllByDataReferencia")
//    void getAllByDataReferencia(){
//        var data_referencia = marketDataResponse.getDataReferencia();
//        List<MarketDataDto> marketDataDtos = new ArrayList<>();
//        when(annualMarketExpectationsService.getAllByDataReferencia(data_referencia)).thenReturn(marketDataDtos);
//        List<MarketDataResponse> marketDataResponses = annualMarketExpectationsController.getAllByDataReferencia(data_referencia);
//    }
//
//}
//
//
//
//
//
//
//
//
