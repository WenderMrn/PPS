package br.edu.ifpb.pps.state;

import java.util.List;

public class NaoRepetitivo implements EventoState{
	
	private String dataInicio;
	private String dataFinal;
	
	public NaoRepetitivo(String dataInico,String dataFinal) {
		// TODO Auto-generated constructor stub
		this.dataInicio = dataInico;
		this.dataFinal = dataFinal;
	}
	
	@Override
	public EventoState proximo(String dataInicio, String dataFinal) {
		// TODO Auto-generated method stub
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		return new NaoRepetitivo(dataInicio,dataFinal);
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
		return this;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Não Repetitivo - Data Inicio: "+this.dataInicio+" Data Final: "+this.dataFinal;
	}
	
}
