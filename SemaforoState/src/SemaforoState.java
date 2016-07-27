
public interface SemaforoState {
	public SemaforoState tick();
	public SemaforoState status();
	public SemaforoState panic();
	public SemaforoState on();
	public SemaforoState off();
}
