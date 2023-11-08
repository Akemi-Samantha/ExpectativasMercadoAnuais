package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarketDataDto {

    private Long id;
    @JsonProperty("indicador")
    private String indicador;
    @JsonProperty("indicador_detalhe")
    private String indicadorDetalhe;
    @JsonProperty("data")
    private String data;
    @JsonProperty("data_referencia")
    private String dataReferencia;
    @JsonProperty("media")
    private double media;
    @JsonProperty("mediana")
    private double mediana;
    @JsonProperty("desvio_padrao")
    private double desvioPadrao;
    @JsonProperty("minimo")
    private double minimo;
    @JsonProperty("maximo")
    private double maximo;
    @JsonProperty("numero_respondentes")
    private long numeroRespondentes;
    @JsonProperty("base_calculo")
    private int baseCalculo;

}
