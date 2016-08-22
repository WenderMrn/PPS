package br.edu.ifpb.pps.state;

import java.util.List;

public class NaoRepetitivo implements EventoState{
	
	private String dataInico;
	private String dataFinal;
	
	public NaoRepetitivo(String dataInico,String dataFinal) {
		// TODO Auto-generated constructor stub
		this.dataFinal = dataInico;
		this.dataFinal = dataFinal;
	}
	
	@Override
	public EventoState proximo(String dataInico, String dataFinal) {
		// TODO Auto-generated method stub
		this.dataFinal = dataInico;
		this.dataFinal = dataFinal;
		return new NaoRepetitivo(dataInico,dataFinal);
	}

	@Override
	public EventoState proximo(List<DiasSemana> dias) {
		// TODO Auto-generated method stub
		return new Repetitivo(dias);
	}
	
	@Override
	public EventoState status() {
		// TODO Auto-generated method stub
		System.out.println("Não Repetitivo");
		System.out.println("Data Inicio: "+this.dataInico+" Date Final: "+this.dataFinal);
		return this;
	}

	public String getDataInico() {
		return dataInico;
	}

	public void setDataInico(String dataInico) {
		this.dataInico = dataInico;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	
}
