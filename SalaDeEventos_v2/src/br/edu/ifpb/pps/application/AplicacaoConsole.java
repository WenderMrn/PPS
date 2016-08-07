package br.edu.ifpb.pps.application;

import java.util.Scanner;

import br.edu.ifpb.pps.facade.UsuarioFacade;
import br.edu.ifpb.pps.models.Evento;
import br.edu.ifpb.pps.models.Usuario;

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
				teclado.nextLine();
				switch (opcao) {
				case 1:
					// Adicionar Evento
					String nome;
					String dataInicio = null;
					String dataFim = null;
					String nomeContato = "";
					int numRepeticoes = 0;
					boolean isRepetitivo=false;
					
					UsuarioFacade fa = new UsuarioFacade(usuario);
							
					System.out.println("Informe o nome do evento: ");
					nome = teclado.nextLine();
					
					System.out.println("Informe o nome de contato: ");
					nomeContato = teclado.nextLine();
					
					System.out.println("Vai se repetir?:(true,false)");
					String repete = teclado.nextLine();
							
					isRepetitivo = ("true".equalsIgnoreCase(repete));
						
					if(isRepetitivo){
						System.out.println("Qual o número de repetições?");
						numRepeticoes = teclado.nextInt();
						
						fa.adicionarEvento(nome,nomeContato,numRepeticoes);
					
					}else{
						System.out.println("Informe a data de Inicio: ");
						dataInicio = teclado.next();
						teclado.nextLine();
						
						System.out.println("Informe a data de Fim: ");
						dataFim = teclado.next();
						teclado.nextLine();
						
						fa.adicionarEvento(nome,nomeContato,dataInicio,dataFim);
					}
				
					System.out.println("Evento adicionado!");
					
				break;
				case 7:
					System.out.println("Informe o nome do evento para ser removido: ");
					String nomeEvento = teclado.nextLine();
			
					UsuarioFacade fa2 = new UsuarioFacade(usuario);
					Evento evento = fa2.localizarEventoNome(nomeEvento);
					
					if(evento != null){
						fa2.removerEvento(evento);
						System.out.println("Removido com sucesso!");
					}else{
						System.out.println("Evento não encontrado!");
					}
				break;
				default:
				break;
			}
		} while (opcao != 0);
	}

}
