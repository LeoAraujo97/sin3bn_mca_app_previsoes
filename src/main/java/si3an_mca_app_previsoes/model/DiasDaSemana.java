package si3an_mca_app_previsoes.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class DiasDaSemana {

	@Id
	@NotNull
	private String diaDaSemana;
	
	@OneToOne(mappedBy = "dia")
	private Previsao previsao;
	

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}
	
}
