package br.edu.ifpb.pps.models;

import java.util.Calendar;

public class Evento {
	
	private String nome;
	private Calendar dataInicio;
	private Calendar dataFim;
	private String nomeContato;
	private int numRepeticoes;
	private boolean isRepetitivo;
	
	
	
	public Evento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Evento(String nome, Calendar dataInicio, Calendar dataFim,
			String nomeContato, int numRepeticoes, boolean isRepetitivo) {
		super();
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.nomeContato = nomeContato;
		this.numRepeticoes = numRepeticoes;
		this.isRepetitivo = isRepetitivo;
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
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Calendar getDataFim() {
		return dataFim;
	}
	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}
	public String getNomeContato() {
		return nomeContato;
	}
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	public int getNumRepeticoes() {
		return numRepeticoes;
	}
	public void setNumRepeticoes(int numRepeticoes) {
		this.numRepeticoes = numRepeticoes;
	}
	public boolean isRepetitivo() {
		return isRepetitivo;
	}
	public void setRepetitivo(boolean isRepetitivo) {
		this.isRepetitivo = isRepetitivo;
	}
	
	

}
