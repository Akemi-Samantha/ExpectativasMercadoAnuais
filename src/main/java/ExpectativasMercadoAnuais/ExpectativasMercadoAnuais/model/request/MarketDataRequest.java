package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarketDataRequest {

    @JsonProperty("Indicador")
    private String indicador;

    @NotEmpty
    @NotNull
    @JsonProperty("IndicadorDetalhe")
    private String indicadorDetalhe;

    @JsonProperty("Data")
    private String data;

    @JsonProperty("DataReferencia")
    private String dataReferencia;

    @JsonProperty("Media")
    private double media;

    @JsonProperty("Mediana")
    private double mediana;

    @JsonProperty("DesvioPadrao")
    private double desvioPadrao;

    @JsonProperty("Minimo")
    private double minimo;

    @JsonProperty("Maximo")
    private double maximo;

    private long numeroRespondentes;
    private int baseCalculo;

}


