package arrayRef;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array=readInteger();
		System.out.println(Arrays.toString(array));
		int minNumber=findMin(array);
		System.out.println("min number is "+minNumber);
		
	}

	public static int[] readInteger() {
		// create the prompt to user to enter 
		Scanner s=new Scanner(System.in);
		System.out.println("enter comma seperated number");
		
		// then entire line is a string
		String userEnterList=s.nextLine();
		
		// conver this string into the array
		String[]userArray=userEnterList.split(",");
		
		// create a array which will hold parted array to int
		int[] result=new int[userArray.length];
		
		// parce each string to int
		for(int i=0;i<userArray.length;i++) {
			result[i]=Integer.parseInt(userArray[i]);
		}
		
		return result;
	};
	
	private static int findMin(int [] array) {
		// consider 1 st element is min number
		int min=array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		return min;
	}
}
