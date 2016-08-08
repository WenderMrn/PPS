package br.edu.ifpb.pps.application;

import java.io.IOException;
import java.util.Scanner;

import br.edu.ifpb.pps.facade.UsuarioFacade;
import br.edu.ifpb.pps.models.Evento;
import br.edu.ifpb.pps.models.Usuario;
import br.edu.ifpb.pps.util.OSTypeHelper;

public class AplicacaoConsole {

	public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
		Usuario usuario = new Usuario("Admin");
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
			do { 
			    System.out.flush(); 
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
				{
					// Adicionar Evento
					System.out.println("************ Adicionar Evento ************");
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
				
					System.out.println("Evento adicionado!\n\n");
				}break;
				case 2:
				{
					System.out.println("************ Remover Evento ************");
					System.out.println("Informe o nome do evento para ser removido: ");
					String nomeEvento = teclado.nextLine();
			
					UsuarioFacade fa = new UsuarioFacade(usuario);
					Evento evento = fa.localizarEventoNome(nomeEvento);
					
					if(evento != null){
						fa.removerEvento(evento);
						System.out.println("Removido com sucesso!\n\n");
					}else{
						System.out.println("Evento não encontrado!\n\n");
					}
				}
				break;
				case 3:
				{
					System.out.println("************ Adicionar Sala ************");
					System.out.println("Informe o tipo de sala:(normal,conferencia,videoconf,laboratorio)");
					String tipoSala = teclado.nextLine();
					
					System.out.println("Informe a identificação: ");
					String identificacaoSala = teclado.nextLine();
					
					System.out.println("Informe a capacidade: ");
					int capacidadeSala = teclado.nextInt();
					
					UsuarioFacade fa = new UsuarioFacade(usuario);
					if(!fa.adicionarSala(tipoSala, identificacaoSala, capacidadeSala))
						System.out.println("Tipo de sala invalido!");
					else
						System.out.println("Sala removida!\n\n");
				}
				break;
				case 4:
				{
					System.out.println("************ Remover Sala ************");
					System.out.println("Informe a identificação: ");
					String identificacaoSala = teclado.nextLine();
					
					UsuarioFacade fa = new UsuarioFacade(usuario);
					if(!fa.removerSala(identificacaoSala)){
						System.out.println("Sala não encontrada!");
					}else{
						System.out.println("Sala adicionada!");
					}
					
				}
				break;
				case 5:
				{
					System.out.println("************ Alocar Evento ************");
					
					System.out.println("Informe o nome do evento: ");
					String nomeEvento = teclado.nextLine();
					
					System.out.println("Informe a identificação da sala: ");
					String codSala = teclado.nextLine();
					
					UsuarioFacade fa = new UsuarioFacade(usuario);
					
					if(!fa.alocarEvento(nomeEvento,codSala))
						System.out.println("Erro! verifique o nome do evento ou a identificação da sala");
					else
						System.out.println("Evento ALOCADO com sucesso!");
					
				}
				break;
				case 6:
				{
					System.out.println("************ Desalocar Evento ************");
					System.out.println("Informe o nome do evento: ");
					String nomeEvento = teclado.nextLine();
					
					UsuarioFacade fa = new UsuarioFacade(usuario);
					
					if(!fa.desalocarEvento(nomeEvento))
						System.out.println("Erro! verifique o nome do evento!");
					else
						System.out.println("Evento DESALOCADO com sucesso!");
				}
				break;
				case 7:
				{
					System.out.println("************ Listar Eventos ************");
					UsuarioFacade fa = new UsuarioFacade(usuario);
					fa.listarEventos();
				}
				break;
				case 8:
				{
					System.out.println("************ Listar Salas ************");
					UsuarioFacade fa = new UsuarioFacade(usuario);
					fa.listarSalas();
				}
				default:
				break;
			}
		} while (opcao != 0);
	}

}
