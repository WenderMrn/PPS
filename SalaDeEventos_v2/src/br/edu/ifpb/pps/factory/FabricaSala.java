package br.edu.ifpb.pps.factory;

import br.edu.ifpb.pps.models.Conferencia;
import br.edu.ifpb.pps.models.ISala;
import br.edu.ifpb.pps.models.Laboratorio;
import br.edu.ifpb.pps.models.Normal;
import br.edu.ifpb.pps.models.VideoConferencia;

public class FabricaSala extends IFabricaSala{

	@Override
	public ISala getSalaTipo(String tipo) {
		ISala sala = null;
		// TODO Auto-generated method stub
		switch (tipo) {
			case "normal":
				return new Normal(); 
			case "conferencia":
				return new Conferencia();
			case "videoconf":
				return new VideoConferencia();	
			case "laboratorio":
				return new Laboratorio();	
			default:
				return sala;
		}		
	}
	
}
