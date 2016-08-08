package br.edu.ifpb.pps.models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.edu.ifpb.pps.models.Evento;
import br.edu.ifpb.pps.models.ISala;

public class Usuario {
	private String nome;
	private List<Evento> eventos;
	private List<ISala> salas;
	
	//********* Adicionar e Remover Eventos *********//
			
	public Usuario() {
		init();
	}
	
	public Usuario(String nome) {
		super();
		this.nome = nome;
		init();
	}
	
	private void init(){
		this.eventos = new ArrayList<Evento>();
		this.salas = new ArrayList<ISala>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionarEvento(Evento obj){
		this.eventos.add(obj);
	}

	public void removerEvento(Evento obj){
		this.eventos.remove(obj);
	}
	
	public boolean removerEvento(String nome){
		Evento e = localizarEventoNome(nome);
		if(e != null){
			this.eventos.remove(e);
			return true;
		}else{
			return false;
		}
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
	public Evento localizarEvento(Evento obj){
		/* O usu�rio pode localizar um evento escalonado atrav�s do nome, contato, data etc.*/
		for (Evento evento : eventos) {
			if(evento.equals(obj)){
				return evento;
			}
		}
		return null;
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
	
	/**
	 * @author sergio
	 * Localiza uma sala pelo código
	 */
	public ISala localizarSala(String codSala){
		
		for (ISala sala : this.salas) {
			if(sala.getId().equalsIgnoreCase(codSala)) return sala;
		}
		return null;
	}
	public ISala localizarSalaPorEvento(Evento obj){
		/* O usu�rio pode localizar um evento escalonado atrav�s do nome, contato, data etc.*/
		for (ISala sala : salas) {
			if(sala.getEvento() == obj){
				return sala;
			}
		}
		return null;
	}
	
	//********* Adicionar e Remover Salas *********//
	
	public void adicionarSala(ISala obj){
		this.salas.add(obj);
	}
	
	public void removerSala(ISala obj){
		this.salas.remove(obj);
	}
	
	public List<ISala> getSalas(){
		return this.salas;
	}
	public List<Evento> getEvetos(){
		return this.eventos;
	}
}
