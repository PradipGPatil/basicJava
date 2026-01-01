package linkList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkListTest_143 {

	public static void main(String[] args) {
		// LinkedList<String> placesTovist=new LinkedList<String>();

		// here java infer the type by seeing right side for string
		var placesToVisit = new LinkedList<String>();
		placesToVisit.add("perth");
		placesToVisit.add(0, "sydeny");
		System.out.println(placesToVisit);

		addMoreItems(placesToVisit);
		System.out.println(placesToVisit);

//		removeElement(placesToVisit);
//		System.out.println(placesToVisit);

//		gettingElement(placesToVisit);
//		printItenary(placesToVisit);
//		printItenary2(placesToVisit);
//		printItenary3(placesToVisit);
		testIterator(placesToVisit);
	}

	private static void addMoreItems(LinkedList<String> list) {
		list.addFirst("mumbai");
		list.addLast("pune");

		// quers method
		list.offer("Melbern");
		list.offerFirst("brisbane");
		list.offerLast("Toowomba");

		// stack method
		// add element at begining of the list
		list.push("Alice Spring");
	}

	private static void removeElement(LinkedList<String> list) {
		list.remove(0);
		list.remove("Melbern");

		System.out.println(list);
		String s1 = list.remove(); // remove first element

		System.out.println("removed " + s1);

		String s2 = list.removeFirst(); // remove first element

		System.out.println("removed first element " + s2);

		String s3 = list.removeLast(); // remove last element

		System.out.println("removed last element " + s3);

		// query method

		String p1 = list.poll();
		System.out.println(p1 + " removed first element ");

		String p2 = list.pollFirst();
		System.out.println(p2 + " removed first element ");

		String p3 = list.pollLast();
		System.out.println(p3 + " removed last element ");

		list.push("Kolhapur");
		list.push("kagal");
		list.push("Bengulure");

		System.out.println(list);

		String p4 = list.pop();
		System.out.println(p4 + " was removed"); // ifrst element is removed

	}

	private static void gettingElement(LinkedList<String> list) {

		System.out.println("retrived element =" + list.get(4));

		System.out.println("getting first element =" + list.getFirst());
		System.out.println("getting last element " + list.getLast());

		// getting index
		System.out.println("Alice spring is at position =" + list.indexOf("Alice Spring"));

		System.out.println("Toowomba is at position =" + list.lastIndexOf("Toowomba"));

		// query method

		System.out.println("element from element ()" + list.element());

		// Stack retrival method
		System.out.println("element from peak ()" + list.peek());
		System.out.println("element from peekFirst ()" + list.peekFirst());
		System.out.println("element from peekLast ()" + list.peekLast());

	}

	private static void printItenary(LinkedList<String> list) {
		System.out.println("trip start at " + list.getFirst());
		for (int i = 1; i < list.size(); i++) {
			System.out.println("--> From " + list.get(i - 1) + " to " + list.get(i));
		}
		System.out.println("trip end at " + list.getLast());

	}
	
	private static void printItenary2(LinkedList<String> list) {
		System.out.println("trip start at " + list.getFirst());
		 String previousTown=list.getFirst();
		 
		 for (String town:list) {
			 System.out.println("--> from "+ previousTown+" to "+ town);
			 previousTown=town;
		 }
		System.out.println("trip end at " + list.getLast());

	}
	
	private static void printItenary3(LinkedList<String> list) {
		System.out.println("trip start at " + list.getFirst());
		 String previousTown=list.getFirst();
			ListIterator<String> iterator=list.listIterator(1);
			while(iterator.hasNext()) {
			var town=iterator.next();	
			 System.out.println("--> from "+ previousTown+" to "+ town);
			 previousTown=town;
			}
		System.out.println("trip end at " + list.getLast());

	}
	
	public static void testIterator(LinkedList<String> list) {
//		var iterator=list.iterator();
//		while(iterator.hasNext()) {
//	//		System.out.println(iterator.next());
//			if(iterator.next().equals("mumbai")) {
//				iterator.remove();
//			}
//		}
//		System.out.println(list);
		
		var iterator=list.listIterator();
		while(iterator.hasNext()) {
	//		System.out.println(iterator.next());
			if(iterator.next().equals("mumbai")) {
				iterator.add("berline");
			}
		}
		System.out.println(list);
	}
}