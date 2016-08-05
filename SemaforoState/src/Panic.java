
public class Panic implements SemaforoState{
	
	public SemaforoState tick() {
		// TODO Auto-generated method stub
		return status();
	}

	public SemaforoState status() {
		// TODO Auto-generated method stub
		return this;
	}

	public SemaforoState panic() {
		// TODO Auto-generated method stub
		return status();
	}

	public SemaforoState on() {
		// TODO Auto-generated method stub
		return new Vermelho();
	}

	public SemaforoState off() {
		// TODO Auto-generated method stub
		return status();
	}

	public String toString() {
		return "Panic";
	}
}
