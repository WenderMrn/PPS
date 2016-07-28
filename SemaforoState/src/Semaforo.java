
public class Semaforo {
	protected SemaforoState state;

	public Semaforo() {
		super();
		System.out.println("Criando o Semáforo");
		state = new AmareloIntermitente();
	}
	
	public void tick() {
		System.out.println("Apertando tick para mudar a cor do semáforo:");
		state = state.tick();
	}

	public void status() {
		
		System.out.println("O estado atual do semáforo é " + state.toString());
	}

	public void panic() {
		System.out.println("Apertando Panic do semáforo: ");
		state = state.panic();
	}

	public void on() {
		System.out.println("Apertando On do semáforo: ");		
		state = state.on();
	}

	public void off() {
		System.out.println("Apertando Off do semáforo: ");		
		state = state.off();
	}
}
