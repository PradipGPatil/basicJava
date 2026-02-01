package interface01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InterfaceTest {

	
	public static void main(String[] args) {
		
		Birds bird=new Birds();
		
		Animal animal=bird;
		
		FlightEnabled flier=bird;
		Trackable tracked=bird;
		
		animal.move();
		// here flier and tracked does not have method 
		// so complier will give the error
//		flier.move();
//		tracked.move();
		
//		flier.takeoff();
//		flier.fly();
//		tracked.track();
//		flier.land();
		
		inFlight(flier);
		
		inFlight(new Jet());
		
		Trackable truck=new Truck();
		truck.track(); 
		
		double kmsTraveled=100;
		double milesTraveled=kmsTraveled*FlightEnabled.MILES_TO_KM;
		System.out.printf("The truck traveled %.2f km or %.2f miles %n",
				kmsTraveled,milesTraveled);
		
		
	ArrayList<FlightEnabled> fliers=new ArrayList<FlightEnabled>();
		// if we change to linklist it will give error 
	// because method reqire arraylist as parameter 
//		LinkedList<FlightEnabled> fliers=new LinkedList<FlightEnabled>();
		fliers.add(bird);
		List<FlightEnabled> betterFliers=new ArrayList<FlightEnabled>();
		betterFliers.add(bird);
		
		triggerFliers(fliers);
		flyFliers(fliers);
		landFliers(fliers);
		
		triggerFliers(betterFliers);
		flyFliers(betterFliers);
		landFliers(betterFliers);
	}
	
	private static void inFlight(FlightEnabled flier) {
		 flier.takeoff();
		 flier.fly();
		 
		 // it checking instance of the interface 
		 if(flier instanceof Trackable tracked) {
			 tracked.track();
		 }
		 flier.land();
	}
	
	private static void triggerFliers(List<FlightEnabled> fliers) {
		
		for(var flier:fliers) {
			flier.takeoff();
		}
	}
	
	private static void flyFliers(List<FlightEnabled> fliers) {
		
		for(var flier:fliers) {
			flier.fly();
		}
	}
		private static void landFliers(List<FlightEnabled> fliers) {
			
			for(var flier:fliers) {
				flier.land();
			}
		}
		
		

}
