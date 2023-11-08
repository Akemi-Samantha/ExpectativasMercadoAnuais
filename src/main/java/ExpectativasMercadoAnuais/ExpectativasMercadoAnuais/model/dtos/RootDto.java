package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class RootDto {

    @JsonProperty("@odata.context")
    private String odataContext;
    @JsonProperty(value = "value")
    private List<MarketDataBaseDto> marketDataBaseDtos;

}
