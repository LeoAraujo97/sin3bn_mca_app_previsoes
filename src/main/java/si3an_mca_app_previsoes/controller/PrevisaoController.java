package si3an_mca_app_previsoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import si3an_mca_app_previsoes.model.Previsao;
import si3an_mca_app_previsoes.repository.PrevisaoRepository;

@Controller
public class PrevisaoController {

	@Autowired
	private PrevisaoRepository previsaoRepository;
	
	@GetMapping ("/previsao")
	public ModelAndView ListarPrevisao () {
	ModelAndView mv = new ModelAndView ("exibicao");
	List <Previsao> previsao = previsaoRepository.findAll();
	mv.addObject("previsoes", previsao);
	return mv;
	}
}
