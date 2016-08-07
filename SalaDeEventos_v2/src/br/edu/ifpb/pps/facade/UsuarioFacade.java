package br.edu.ifpb.pps.facade;

import br.edu.ifpb.pps.models.Evento;
import br.edu.ifpb.pps.models.ISala;
import br.edu.ifpb.pps.models.Usuario;

public class UsuarioFacade {
	private Usuario u;
	
	public UsuarioFacade(Usuario u){
		this.u = u;
	}
	
	public boolean alocarEvento(String nomeEvento, String codSala) throws Exception{
		
		Evento e = u.localizarEventoNome(nomeEvento);
		ISala s = u.localizarSala(codSala);
		
		try {
			if(u.localizarEventoNome(nomeEvento) != null && (u.localizarSala(codSala)) != null){
				s.setEvento(e);
				return true;
			}
			return false;
			
		} catch (Exception e2) {
			e2.getMessage();
			return false;
		}
		
	}
	
	public boolean desalocarEvento(String nomeEvento) throws Exception{
		
		Evento e = u.localizarEventoNome(nomeEvento);
		ISala s = null;
		
		try {
			if(e != null){
				s = u.localizarSalaPorEvento(e);
				if(s != null){
					s.setEvento(null);
					return true;
				}
			}
			return false;
			
		} catch (Exception e2) {
			e2.getMessage();
			return false;
		}
		
	}
}
