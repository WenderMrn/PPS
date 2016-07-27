package br.edu.ifpb.pp.models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Evento> eventos;
	private List<Sala> salas;
	
	//********* Adicionar e Remover Eventos *********//
			
	public Usuario() {
		super();
		this.eventos = new ArrayList<Evento>();
		this.salas = new ArrayList<Sala>();
	}
	
	public Usuario(String nome) {
		super();
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Sala> getSalas() {
		return salas;
	}

	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

	public void adicionarEvento(Evento obj){
		this.eventos.add(obj);
	}

	public void removerEvento(Evento obj){
		this.eventos.remove(obj);
	}
	
	public Evento localizarEventoNome(String nome){
		/* O usu�rio pode localizar um evento escalonado atrav�s do nome, contato, data etc.*/
		Evento e= null;
		for (Evento evento : eventos) {
			if(evento.getNome().equalsIgnoreCase(nome)){
				e = evento;
				break;
			}
		}
		return e;
	}
	public Evento localizarEventoContato(String contato){
		/* O usu�rio pode localizar um evento escalonado atrav�s do nome, contato, data etc.*/
		Evento e= null;
		for (Evento evento : eventos) {
			if(evento.getNomeContato().equalsIgnoreCase(contato)){
				e = evento;
				break;
			}
		}
		return e;
	}
	public Evento localizarEventoDataInicio(Calendar data){
		/* O usu�rio pode localizar um evento escalonado atrav�s do nome, contato, data etc.*/
		Evento e= null;
		
		Calendar dataConsultada = data;
		dataConsultada.set(Calendar.HOUR,0);
		dataConsultada.set(Calendar.MINUTE,0);
		dataConsultada.set(Calendar.SECOND,0);
		
		for (Evento evento : eventos) {
			
			Calendar dataCorrente = evento.getDataInicio();
			dataCorrente.set(Calendar.HOUR,0);
			dataCorrente.set(Calendar.MINUTE,0);
			dataCorrente.set(Calendar.SECOND,0);
			
			if(dataCorrente.getTimeInMillis() == dataConsultada.getTimeInMillis()){
				e = evento;
				break;
			}
		}
		return e;
	}
	public Evento localizarEventoDataFim(Calendar data){
		/* O usu�rio pode localizar um evento escalonado atrav�s do nome, contato, data etc.*/
		Evento e= null;
		
		Calendar dataConsultada = data;
		dataConsultada.set(Calendar.HOUR,0);
		dataConsultada.set(Calendar.MINUTE,0);
		dataConsultada.set(Calendar.SECOND,0);
		
		for (Evento evento : eventos) {
			
			Calendar dataCorrente = evento.getDataFim();
			dataCorrente.set(Calendar.HOUR,0);
			dataCorrente.set(Calendar.MINUTE,0);
			dataCorrente.set(Calendar.SECOND,0);
			
			if(dataCorrente.getTimeInMillis() == dataConsultada.getTimeInMillis()){
				e = evento;
				break;
			}
		}
		return e;
	}
	
	//********* Adicionar e Remover Salas *********//
	
	public void adicionarSalas(Sala obj){
		this.salas.add(obj);
	}
	
	public void removerSalas(Sala obj){
		this.salas.remove(obj);
	}
	
	

}