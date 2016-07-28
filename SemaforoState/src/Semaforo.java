
public class Semaforo {
	protected SemaforoState state;

	public Semaforo() {
		super();
		System.out.println("Criando o Sem�foro");
		state = new AmareloIntermitente();
	}
	
	public void tick() {
		System.out.println("Apertando tick para mudar a cor do sem�foro:");
		state = state.tick();
	}

	public void status() {
		
		System.out.println("O estado atual do sem�foro � " + state.toString());
	}

	public void panic() {
		System.out.println("Apertando Panic do sem�foro: ");
		state = state.panic();
	}

	public void on() {
		System.out.println("Apertando On do sem�foro: ");		
		state = state.on();
	}

	public void off() {
		System.out.println("Apertando Off do sem�foro: ");		
		state = state.off();
	}
}
