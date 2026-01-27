package arrayRef;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge_129 {

	public static void main(String[] args) {
		int readValue=readInteger();
		int[] returnAraay=readElements(readValue);
		for(int a:returnAraay) {
			System.out.println(a);
		}
		int minNumber=findMin(returnAraay);
		System.out.println("__ "+minNumber);
		
		
	}
	
    public static int readInteger(){
    	System.out.println(" How many number want to enter: ");
    	Scanner scan=new Scanner(System.in);
    	return scan.nextInt();

    }
    
    public static int[] readElements(int a){
 // now promptin user to enter 5 element
    	Scanner s=new Scanner(System.in);
    	int[] array=new int[a];
    	System.out.println("okay, then enter the "+a+"nuber");
        for(int i=0;i<a;i++) {
       array[i]= s.nextInt();	
        }
        return array;
    }
    
    public static int findMin(int[] b){
        int minNumber=b[0];
        for(int i=0;i<b.length;i++) {
        	if(b[i]<minNumber) {
        		minNumber=b[i];
        	}
        }
      return minNumber;  
    }
}
