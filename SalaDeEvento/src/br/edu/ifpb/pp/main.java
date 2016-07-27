package br.edu.ifpb.pp;

import java.util.Calendar;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Usuario joao = new Usuario("Joao");
		
		Calendar dataInico = Calendar.getInstance();
		dataInico.set(Calendar.DAY_OF_MONTH,27);
		
		Calendar dataFim = Calendar.getInstance();
		dataFim.set(Calendar.DAY_OF_MONTH,28);
		
		Evento evento1 = new Evento(1,"Festa no IFPB",dataInico,dataFim,"Fulano",2,true);
		Conferencia sala1 = new Conferencia();
		sala1.setId(1);
		sala1.setCodigo("AE234");
		sala1.setCapacidade(40);
		sala1.setApelido("COnf Principal");
		
		joao.adicionarEventos(evento1);
		joao.adicionarSalas(sala1);
		
		

	}

}
