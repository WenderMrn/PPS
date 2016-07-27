package br.edu.ifpb.pp.facade;

import br.edu.ifpb.pp.models.Evento;
import br.edu.ifpb.pp.models.Sala;
import br.edu.ifpb.pp.models.Usuario;
/**
 * 
 * @author sergio
 *
 */
public class usuarioFacade {
	
	private Usuario usuario = null;
	private Sala sala = null;
	private Evento evento = null;
	
	public usuarioFacade(Usuario usuario, Sala sala, Evento evento) {
		this.usuario = usuario;
		this.sala = sala;
		this.evento = evento;
	}
	/**
	 * @author sergio
	 * @param usuario
	 * @param nomeEvento
	 * @param codSala
	 * @return
	 * @throws Exception
	 */
	public boolean alocarSala(Usuario usuario, String nomeEvento, String codSala) throws Exception{
		Evento e = usuario.localizarEventoNome(nomeEvento);
		Sala s = usuario.localizarSala(codSala);
		//usuario.localizarEventoNome(nomeEvento);
		
		if(usuario.localizarEventoNome(nomeEvento) != null && (usuario.localizarSala(codSala)) != null){
			s.setEvento(e);
		}
		return true;
	}

}
