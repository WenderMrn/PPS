package br.edu.ifpb.pp.models;

public class Conferencia extends Sala {
	private String apelido;
	public Conferencia() {
		super();
		
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

}
