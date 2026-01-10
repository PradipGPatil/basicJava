package multipleArray;

import java.util.Arrays;

public class MultipleArray {

	public static void main(String[] args) {
		
		// created array for outer 4 which has nested 4 array
		int [][] array2=new int[4][4];
		System.out.println(Arrays.toString(array2));
		System.out.println("length of the array : "+array2.length);
		
		// printing each element in arrya
		for(int[]array:array2) {
			// we are printing each nested array here
			System.out.println(Arrays.toString(array));
		}
		
		for(int i=0;i<array2.length;i++) {
			var innerArray=array2[i];
			for(int j=0;j<innerArray.length;j++) {
//				System.out.print(array2[i][j]+" ");
				array2[i][j]=(i*10)+(j+1);
			}
//			System.out.println();
		}
		
		// printing element by using for each loop
//		for(var outer:array2) {
//			for (var element:outer) {
//				System.out.print(element+" ");
//			}
//			System.out.println();
//		}
		
		System.out.println(Arrays.deepToString(array2));
		
		array2[1]=new int[] {10,20,30};
		System.out.println(Arrays.deepToString(array2));
		
		Object[] anyArray=new Object[3];
		System.out.println(Arrays.toString(anyArray));
		
		anyArray[0]=new String[] {"a","b","c"};
		System.out.println(Arrays.deepToString(anyArray));
		
		
		anyArray[1]=new String[][] {{"1","2"},
									{"1","2","5"},
									{"6","7","8","9"}};
		System.out.println(Arrays.deepToString(anyArray));
		
		
		anyArray[2]=new int [2][2][2];
		System.out.println(Arrays.deepToString(anyArray));
		
		for(Object element:anyArray) {
			System.out.println("element type ="+element.getClass().getSimpleName());
			System.out.println("element.tostirn()= "+element);
			System.out.println(Arrays.deepToString((Object[])element));
		}
	}
}
