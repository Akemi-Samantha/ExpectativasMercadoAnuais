package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.controller;

import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.dtos.RootDto;
import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.service.ConsumingExternalAPIDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Consuming")

public class ConsumingExternalAPIDataController {


    @Autowired
    private ConsumingExternalAPIDataService consumingExternalAPIDataService;

    @GetMapping("/onbordingSaveMarketDataBase")
    public RootDto getAllConsumingMarketData(){
        return consumingExternalAPIDataService.saveAllConsumingMarketData();
    }

}
