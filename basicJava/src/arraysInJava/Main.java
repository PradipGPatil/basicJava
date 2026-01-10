package arraysInJava;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] myIntArray=new int[10];
		myIntArray[2]=50;
		myIntArray[3]=60;
		
		double[] myDoubleArray=new double[10];
		myDoubleArray[8]=80.10;
		System.out.println(myDoubleArray[8]);
		
		// array initilized method
		// no need to pass array size, as java understand it going to be array of size 5
		int[] myFiveNumber=new int[] {1,5,6,8,10};
		
		// we can create anonumous array as well
		int[] myFineNumberAnonumous= {1,2,3,4,5};
		int arrayLenth=myFineNumberAnonumous.length;
		System.out.println("length of the array : "+myFineNumberAnonumous[arrayLenth-1]);
		
		// printin all element from the array
		
		int[] newArray= {10,20,30,40,50};
		
		// use conventional for loop
		
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i]+" ");
		}
		
		System.out.println();
		
		// if we do not declare value in the array , it will get set to default value
		int[] newArrays2=new int[5];
		
		// now we will print value by using enhance for loop
		// THIS ARRAY usefull when we want to travel throw the element
		
		for(int element:newArrays2) {
			System.out.print(element+" ");
		}
		
		// if we want to insert the value
		for (int i = 0; i < newArrays2.length; i++) {
			newArrays2[i]=newArrays2.length-i;
		};
		
		// again print the value by using enhance for loop
		System.out.println();
		
		for(int element:newArrays2) {
			System.out.print(element+" ");
		}
		
		System.out.println();
		// if we want to see only the element in the array 
		System.out.print(Arrays.toString(newArrays2));
		
	}
}
