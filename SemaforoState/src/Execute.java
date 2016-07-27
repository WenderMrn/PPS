
public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Semaforo semaforo = new Semaforo();
		semaforo.status();
		
		semaforo.on();;
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
