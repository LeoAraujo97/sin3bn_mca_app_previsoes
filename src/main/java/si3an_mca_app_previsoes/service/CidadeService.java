package si3an_mca_app_previsoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import si3an_mca_app_previsoes.model.Cidade;
import si3an_mca_app_previsoes.repository.CidadeRepository;

public class CidadeService {

	@Autowired
	private CidadeRepository cidadeRepo;
	
	public void save(Cidade cidade) {
		
		cidadeRepo.save(cidade);
		
	}
	
	public List<Cidade>listarCidade(){
		return cidadeRepo.findAll();
	}
	
	public void delete(Cidade cidade) {
		cidadeRepo.delete(cidade);
	}
	
}
