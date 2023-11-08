package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.feingclient;

import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.dtos.RootDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Consuming", url = "https://olinda.bcb.gov.br/olinda/servico/Expectativas/versao/v1/odata/ExpectativaMercadoMensais?$top=100&$format=json")
public interface FeingClientConsumingApi {

    @GetMapping(value = "")
    RootDto getAllConsumingMarketData();
}
