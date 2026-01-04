package inheritance;

public class Animal {
	
	// this are common character for all animal
	// change to protected in order to subclass can access this filed
	protected String type;
	private String size;
	private double weight;
	
	public Animal() {};
	
	public Animal(String type, String size, double weight) {
		super();
		this.type = type;
		this.size = size;
		this.weight = weight;
	}
	
	public void move(String speed) {
		System.out.println(type + " moves "+ speed);
	}
	
	public void makeNoise() {
		System.out.println(type + " make some kind of moves");
	}

	@Override
	public String toString() {
		return "Animal [type=" + type + ", size=" + size + ", weight=" + weight + "]";
	}

	
	
}
