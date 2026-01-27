package plymerPhismCha_114;

public class Car {
	public String description;
	
	
	public Car(String description) {
		this.description=description;
	}
	
	public void startEngine() {
		System.out.println("starting engine");
	}
	
	protected void drive() {
		this.runEngine();
		System.out.println("Driving the instance of  -> "+getClass().getSimpleName());
	}
	
	protected void runEngine() {
		System.out.println("car->running the engine");
	}
	
}


class GasPoweredCar extends Car{
	
	public double avgKmPerLtr;
	public int cylinder=6;
	
	public GasPoweredCar(String description) {
		super(description);
	}
	
	public GasPoweredCar(String description, double avgKmPerLtr, int cylinder) {
		super(description);
		this.avgKmPerLtr = avgKmPerLtr;
		this.cylinder = cylinder;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("starting engine of gas powered car");
	}

	@Override
	protected void runEngine() {

		System.out.println("running engine of gas powered car");
	}
	
	
	
}

class ElectricalCar extends Car{
	
	public double avgKmPerCharge;
	public int batterySize;
	
	
	public ElectricalCar(String description, double avgKmPerCharge, int batterySize) {
		super(description);
		this.avgKmPerCharge = avgKmPerCharge;
		this.batterySize = batterySize;
	}
	
	@Override
	public void startEngine() {

		runEngine();
		System.out.println("starting engine of gas electrical car");
	}


	@Override
	protected void runEngine() {

		System.out.println("runing engine of electrical car");
	}
	
}

class HybridCar extends Car{
	public double avgKmPerLtr;
	private int batterySize;
	private int cylinder;
	
	public HybridCar(String description, double avgKmPerLtr, int batterySize, int cylinder) {
		super(description);
		this.avgKmPerLtr = avgKmPerLtr;
		this.batterySize = batterySize;
		this.cylinder = cylinder;
	}
	
	@Override
	public void startEngine() {

		runEngine();
		System.out.println("starting engine of gas hybrid car");
	}

	@Override
	protected void runEngine() {

		System.out.println("running engine of hybrid car");
	}
	
	
}