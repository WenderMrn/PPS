package br.edu.ifpb.pp.test;

import br.edu.ifpb.pp.models.Evento;
import br.edu.ifpb.pp.models.Normal;
import br.edu.ifpb.pp.models.Sala;
import br.edu.ifpb.pp.util.DateHelper;

public class DesalocarEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Evento evento1 = new Evento(1,"Festa no IFPB", DateHelper.stringToDate("27/07/2016"), DateHelper.stringToDate("28/07/2016"),"Fulano",2 ,true);
		
		Sala normal = new Normal();
		normal.setIdentificacao("N01");
		normal.setCapacidade(30);
		
		normal.setEvento(evento1);
		System.out.println(normal.getEvento().getNome());
		
		normal.setEvento(null);
		System.out.println(normal.getEvento());
		
		
	}

}
