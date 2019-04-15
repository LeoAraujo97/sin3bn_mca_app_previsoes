package si3an_mca_app_previsoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import si3an_mca_app_previsoes.model.DiasDaSemana;
import si3an_mca_app_previsoes.repository.DiasDaSemanaRepository;

public class DiasDaSemanaService {
	@Autowired
	private DiasDaSemanaRepository diaRepo;

	public void salvar(DiasDaSemana dia) {
		diaRepo.save(dia);
	}

	public List<DiasDaSemana> listarDias() {
		return diaRepo.findAll();
	}

	public void excluir(DiasDaSemana dia) {
		diaRepo.delete(dia);
	}
}
