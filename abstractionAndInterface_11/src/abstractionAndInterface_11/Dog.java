package abstractionAndInterface_11;

public class Dog extends Animal {

	public Dog(String type, String size, double weight) {
		super(type, size, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		if(speed.equalsIgnoreCase("Slow")) {
			System.out.println(getExpciliteName() +" walking");
		}
		else {
			System.out.println(getExpciliteName() +" running ");
		}
		
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		// type is protected method so subclass can use this filed directly 
		if(getExpciliteName()=="wolf") {
			System.out.println("Howling");
		
		}
		else {
			System.out.println("Woof !");
		}
	}

}
