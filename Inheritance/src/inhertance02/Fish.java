package inhertance02;

public class Fish extends Animal {
	
	private int gills;
	private int fins;
	
	
	public Fish( String type, double weight, int gills, int fins) {
		super("small", type, weight);
		this.gills = gills;
		this.fins = fins;
	}

	private void moveMuscles() {
		 
		System.out.print("muscles moving ");
	}


	private void moveBackFin() {
		 
		System.out.print("backFin moving ");
	}
	
	
	// type method name ide will give suggestion for overriding method
	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		super.move(speed);
		
		moveMuscles();
		if(speed=="fast") {
			moveBackFin();
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "Fish [gills=" + gills + ", fins=" + fins + "]";
	}




}
