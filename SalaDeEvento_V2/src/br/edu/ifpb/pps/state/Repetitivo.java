package br.edu.ifpb.pps.state;

import java.util.List;

public class Repetitivo implements EventoState{
	private List<DiasSemana> dias;
	
	public Repetitivo(List<DiasSemana> dias) {
		// TODO Auto-generated constructor stub
		this.dias = dias;
	}
	
	@Override
	public EventoState proximo(String dataInico, String dataFinal) {
		// TODO Auto-generated method stub
		return new NaoRepetitivo(dataInico,dataFinal);
	}

	@Override
	public EventoState proximo(List<DiasSemana> dias) {
		// TODO Auto-generated method stub
		this.dias = dias;
		return new Repetitivo(dias);
	}

	@Override
	public EventoState status() {
		// TODO Auto-generated method stub
		System.out.println("Não Repetitivo");
		System.out.println(dias);
		return this;
	}

	public List<DiasSemana> getDias() {
		return dias;
	}

	public void setDias(List<DiasSemana> dias) {
		this.dias = dias;
	}
		
}
