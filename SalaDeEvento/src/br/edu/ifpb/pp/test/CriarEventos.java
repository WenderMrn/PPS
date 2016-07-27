package br.edu.ifpb.pp.test;

import br.edu.ifpb.pp.models.Evento;
import br.edu.ifpb.pp.util.DateHelper;

public class CriarEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Evento evento1 = new Evento(1,"Festa no IFPB", DateHelper.stringToDate("27/07/2016"), DateHelper.stringToDate("28/07/2016"),"Fulano",2 ,true);
		Evento evento2 = new Evento(1,"Festa no IFPB", DateHelper.stringToDate("27/07/2016"), DateHelper.stringToDate("28/07/2016"),"Fulano",2 ,true);
		
	}

}
