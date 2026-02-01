package abstractionAndInterface_11;


// as this is abstract class it can implement concrete method for the animal 
// or it will pass the method to subclass
abstract class Mammal extends Animal{

	public Mammal(String type, String size, double weight) {
		super(type, size, weight);
	}

	@Override
	// from animal we just override only one method
	public void move(String speed) {
		System.out.println(getExpciliteName() + " ");
		System.out.println(speed.equals("slow")? "walks" : "runs");
		
	}
	
	// just added own method for Mamma
	
	public abstract void shedHair();
	
}



public abstract class Animal {

	protected String type;
	private String size;
	private double weight;
	
	// abstract class can have constructore but it can not be intialted , 
	// subclass need to intiate those variable
	public Animal(String type, String size, double weight) {
		super();
		this.type = type;
		this.size = size;
		this.weight = weight;
	}
	
	public abstract void move(String speed);
	
	// using private here will be illigal because abstract means subclass need to provide logic for method 
	// but we specifiy as private this method will be availabe in only class
	public abstract void makeNoise();
	
	
	// concerte method of abstract class
	// final will not allow to change the behaviour
	public final String getExpciliteName() {
		return getClass().getSimpleName() + "("+type + ")";
	}
}
