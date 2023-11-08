package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.controller;

import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.exceptions.BadRequestException;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.converter.Converter;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.dtos.MarketDataDto;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.request.MarketDataRequest;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.response.DeleteResponse;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.response.MarketDataResponse;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.service.AnnualMarketExpectationsService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.error.Mark;

import java.util.List;

import static org.apache.logging.log4j.ThreadContext.isEmpty;

@RestController
@RequestMapping("/AnnualMarketExpectations")
public class AnnualMarketExpectationsController {

    @Autowired
    private AnnualMarketExpectationsService annualMarketExpectationsService;


    @ApiOperation(value = "Retorna uma lista de Expextativas de Mercado Anual")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna a lista de Mercado Anual"),
    })
    @GetMapping("/getAllAnnualMarketData")
    @ResponseStatus(HttpStatus.OK)
    public List<MarketDataResponse> getAllAnnualMarketData(){
        return annualMarketExpectationsService.getAllAnnualMarketData();
    }

    @ApiOperation(value = "Retorna Dados de Mercado Anual")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna Dados de Mercado Anuais a partir de um id"),
            @ApiResponse(code = 400, message = "Foi gerada uma exceção, id nao encontrado"),
    })
    @GetMapping("/findByIdMarkerData/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MarketDataResponse findByIdMarkerData(@PathVariable("id") Long id){
        MarketDataDto marketDataDto = annualMarketExpectationsService.findByIdMarkerData(id);
        return Converter.marketDataDtoToResponse(marketDataDto);
    }

    @ApiOperation(value = "Sava Dados de Mercado Anuais")
    @PostMapping("/saveMarketData")
    @ResponseStatus(HttpStatus.CREATED)
    public MarketDataResponse saveMarketData(@RequestBody MarketDataRequest marketDataRequest) {
        MarketDataDto marketDataDto = annualMarketExpectationsService.saveMarketData(
                Converter.requestToDto(marketDataRequest));
        return Converter.marketDataDtoToResponse(marketDataDto);
    }

    @ApiOperation(value = "Atualizar Dados de Mercado Anuais")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Atualiza Dados de Mercado Anuais a partir de um id"),
            @ApiResponse(code = 400, message = "Foi gerada uma exceção, id nao encontrado"),
    })
    @PutMapping("/updateMarketData/{id}")
    @ResponseStatus(HttpStatus.OK)
    public MarketDataResponse updatedMarketData(@PathVariable ("id") Long id, @RequestBody MarketDataRequest marketDataRequest){
       MarketDataDto marketDataDto =  annualMarketExpectationsService.updatedMarketData(
               Converter.requestToDto(marketDataRequest),id);
        return Converter.marketDataDtoToResponse(marketDataDto);
    }

    @ApiOperation(value = "Deleta Dados de Mercado Anuais")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Deleta Dados de Mercado Anuais a partir de um id"),
            @ApiResponse(code = 400, message = "Foi gerada uma exceção, id nao encontrado"),
    })
    @DeleteMapping("/deleteMarketDara/{id}")
    @ResponseStatus(HttpStatus.OK)
    public DeleteResponse deleteMarketData (@PathVariable("id") Long id){
        return annualMarketExpectationsService.deleteMarketData(id);
    }

    @ApiOperation(value = "Retorna uma lista de Expextativas de Mercado Anual Com Paginacao")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna a lista de Mercado Anual com paginacao "),
            @ApiResponse(code = 404, message = "Foi gerada uma exceção, lista nao encontrada pois esta vazia"),
    })
    @GetMapping("/getAllPage")
    @ResponseStatus(HttpStatus.OK)
    public Page<MarketDataResponse> getAllPage (Pageable pageable){
        Page<MarketDataDto> marketDataDtoPage = annualMarketExpectationsService.getAllPage(pageable);
        return Converter.marketDataResponsePage(marketDataDtoPage);
    }

    @ApiOperation(value = "Retorna uma Lista de  Dados de Mercado Anuais a partir do parametro")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Deleta Dados de Mercado Anuais a partir de uma data referencia"),
            @ApiResponse(code = 404, message = "Foi gerada uma exceção, data referencia nao encontrado"),
    })
    @GetMapping("/getAllByDataReferencia")
    @ResponseStatus(HttpStatus.OK)
    public List<MarketDataResponse> getAllByDataReferencia(@RequestParam(name = "data_referencia") String data_referencia){
        List<MarketDataDto> marketDataDtos = annualMarketExpectationsService.getAllByDataReferencia(data_referencia);
        return Converter.marketDataDtoToListResponse(marketDataDtos);
    }


}
