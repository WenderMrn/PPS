package br.edu.ifpb.pp.models;

public abstract class Sala {
	private String identificacao;
	private int capacidade;
	private Evento evento;
	
	public Sala(String identificacao, int capacidade, Evento evento) {
		super();
		this.identificacao = identificacao;
		this.capacidade = capacidade;
		this.evento = evento;
	}

	public Sala(String identificacao, int capacidade) {
		super();
		this.identificacao = identificacao;
		this.capacidade = capacidade;
	}

	public Sala() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
}
