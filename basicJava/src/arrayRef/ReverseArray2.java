package arrayRef;

import java.util.Arrays;

public class ReverseArray2 {
	
	public static void main(String[] args) {
		
		reverseArray(new int[] {5,4,3,2,1});
		
	}
	
	private static void reverseArray(int[] array) {
		System.out.println("before reverse-> "+Arrays.toString(array));
		
		int maxindex=array.length-1;
		int halfLenght=array.length/2;
		
		
		for(int i=0;i<halfLenght;i++) {
		int tmp=array[i];
		array[i]=array[maxindex-i];
		array[maxindex-i]=tmp;
		
		System.out.println("reversing -->"+Arrays.toString(array));
		}
		
	}

}
