package br.edu.ifpb.pp.application;

import java.util.Calendar;
import java.util.Scanner;

import br.edu.ifpb.pp.models.Evento;
import br.edu.ifpb.pp.models.Usuario;
import br.edu.ifpb.pp.util.DateHelper;

public class AplicacaoConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario usuario = new Usuario("Admin");
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		do {
			System.out.println("Logado como: "+usuario.getNome());
			System.out.println("************** MENU **************");
			System.out.println("1 - Adicionar Evento");
			System.out.println("2 - Remover Evento");
			System.out.println("3 - Adicionar Sala");
			System.out.println("4 - Remover Sala");
			System.out.println("5 - Alocar Evento");
			System.out.println("6 - Desalocar Evento");
			System.out.println("7 - Listar Evento");
			System.out.println("8 - Listar Salas");
			
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				// Adicionar Evento
				String nome;
				Calendar dataInicio;
				Calendar dataFim;
				String nomeContato;
				int numRepeticoes = 0;
				boolean isRepetitivo=false;
				
				teclado.nextLine();
				System.out.println("Informe o nome do evento: ");
				nome = teclado.nextLine();
				System.out.println("Informe a data de Inicio: ");
				dataInicio = DateHelper.stringToDate(teclado.next());
				System.out.println("Informe a data de Fim: ");
				dataFim = DateHelper.stringToDate(teclado.next());
				System.out.println("Informe o nome de contato: ");
				nomeContato = teclado.nextLine();
				teclado.nextLine();
				System.out.println("Vai se repetir?:(true,false)");
				isRepetitivo = teclado.nextBoolean();
				if(isRepetitivo){
					System.out.println("Qual o número de repetições?");
					numRepeticoes = teclado.nextInt();
				}
				
				Evento e = new Evento(1,nome, dataInicio,dataFim, nomeContato, numRepeticoes, isRepetitivo);
				usuario.adicionarEvento(e);
				
				System.out.println("Evento adicionado!");
				break;
			case 7:
				
			break;
			default:
				break;
			}
		} while (opcao != 0);
	}

}
