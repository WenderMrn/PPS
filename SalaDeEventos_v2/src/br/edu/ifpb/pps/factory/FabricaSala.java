package br.edu.ifpb.pps.factory;

import br.edu.ifpb.pps.models.Conferencia;
import br.edu.ifpb.pps.models.ISala;

public class FabricaSala extends IFabricaSala{

	@Override
	public ISala getSalaTipo(String tipo) {
		ISala sala = null;
		// TODO Auto-generated method stub
		switch (tipo) {
			case "normal":
				return new Conferencia(); 
			case "conferencia":
				return new Conferencia();
			case "videoconf":
				return new Conferencia();	
			case "laboratorio":
				return new Conferencia();	
			default:
				return sala;
		}		
	}
	
}
