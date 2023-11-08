package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarketDataBaseDto {

    @JsonProperty("Indicador")
    private String indicador;
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
