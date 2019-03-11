package si3an_mca_app_previsoes.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Previsao implements Serializable {
	private static final long serialVersionUID =1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeDia;
	private double temperaturaMinima;
	private double temperaturaMaxima;
	private int umidade;
	private String Descricao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeDia() {
		return nomeDia;
	}
	public void setNomeDia(String nomeDia) {
		this.nomeDia = nomeDia;
	}
	public double getTemperaturaMinima() {
		return temperaturaMinima;
	}
	public void setTemperaturaMinima(double temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}
	public double getTemperaturaMaxima() {
		return temperaturaMaxima;
	}
	public void setTemperaturaMaxima(double temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}
	public int getUmidade() {
		return umidade;
	}
	public void setUmidade(int umidade) {
		this.umidade = umidade;
	}
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	
	
}
