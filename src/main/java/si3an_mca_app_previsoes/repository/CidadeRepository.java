package si3an_mca_app_previsoes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import si3an_mca_app_previsoes.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
	
	@Async
	@Query("Select c from Cidade c where latitude = :latitude and longitude = :longitude")
	public Cidade BuscarPorLatitudeELongitude(@Param("latitude") String latitude,@Param("longitude") String longitude);

	@Async
	@Query("Select c from Cidade c where nome = :nome")
	public Cidade BuscarPorNomeIgnoreCase(@Param("nome")String nome);
	
	@Async 
	@Query("Select c from Cidade  c where nome = :nome")
	public Cidade BuscarPorNome(@Param("nome")String nome);
	
	//@Async 
	@Query("SELECT c FROM Cidade c WHERE nome LIKE :search%")
	public List<Cidade> BuscarPorLetra(@Param("search") String search);
}
