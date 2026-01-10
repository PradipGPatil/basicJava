package composition;

public class PersonComputor extends Products {

	private Monitor monitor;
	private MotherBoard motherBoard;
	private ComputorCase computorCase;
	
	public PersonComputor(String model, String manufacturer, Monitor monitor, MotherBoard motherBoard,
			ComputorCase computorCase) {
		super(model, manufacturer);
		this.monitor = monitor;
		this.motherBoard = motherBoard;
		this.computorCase = computorCase;
	}

	private void drawLogo() {
		monitor.drawFixelAt(1200, 50, "yellow");
	}
	
	public void powerUp() {
		computorCase.pressPowerButton();
		drawLogo();
	}
	// we comment this method because calling code does not want to access those object.
//	public Monitor getMonitor() {
//		return monitor;
//	}
//
//	public MotherBoard getMotherBoard() {
//		return motherBoard;
//	}
//
//	public ComputorCase getComputorCase() {
//		return computorCase;
//	}
//	
	
	
}
