package arraysInJava;

import java.util.Arrays;
import java.util.Random;

public class ArraysChallenge_124 {

	public static void main(String[] args) {
		
		
//		Create a program using arrays that sorts a list of integers in descending order. 
		//Descending order means from highest value to lowest.
//		In other words, if the array has the values 50, 25, 80, 5, and 15, 
		//your program should return an array with the values in the descending order: 80, 50, 25, 15,  and 5.
//		First, create an array of randomly generated integers.
//		Print the array before you sort it.
//		And print the array after you sort it.
//		You can choose to create a new sorted array or just sort the current array
		
		int[] array1=generateRandomArray(5);
		System.out.println(Arrays.toString(array1));
		
		
		// passing simple value
		int[] sortedArray=sortInteger(new int[] {7,30,35});
		System.out.println(Arrays.toString(sortedArray));
		

	}

	
	public static int[] generateRandomArray(int len) {
		Random random=new Random();
		
		int[] newArray=new int[len];
		
		for(int i=0;i<newArray.length;i++) {
		 newArray[i]=random.nextInt(100);	
		}
		return newArray;
	}

	public static int[] sortInteger(int[] array) {
		// created copy of the array
		int[] sortedArray=Arrays.copyOf(array, array.length);
		
		// we created flag which is true
		boolean flag=true;
		int tmp;
		
		// then created while loop which will flip
		// we are going to use 2 nested for loop if for loop has completed sorting number 
		// we going to set flag as true so actual while loop will be contiours
		System.out.println(Arrays.toString(array));
		while(flag) {
			
			flag=false;
			
			// note we are using -1 because we are comparing prev element to last one element
			for (int i = 0; i < sortedArray.length-1; i++) {
				// if 1 st element is less than 2 element then we want to swap the elment
				if(sortedArray[i]<sortedArray[i+1])
				{
					// store current element in i 
				// if we did not store the value in tmp we will overide or lose the vlaue
					tmp=sortedArray[i];
					sortedArray[i]=sortedArray[i+1];
					sortedArray[i+1]=tmp;
					flag=true;
					System.out.println("==>"+Arrays.toString(sortedArray));
				}
			}
			System.out.println("=>"+Arrays.toString(sortedArray));
		}
		
		return sortedArray;
	}
}

