
public class Vermelho implements SemaforoState{

	public SemaforoState tick() {
		// TODO Auto-generated method stub
		return new Verde();
	}

	public SemaforoState status() {
		// TODO Auto-generated method stub
		return this;
	}

	public SemaforoState panic() {
		// TODO Auto-generated method stub
		return new Panic();
	}

	public SemaforoState on() {
		// TODO Auto-generated method stub
		return tick();
	}

	public SemaforoState off() {
		// TODO Auto-generated method stub
		return new AmareloIntermitente();
	}

	public String toString() {
		return "Vermelho";
	}

}
