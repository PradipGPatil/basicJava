package arraysInJava;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class UdemyExecise {
    // write code here   
    

        
    
    public static int[] getIntegers(int size){
        Scanner scan=new Scanner(System.in);
        
        int[] userArray=new int[size];
        for (int i=0;i<userArray.length ;i++ ) {
            userArray[i]=scan.nextInt();
        }
        return userArray;
    }
    
    public static void printArray(int[] array){
        
        for (int i=0;i<array.length ;i++ ){
            System.out.println("Element "+i+" contents "+array[i]);
        } 
        return;
    }
    
    public static int[] sortIntegers(int[] unsortedArray){
        
        // created copy of the array a
        int[] sortedArry=Arrays.copyOf(unsortedArray, unsortedArray.length);
        
       boolean flag=true;
        int tmp;
        
        while(flag){
            flag=false;
            for(int i=0;i<sortedArry.length-1;i++){
                
                if(sortedArry[i]<sortedArry[i+1]){
                    tmp=sortedArry[i];
                    sortedArry[i]=sortedArry[i+1];
                    sortedArry[i+1]=tmp;
                    flag=true;
                }
            }
        }
        return sortedArry;
    }
}
    
 