package constructorAndClass;

public class Car_79_Test {

	public static void main(String[] args) {
		Car_79 car = new Car_79();
		
		// can not access the private file
//		car.make="maruti";
		// if we want to access to private field we can make it public so that what we
		// do not want or its bad practice
		
		// adventage of setmake is we can add validation in setmake as well before setting variable
		// also due to setting method we restrict creating invalid object
		
		// disadventage is that we need to manually set all the variables 
		car.setMake("porsche");
		car.setColor("red");
		car.setDoor(5);
		car.setModel("x");
		car.setConvertible(true);


		// we set getter
		System.out.println(car.getColor());
		System.out.println(car.getDoor());
		System.out.println(car.getMake());
		System.out.println(car.getModel());

		car.describeCar();
	}
}
