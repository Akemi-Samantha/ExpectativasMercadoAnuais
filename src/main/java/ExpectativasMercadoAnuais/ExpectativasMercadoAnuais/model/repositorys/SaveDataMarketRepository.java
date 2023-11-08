package ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.repositorys;

import ExpectativasMercadoAnuais.ExpectativasMercadoAnuais.model.entities.MarketDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveDataMarketRepository extends JpaRepository <MarketDataEntity, Long> {

}
