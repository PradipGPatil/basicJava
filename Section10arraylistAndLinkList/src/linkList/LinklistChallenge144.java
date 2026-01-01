package linkList;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s (%d)", name, distance);
	}
	
	
};

public class LinklistChallenge144 {
	
	public static void main(String[] args) {
		LinkedList< Place> placesToVisit=new LinkedList<Place>();
		Place Adelaide=new Place("Adelaide", 1374);
		addPlace(placesToVisit, Adelaide);	
		addPlace(placesToVisit, new Place("adelaide", 1374));
		
		addPlace(placesToVisit, new Place("Brisbane",917 ));
		addPlace(placesToVisit, new Place("Alice Springs",917 ));
		addPlace(placesToVisit, new Place("Darwin",3972 ));
		addPlace(placesToVisit, new Place("Melbourne",877 ));
		addPlace(placesToVisit, new Place("Perth",3923 ));
		placesToVisit.addFirst(new Place("Sydney", 0));
		System.out.println(placesToVisit);
		
		
		var iterator=placesToVisit.listIterator();
		Scanner scanner=new Scanner(System.in);
		boolean quiteloop=false;
		boolean forward=true;
		
		printMenu();
		while(!quiteloop) {
			
			// if iterator does not have previous element then it first element of iterator 
			if(!iterator.hasPrevious()) {
				System.out.println("originating "+iterator.next());
				forward=true;
			};
			
			// if iterator does not have next elemnt then it is last element of the list 
			if(!iterator.hasNext()) {
				System.out.println("final "+iterator.previous());
				forward=false;
			}
			System.out.println("Enter value : ");
			String menuItem=scanner.nextLine().toUpperCase().substring(0, 1);
			
			switch(menuItem) {
			
			case "F": 
				System.out.println("user chose to go forward ");
				if(!forward) {   // reversing direction 
					forward=true;
					if(iterator.hasNext()) { // adjust position forward
						iterator.next();
					}
					
				}
				if(iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				break;
				
			case "B":
				System.out.println("User chose to go backwar ");
				
				if(forward) {   // reversing direction 
					forward=false;
					if(iterator.hasPrevious()) { // adjust position forward
						iterator.previous();
					}
					
				}
				if(iterator.hasPrevious()) {
					System.out.println(iterator.previous());
				}
				break;
			
			case "M":
				printMenu();
				break;
				
			case "L":
				System.out.println(placesToVisit);
				break;
			default: 
				quiteloop=true;
				break;
			}
		}
	}
	
	
	
	private static void addPlace(LinkedList<Place> list, Place place) {
		if(list.contains(place)) {
			System.out.println("Found duplicate - "+place);
			return;
		}
		
		for(Place p:list) {
			if(p.name().equalsIgnoreCase(place.name())) {
				System.out.println("Found duplicate "+place);
				return;
			}
		}
		
		int matchedIndex=0;
		for(var listPlace:list) {
			if(place.distance()<listPlace.distance()) {
				list.add(matchedIndex,place);
				return;
				
			}
			matchedIndex++;	
		}
		list.add(place);
	}
	
	private static void printMenu() {
		System.out.println("""
				Available actions (select word or letter):
					(F)orward
					(B)ackwards
					(L)ist Places
					(M)enu
					(Q)uit""");
	}
}

