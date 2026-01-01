package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Morelist_134 {

	public static void main(String[] args) {
		String items[]= {"apples","banana","milk","eggs"};
		List<String> list=	List.of(items);
		System.out.println(list);
//		System.out.println(list.getClass().getName());
		
		ArrayList<String> grocessary=new ArrayList<String>(list);
		grocessary.add("yoguart");
		System.out.println(grocessary);
		
		ArrayList<String> nextList=new ArrayList<String>(List.of("pickles","mustured","cheese"));
		System.out.println(nextList);
		
		grocessary.addAll(nextList);
		System.out.println(grocessary);
		
		// get method
		
		System.out.println("third item " +grocessary.get(2));
		
		
		// searching from the items
		
		if(grocessary.contains("mustured")) {
			System.out.println("list contian the mustured");
		}
		
		// index of method 
		grocessary.add("yoguart");
		System.out.println("first ="+grocessary.indexOf("yoguart"));
		System.out.println("last ="+grocessary.lastIndexOf("yoguart"));
		
		// removing element 
		System.out.println(grocessary);
		grocessary.remove(1);
		System.out.println(grocessary);
		grocessary.remove("yoguart");
		System.out.println(grocessary);
		
		// remove all element
		
		grocessary.removeAll(List.of("apples","eggs"));
		System.out.println(grocessary);
		
		// clear the list
		grocessary.clear();
		System.out.println(grocessary);
		System.out.println(" grocesasary is empty "+ grocessary.isEmpty());
		
		// sorting emthod 
		
		grocessary.addAll(List.of("apples", "egg", "sugard"));
		grocessary.addAll(Arrays.asList("picket","powder"));
		System.out.println(grocessary);
		
		grocessary.sort(Comparator.naturalOrder());
		System.out.println(grocessary);
		
		
		grocessary.sort(Comparator.reverseOrder());
		System.out.println(grocessary);
	}
}
