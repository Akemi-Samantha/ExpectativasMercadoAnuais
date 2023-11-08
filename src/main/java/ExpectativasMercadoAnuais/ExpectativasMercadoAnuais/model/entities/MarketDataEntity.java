package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_market_data")
public class MarketDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("Indicador")
    @Column(name = "Indicador")
    private String indicador;

    @JsonProperty("IndicadorDetalhe")
    @Column(name ="IndicadorDetalhe")
    private String indicadorDetalhe;

    @JsonProperty("Data")
    @Column(name ="Data")
    private String data;

    @JsonProperty("DataReferencia")
    @Column(name ="DataReferencia")
    private String dataReferencia;

    @JsonProperty("Media")
    @Column(name ="Media")
    private double media;

    @JsonProperty("Mediana")
    @Column(name ="Mediana")
    private double mediana;

    @JsonProperty("DesvioPadrao")
    @Column(name ="DesvioPadrao")
    private double desvioPadrao;

    @JsonProperty("Minimo")
    @Column(name ="Minimo")
    private double minimo;

    @JsonProperty("Maximo")
    @Column(name ="Maximo")
    private double maximo;

    private long numeroRespondentes;
    private int baseCalculo;

}
