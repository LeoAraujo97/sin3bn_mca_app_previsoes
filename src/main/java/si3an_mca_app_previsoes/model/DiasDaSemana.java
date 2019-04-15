package si3an_mca_app_previsoes.model;

import javax.persistence.Entity;

@Entity
public class DiasDaSemana {

	private String diaDaSemana;
	

	public String getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}
	
}
