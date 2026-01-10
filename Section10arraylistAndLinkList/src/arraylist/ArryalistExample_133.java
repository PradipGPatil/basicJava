package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type , int count) {
	
	public GroceryItem(String name) {
		this(name, "Dairy",1);
	
	}
	
	@Override
	public String toString() {
		return String.format("%d %s in %s ", count, name.toUpperCase(),type);
	}
}

public class ArryalistExample_133 {

	public static void main(String[] args) {
		GroceryItem [] grocerryArray=new GroceryItem[3];
		grocerryArray[0]=new GroceryItem("Milk");
		grocerryArray[1]=new GroceryItem("apples", "Produce", 6);
		grocerryArray[2]=new GroceryItem("orages", "Produce", 5);
		System.out.println(Arrays.toString(grocerryArray));
		
		ArrayList objectList=new ArrayList();
		objectList.add(new GroceryItem("buttor"));
		objectList.add("yogut");
		
		ArrayList<GroceryItem> grocerryList=new ArrayList<>();
		
		// this will add item at last of the arrya
		grocerryList.add(new GroceryItem("buttor","produce",10));
	//	grocerryList.add("yogut");
		
		grocerryList.add(0,new GroceryItem("mango","produce",11));
		
		
		// to remove the item 
		grocerryList.remove(1);
		System.out.println(grocerryList);
		
	}
}
