package abstractionAndInterface_11;

public class Fish extends Animal {

	public Fish(String type, String size, double weight) {
		super(type, size, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		if(speed.equalsIgnoreCase("Slow")) {
			System.out.println(getExpciliteName() +" lazy swim");
		}
		else {
			System.out.println(getExpciliteName() +" darting swim ");
		}
		
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		// type is protected method so subclass can use this filed directly 
		if(getExpciliteName()=="Gold Fish") {
			System.out.println("swish");
		
		}
		else {
			System.out.println("splash !");
		}
	}

}
