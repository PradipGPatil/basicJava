package arrayRef;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] rev=reverse(new int[] {1,2,3,4,5});
		reverse2(new int[] {1,2,3,4,5});
		
	int[] rev=	reverseCopy(new int[] {1,2,3,4,5});
	System.out.println(Arrays.toString(rev));
		
	}

	private static int[] reverse(int[] array) {
		
		int[] reverseArray=new int[array.length];
		for(int i=0;i<array.length;i++) {
			reverseArray[i]=array[array.length-1-i];
		}

		
		return reverseArray;
	}
	

	private static int[] reverse2(int[] array) {
		// we have array were we want to swap 1 st element and last element
		// 1st el +1 swap it with last el -1
		// middle element does not need to swap
		
		// index of the last element 
		int maxIndex=array.length-1;
		int halfLength=array.length/2;
		
		for(int i=0;i<halfLength;i++) {
			
			int tmp=array[i];
			array[i]=array[maxIndex-i];
			array[maxIndex-i]=tmp;
			System.out.println("-->"+Arrays.toString(array));
		}
		
		return array;
	};
	
	
	// if we do not want to mutate original array
	
	private static int[] reverseCopy(int[] array) {
		int[] reverserArray=new int[array.length];
		int maxindex=array.length-1;
		
		for(int e:array) {
			
			reverserArray[maxindex--]=e;
		}
		return reverserArray;
		
	}
}
