package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.repositorys;

import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.entities.MarketDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnnualMarketExpectationsRepository extends JpaRepository<MarketDataEntity, Long> {
    @Query(value = "select * from tb_market_data tmd \n" +
            "where tmd.data_referencia = :data_referencia \n", nativeQuery = true)
    List<MarketDataEntity> findAllByDataReferencia(@Param("data_referencia") String data_referencia);



}