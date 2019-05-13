package si3an_mca_app_previsoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import si3an_mca_app_previsoes.model.Cidade;
import si3an_mca_app_previsoes.repository.CidadeRepository;
@Service
public class CidadeService {

	@Autowired
	private CidadeRepository cidadeRepo;

	public ResponseEntity<Cidade> cadastrarCidade(Cidade cidade) {
		try {
			cidadeRepo.save(cidade);
			return new ResponseEntity<Cidade>(cidade, HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
			return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	public List<Cidade> listarCidade() {
		return cidadeRepo.findAll();
	}

	public void delete(Cidade cidade) {
		cidadeRepo.delete(cidade);
	}

	public Cidade cidadePorLatitude(String Latitude, String Longitude) {

		Cidade cidade = cidadeRepo.BuscarPorLatitudeELongitude(Latitude, Longitude);

		if (cidade == null) {
			return null;
		}
		return cidade;

	}

	public Cidade cidadePorNomeIgnoreCase(String nome) {

		Cidade cidade = cidadeRepo.BuscarPorNomeIgnoreCase(nome);

		if (cidade == null) {
			return null;
		}
		return cidade;
	}

	public Cidade BuscarPorNome(String nome) {
		Cidade cidade = cidadeRepo.BuscarPorNome(nome);

		if (cidade == null) {
			return null;
		}
		return cidade;

	}

	public ResponseEntity<List<Cidade>> BuscarTodas() {

		List<Cidade> cidade = cidadeRepo.findAll();

		return new ResponseEntity<List<Cidade>>(cidade, HttpStatus.OK);
	}

	public ResponseEntity<List<Cidade>> BuscarPorLetraEspecifica(String search) {

	List<Cidade> cidade = cidadeRepo.BuscarPorLetra(search);

		return new ResponseEntity<List<Cidade>>(cidade, HttpStatus.OK);
	}

}
