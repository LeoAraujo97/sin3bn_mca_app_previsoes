package si3an_mca_app_previsoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import si3an_mca_app_previsoes.model.Cidade;
import si3an_mca_app_previsoes.service.CidadeService;

@RestController
@RequestMapping("/api")
public class CidadeController {

	@Autowired
	private CidadeService cidadeService;

	@RequestMapping(value = "/CadastrarCidade", method = RequestMethod.POST)
	ResponseEntity<Cidade> createAdministrator(@RequestBody Cidade cidade, UriComponentsBuilder ucBuilder) {
		return cidadeService.cadastrarCidade(cidade);
	}

	@RequestMapping(value = "/ListarCidades", method = RequestMethod.GET)
	public ResponseEntity<?> ListarCidades() {
		return cidadeService.BuscarTodas();

	}

	@RequestMapping(value = "/CidadePorInicial/{search}", method = RequestMethod.GET)
	public ResponseEntity<?> cidadePorIncial(@PathVariable("search") String search, UriComponentsBuilder ucBuilder) {

		return cidadeService.BuscarPorLetraEspecifica(search);

	}

}
