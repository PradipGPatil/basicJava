package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Morelist_134 {

	public static void main(String[] args) {
		String items[]= {"apples","banana","milk","eggs"};
		
		// called static factor method which return list of string
		List<String> list=	List.of(items);
		
		// it return list of immutable collection if we try to add string it will not
		System.out.println(list.getClass().getName());
		// if we try to add it will give error message 
//		list.add("yoguart");
		System.out.println(list);
		
		// if we pass the immutable list to arraylist but converted into mutable list
		ArrayList<String> grocessary=new ArrayList<String>(list);
		// here we can able to add the element
		grocessary.add("yoguart");
		System.out.println(grocessary);
		
		// another way to pass the list element
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
		System.out.println(grocessary);
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
		
		// converting  arraylist to regular array. toArray is method used to convert arraylist to regular array
		var grocessaryArray=grocessary.toArray(new String[grocessary.size()]);
	}
}
