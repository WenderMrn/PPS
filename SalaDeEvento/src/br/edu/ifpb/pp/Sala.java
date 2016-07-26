package br.edu.ifpb.pp;

public abstract class Sala {
	private int id;
	private int capacidade;
	private String codigo;
	private Evento evento;
	
	//********* Construtor *********//
	public Sala() {
	}
	
	// ********* Gets e Sets *********//
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	
	
}
