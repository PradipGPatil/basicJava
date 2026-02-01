package interface01;

public class Truck implements Trackable{

	@Override
	public void track() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " 's coordinated recored");
		
	}
}
