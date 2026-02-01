package interface01;

public class Jet implements FlightEnabled, Trackable {

	@Override
	public void takeoff() {
		System.out.println(getClass().getSimpleName() + "is taking off");
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
	System.out.println(getClass().getSimpleName()+" is landing");	
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
	System.out.println(getClass().getSimpleName() +" is flying");	
	}

	@Override
	public void track() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + " 's coordinated recored");
		
	}
}
