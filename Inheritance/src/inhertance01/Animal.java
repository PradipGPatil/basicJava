package inhertance01;

public class Animal {

	private String size;
	private String type;
	private double weight;
	
	public Animal() {
		
	}
	
	public Animal(String size, String type, double weight) {
		super();
		this.size = size;
		this.type = type;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [size=" + size + ", type=" + type + ", weight=" + weight + "]";
	}
	
	public void move(String speed) {
		System.out.println(type +" moves"+ speed);
	}
	
	public void makeNoise() {
		System.out.println(type+" make some kind of noise");
	}
	
}
