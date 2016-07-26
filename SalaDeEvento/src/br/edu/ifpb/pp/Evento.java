package br.edu.ifpb.pp;

import java.util.Date;

public class Evento {
	
	private int id;
	private String nome;
	private Date dataInicio;
	private Date dataFim;
	private String nomeContato;
	private int numRepeticoes;
	private boolean isRepetitivo;
	
	//********* Construtor *********//
	
	public Evento(int id, String nome, Date dataInicio, Date dataFim, String nomeContato, int numRepeticoes,
			boolean isRepetitivo) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.nomeContato = nomeContato;
		this.numRepeticoes = numRepeticoes;
		this.isRepetitivo = isRepetitivo;
	}
	// ********* Gets e Sets *********//
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public String getNomeContato() {
		return nomeContato;
	}
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
	
	
	

}
