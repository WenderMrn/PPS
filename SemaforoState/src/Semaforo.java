
public class Semaforo {
	protected SemaforoState state;

	public Semaforo() {
		super();
		state = new AmareloIntermitente();
	}
	
	public void tick() {
		state = state.tick();
	}

	public void status() {
		System.out.println(state.toString());
	}

	public void panic() {
		state = state.panic();
	}

	public void on() {
		state = state.on();
	}

	public void off() {
		state = state.off();
	}
}
