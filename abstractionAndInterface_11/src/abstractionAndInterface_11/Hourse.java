package abstractionAndInterface_11;

public class Hourse extends Mammal{

	public Hourse(String type, String size, double weight) {
		super(type, size, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shedHair() {
		// TODO Auto-generated method stub
		System.out.println(getExpciliteName() +" Shed hair ");
		
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println(getExpciliteName() +" make noise ");
		
	}

}
