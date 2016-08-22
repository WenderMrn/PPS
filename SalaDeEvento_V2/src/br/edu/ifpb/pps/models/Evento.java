package br.edu.ifpb.pps.models;

import java.util.Calendar;
import java.util.List;

import br.edu.ifpb.pps.state.DiasSemana;
import br.edu.ifpb.pps.state.EventoState;
import br.edu.ifpb.pps.state.NaoRepetitivo;
import br.edu.ifpb.pps.state.Repetitivo;

public class Evento {
	
	private String nome;
	private Calendar dataInicio;
	private Calendar dataFim;
	private String nomeContato;
	private EventoState state;
	
	public Evento(String di,String df) {
		super();
		this.state = new NaoRepetitivo(di,df);
		// TODO Auto-generated constructor stub
	}
	public Evento(List<DiasSemana> dias) {
		super();
		this.state = new Repetitivo(dias);
		// TODO Auto-generated constructor stub
	}
	public Evento(String nome, Calendar dataInicio, Calendar dataFim,
			String nomeContato, String dataInico, String dataFinal) {
		super();
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.nomeContato = nomeContato;
		this.state = new NaoRepetitivo(dataInico, dataFinal);
	}
	
	public Evento(String nome, Calendar dataInicio, Calendar dataFim,
			String nomeContato,List<DiasSemana> dias) {
		super();
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.nomeContato = nomeContato;
		this.state = new Repetitivo(dias);
	}
	public void repetir(List<DiasSemana> dias){
		this.state.proximo(dias);
	}
	public void naoRepetir(String dataInico, String dataFinal){
		this.state.proximo(dataInico, dataFinal);
	}
	public EventoState getTipoEvento(){
		return this.state;
	} 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataInicio() {
		return dataInicio;
	}
	
	public String getNomeContato() {
		return nomeContato;
	}
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EVENTO(NOME: "+getNome()+" TIPO:"+this.state.getClass().getSimpleName()+")";
	}
}
