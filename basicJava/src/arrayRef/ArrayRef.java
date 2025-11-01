package arrayRef;

import java.util.Arrays;

public class ArrayRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myintArray=new int[5];
		
		// here we copy ref of int array to into another variable
		int[] anotherArray=myintArray;
		
		System.out.println("my int array "+Arrays.toString(myintArray));
		System.out.println("another array "+Arrays.toString(anotherArray));
		
		anotherArray[0]=1;
		// we are passing copy of ref to the array
		modifyArray(anotherArray);
		
		System.out.println("after my int array "+Arrays.toString(myintArray));
		System.out.println("after another array "+Arrays.toString(anotherArray));
		
	}
	
	private static void modifyArray(int [] array) {
		array[1]=5;
	}
}
