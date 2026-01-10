package arraysInJava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArraysClassHelperMethod_123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]firstArray=getRandomArray(10);
		System.out.println(Arrays.toString(firstArray));
		
		// suppose we want to sort this array java provide sort method
		// sort method does return anything, it sort existing array
		Arrays.sort(firstArray);
		
		System.out.println(Arrays.toString(firstArray));
		
		
		int[] secondArray=new int[10];
		// we have intilized this array, so it will print default value
		System.out.println(Arrays.toString(secondArray));
		
		// if we want to fill array with default value
		Arrays.fill(secondArray, 5);
		
		System.out.println(Arrays.toString(secondArray));
		
		
		// if we do not want to original array to be manipulated
		
		int[] thirdArray=getRandomArray(10);
		
		System.out.println(Arrays.toString(thirdArray));
		
		// copy third array to another array
		
		int[] fourthArrays=Arrays.copyOf(thirdArray, thirdArray.length);
		// just printed foutth array to compare with 3 rd array 
		System.out.println(Arrays.toString(fourthArrays));
		
		// now sort the fourth array
		
		Arrays.sort(fourthArrays);
		System.out.println(Arrays.toString(fourthArrays));
		
		
		// to create small and long arrays
		
		int[] smallArrays=Arrays.copyOf(thirdArray, 5);
		System.out.println(Arrays.toString(smallArrays));
		
		
		// passing large value
		int[] largeArray=Arrays.copyOf(thirdArray, 15);
		
		// other element will print as default value
		System.out.println(Arrays.toString(largeArray));
		
		
		
		// finding element in arrays
		
		String[] sArrays= {"pradip","jone","matt", "patrick"};
		// first we need to sort this arrays like dictionary 
		Arrays.sort(sArrays);
		
		System.out.println(Arrays.toString(sArrays));
		
		// binary search return -1 if item not found 
		if(Arrays.binarySearch(sArrays, "pradip")>0) {
			System.out.println("pradip found in array");
		}
		
		
		// equlity check
		int[] s1= {1,2,3,4,5};
		int[] s2= {1,2,3,4,5};
		
		if(Arrays.equals(s1, s2)) {
			System.out.println("both arrays are equal");
		}
		else {
			System.out.println("both arrays are not equal");
		}
	}
	
	private static int[] getRandomArray(int len) {
		
		Random random=new Random();
		
		int[] newInt=new int[len];
		
		// since we are assining value to array 
		// we have used tradition for loop here enhance for loop will not be helpful
		for (int i = 0; i < newInt.length; i++) {
			
			// this will return value between 0 and 100
			newInt[i]=random.nextInt(101);
		}
		
		return newInt;
	}

}
