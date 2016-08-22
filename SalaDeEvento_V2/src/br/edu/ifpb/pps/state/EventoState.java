package br.edu.ifpb.pps.state;

import java.util.List;

public interface EventoState {
	public EventoState proximo(String dataInico,String dataFinal);
	public EventoState proximo(List<DiasSemana> dias);
	public EventoState status();
}
