package inhertance02;

public class Dog extends Animal {

	// dog specific field
	private String earShape;
	private String tailShape;

	public Dog() {
		super("big", "mutt", 50);
	}
	
	public Dog(String type,double weight) {
		this(type,weight,"perky","curled");
	}

	// removed size
	public Dog(String type, double weight, String earShape, String tailShape) {
		super(weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), type, weight);
		this.earShape = earShape;
		this.tailShape = tailShape;
	}

	@Override
	public String toString() {
		return String.format("Dog [earShape=%s, tailShape=%s, toString()=%s]", earShape, tailShape,
				super.toString());
	}
	
	public void makeNoise() {
		// we have type as private on Animal class or subclass is not able to use it
		// so we change private to protected in animal class
		if(type=="Wolf") {
			System.out.println("ow Woo!!");
		}
		bark();
		System.out.println();
		
	}

	// this method is created by using ide help
	@Override
	public void move(String speed) {
		// TODO Auto-generated method stub
		super.move(speed);
//		System.out.println("dog walk, run and wage their tail !!");
		if(speed=="slow") {
			walk();
			wagTail();
		}
		else {
			run();
			bark();
		}
		System.out.println();
	}
	
	// created more specific method to the dog
	private void bark() {
		System.out.print("woof !!");
	}
	
	private void run() {
		System.out.print("Dog Running  !!");
	}
	
	private void walk() {
		System.out.print("Dog walking !!");
	}
	
	private void wagTail() {
		System.out.print("Tail wagging !!");
	}




}
