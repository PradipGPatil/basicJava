package autoBoxingAndUnboxing;

import java.util.ArrayList;
import java.util.Arrays;

public class Autobox {
	
	public static void main(String[] args) {
		
		Integer boxedin=Integer.valueOf(15); // preferred but unnecessary 
		Integer deperecatedBoxing=new Integer(15); // deperecated after java 9
		
		// 
		int unboxedInt=boxedin.intValue();  // unecessary 
		
		
		Integer autoBoxed=15;
		int unautoBoxed=autoBoxed;
		
		
		System.out.println(autoBoxed.getClass().getName());
		
		Double resultBoxed=getLiteralDoublePrimitive();
		double resultUnboxed=getDoubleObject();
		
		
		Integer[] wrapperArray=new Integer[5];
		// this will autobox interger 50 to Integer 50 
		wrapperArray[0]=50;
		
		System.out.println(Arrays.toString(wrapperArray));
		System.out.println(wrapperArray[0].getClass().getName());
		
		Character[] characterArray= {'a','b','c','d'};
		System.out.println(Arrays.toString(characterArray));
		
		var outList=getList(1,2,3,4,5);
		System.out.println(outList);
	}
	
	private static ArrayList<Integer> getList(int... varargs){
		ArrayList<Integer> aList=new ArrayList<Integer>();
		for(int i: varargs) {
			
			// int valu is autoboxed here
			aList.add(i);
		}
		return aList;
	}
	
	// autoUnbox
	private static int returnInt(Integer i ) {
		return i;
	}
	//autoBox
	private static Integer returnInteger(int i) {
		return i;
	}
	private static Double getDoubleObject() {
		return Double.valueOf(100.00);
	}
	
	private static double getLiteralDoublePrimitive() {
		return 100.0;
	}

}
