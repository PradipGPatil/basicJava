package plymerPhismCha_114;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car=new Car("car");
		runRace(car);
		
		System.out.println("--------");
		
		Car car1=new GasPoweredCar("gas powered", 30, 4);
		runRace(car1);
	}
	
	public static void runRace(Car car) {
		car.startEngine();
		car.drive();
	}

}
