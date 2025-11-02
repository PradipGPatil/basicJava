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

}
