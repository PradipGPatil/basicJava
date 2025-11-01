package main01;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		
		// adventage of setmake is we can add validation in setmake as well before setting variable
		car.setMake("porsche");
		car.setColor("red");
		car.setDoor(5);
		car.setModel("x");
		car.setConvertible(true);
		// can not access the private file
//		car.make="maruti";
		// if we want to access to private field we can make it public so that what we
		// do not want or its bad practice

		// we set getter
		System.out.println(car.getColor());
		System.out.println(car.getDoor());
		System.out.println(car.getMake());
		System.out.println(car.getModel());

		car.describeCar();
	}
}
