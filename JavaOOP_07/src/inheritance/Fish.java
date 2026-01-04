package inheritance;

public class Fish extends Animal{

	//Gills are the breathing organs of fish.
	private int gills;
	private int fins;
	
	
	public Fish(String type, double weight, int gills, int fins) {
		super(type, "small", weight);
		this.gills = gills;
		this.fins = fins;
	}
	
	private void moveMuscles() {
		System.out.print("muscles moving");
	}
	
	private void moveBackFine() {
		System.out.print("moveBackFine moving");
	}

	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		super.move(speed);
		moveMuscles();
		if(speed=="fast") {
			moveBackFine();
		}
	}

	@Override
	public String toString() {
		return "Fish [gills=" + gills + ", fins=" + fins + ", type=" + type + "]";
	}


	
	
	
	
	
}
