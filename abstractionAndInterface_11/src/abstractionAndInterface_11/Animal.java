package abstractionAndInterface_11;

public abstract class Animal {

	protected String type;
	private String size;
	private double weight;
	
	
	public Animal(String type, String size, double weight) {
		super();
		this.type = type;
		this.size = size;
		this.weight = weight;
	}
	
	public abstract void move(String speed);
	
	// using private here will be illigal because abstract mena subcalss need to provide logic for method 
	// but we specifiy as private this method will be availabe in only class
	public abstract void makeNoise();
	
	
	// concerte method of abstract class
	
	public String getExpciliteName() {
		return getClass().getSimpleName() + "("+type + ")";
	}
}
