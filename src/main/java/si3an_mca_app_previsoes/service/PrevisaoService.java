package si3an_mca_app_previsoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import si3an_mca_app_previsoes.model.Previsao;
import si3an_mca_app_previsoes.repository.PrevisaoRepository;

@Service
public class PrevisaoService {
	@Autowired
	private PrevisaoRepository previsaoRepository;

	public void salvar(Previsao previsao) {
		previsaoRepository.save(previsao);
	}

	public List<Previsao> listarTodos() {
		return previsaoRepository.findAll();
	}
}
