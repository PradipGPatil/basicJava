package arraylist;

import java.util.Arrays;
import java.util.Comparator;

public class ArraylistAndArrayCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] orginalArray=new String[]{"First","Second","Third"};
		var originalList=Arrays.asList(orginalArray);
		originalList.set(0, "one");
		System.out.println("arraylist =>"+originalList);
		System.out.println("array =>"+Arrays.toString(orginalArray));
		
		originalList.sort(Comparator.naturalOrder());
		// capital letter sorted first then lower case letter sorted
		System.out.println("original list=>"+originalList);
		System.out.println("original array =>"+Arrays.toString(orginalArray));
		
		// as the arraylist is backed by array , we will get complie time error
		originalList.remove(0);
	}

}
