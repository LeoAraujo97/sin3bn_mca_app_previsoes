package si3an_mca_app_previsoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import si3an_mca_app_previsoes.model.Previsao;
import si3an_mca_app_previsoes.service.PrevisaoService;

@Controller
public class PrevisaoController {

	//
	
	@Autowired
	private PrevisaoService previsaoService;
	
	
	@GetMapping ("/previsao")
	public ModelAndView ListarPrevisao () {
	ModelAndView mv = new ModelAndView ("exibicao");
	List <Previsao> previsao = previsaoService.listarTodos();
	mv.addObject("previsoes", previsao);
	return mv;
	}
	
	@PostMapping("/previsao")
	public String salvar(Previsao previsao) {
	//salvando com o service
	previsaoService.salvar(previsao);
	return "redirect:/previsao";
	}
}
