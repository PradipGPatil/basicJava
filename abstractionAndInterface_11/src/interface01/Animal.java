package interface01;

enum FlightStages implements Trackable{
	GROUNDED, LAUNCH,CRUISE,DATA_COLLECTION;

	@Override
	public void track() {
		if(this!=GROUNDED) {
			System.out.println("Monitoring "+this);
		}
	}
}


// record also can implement interface
record DragonFly(String name,String type) implements FlightEnabled {

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}

class Satellite implements OrbitEarth{
	
	// this method will give error -Cannot reduce the visibility of the inherited method from OrbitEarth
	// we need to add public before the void 
	public	void achieveOrbit() {
	System.out.println("orbit achieved !");	
	}

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
}

interface OrbitEarth extends FlightEnabled{
	// this method is public on interface 
	void achieveOrbit();
}

interface FlightEnabled{
	
 public static double MILES_TO_KM=1.60934;
	
	double KM_TO_MILES=0.621371;
	
	public abstract void takeoff();
	
	// default modifier is public
	abstract void land();
	// we do not need to specifiy abstract 
	// because abstract is default modifier for the interface
	void fly();
	
}

interface Trackable{
	void track();
	}

public abstract class Animal {

	public abstract void move();
}
