/* Mini Projeto feito para a disciplina de Padr�es de Projeto 2016.1
 * O projeto utiliza o padr�o State ao cen�rio de um sem�foro.
 *  Autores: Matheus Mayer, Samyra Lara e Wender.
 *  Professor: Petr�nio Medeiros */


public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaforo semaforo = new Semaforo();
		semaforo.status();
		
		semaforo.on();
		semaforo.status();
		
		semaforo.tick();
		semaforo.status();
		
		semaforo.tick();
		semaforo.status();
		
		semaforo.panic();
		semaforo.status();
		
		semaforo.tick();
		semaforo.status();
		
		
		semaforo.off();
		semaforo.status();
		
		semaforo.on();
		semaforo.status();
		
		semaforo.tick();
		semaforo.status();
		
		semaforo.off();
		semaforo.status();

	}

}
