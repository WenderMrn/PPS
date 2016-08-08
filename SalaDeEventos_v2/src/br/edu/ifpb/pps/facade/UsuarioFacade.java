package br.edu.ifpb.pps.facade;

import br.edu.ifpb.pps.factory.FabricaSala;
import br.edu.ifpb.pps.models.Evento;
import br.edu.ifpb.pps.models.ISala;
import br.edu.ifpb.pps.models.Usuario;
import br.edu.ifpb.pps.util.DateHelper;

public class UsuarioFacade {
	private Usuario u;
	
	public UsuarioFacade(Usuario u){
		this.u = u;
	}
	// adicionar evento
	public void adicionarEvento(String nome,String nomeContato,String dataInicial,String dataFinal){
		Evento e = new Evento();	
		e.setNome(nome);
		e.setNomeContato(nomeContato);
		e.setDataInicio(DateHelper.stringToDate(dataInicial));
		e.setDataFim(DateHelper.stringToDate(dataFinal));
		this.u.adicionarEvento(e);
	}
	
	public void adicionarEvento(String nome,String nomeContato,int numeroRepeticoes){
		Evento e = new Evento();	
		e.setNome(nome);
		e.setNomeContato(nomeContato);
		e.setRepetitivo(true);
		e.setNumRepeticoes(numeroRepeticoes);
		this.u.adicionarEvento(e);
	}
	
	public void adicionarEvento(Evento e){
		this.u.adicionarEvento(e);
	}
	
	public void removerEvento(Evento obj){
		this.u.removerEvento(obj);
	}
	
	public boolean removerEvento(String nome){
		Evento e = u.localizarEventoNome(nome);
		if(e != null){
			this.u.removerEvento(nome);
			return true;
		}else{
			return false;
		}
	}
	
	// localizar evento por: 
	public Evento localizarEventoNome(String nome){
		return this.u.localizarEventoNome(nome);
	}
	public Evento localizarEventoContato(String contato){
		return this.u.localizarEventoContato(contato);
	}
	public Evento localizarEvento(Evento obj){
		return this.u.localizarEvento(obj);
	}
	public Evento localizarEventoDataInicio(String data){
		return this.u.localizarEventoDataInicio(DateHelper.stringToDate(data));
	}
	public Evento localizarEventoDataFim(String data){
		return this.u.localizarEventoDataFim(DateHelper.stringToDate(data));
	}
	// localizar sala por: 
	public ISala localizarSala(String codSala) throws Exception{
		return this.u.localizarSala(codSala);
	}
	public ISala localizarSalaPorEvento(Evento obj){
		return this.u.localizarSalaPorEvento(obj);
	}
	
	//********* Adicionar e Remover Salas *********//
	
	public void adicionarSala(ISala obj){
		this.u.adicionarSala(obj);
	}
	
	public void removerSala(ISala obj){
		this.u.removerSala(obj);
	}
	public boolean removerSala(String identificacao){
		ISala sala = this.u.localizarSala(identificacao);
		if(sala==null){
			return false;
		}else{
			this.u.removerSala(sala);
			return true;
		}
			
		
	}
	public boolean adicionarSala(String tipo,String id,int capacidade ){
		FabricaSala fs = new FabricaSala();
		ISala sala = fs.getSalaTipo(tipo);
		if(sala==null){
			return false;
		}
		sala.setCapacidade(capacidade);
		sala.setId(id);
		this.u.adicionarSala(sala);
		return true;
	}
	public boolean alocarEvento(String nomeEvento, String codSala){
		
		Evento e = u.localizarEventoNome(nomeEvento);
		ISala s = u.localizarSala(codSala);
		
		if(u.localizarEventoNome(nomeEvento) != null && (u.localizarSala(codSala)) != null){
			s.setEvento(e);
			return true;
		}
		return false;
	}
	
	public boolean desalocarEvento(String nomeEvento){
		
		Evento e = u.localizarEventoNome(nomeEvento);
		ISala s = null;
		
		if(e != null){
			s = u.localizarSalaPorEvento(e);
			if(s != null){
				s.setEvento(null);
				return true;
			}
		}
		return false;
	}
	
	public void listarSalas(){
		System.out.println("---------------------------------------");
		for (ISala sala : this.u.getSalas()) {
			System.out.println(sala);
		}
		System.out.println("---------------------------------------\n\n");
	}
	
	public void listarEventos(){
		System.out.println("---------------------------------------");
		for (Evento evento : this.u.getEvetos()) {
			System.out.println(evento);
		}
		System.out.println("---------------------------------------\n\n");
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Usuário: "+this.u.getNome();
	}
}
