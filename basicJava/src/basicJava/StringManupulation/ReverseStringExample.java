package basicJava.StringManupulation;

public class ReverseStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="i am good boy";
		// write a program to reverse string
		
		for(int i=name.length();i>0;i--) {
			char a=name.charAt(i-1);
			System.out.print(a);
			
		}
		
		// reverse string a same location
		
		System.out.println(" ");
		String[] splitedArrays=name.split(" ");
		StringBuilder s2=new StringBuilder();
		
		for(String splitedArray:splitedArrays) {
			StringBuilder s=new StringBuilder(splitedArray);
			s2.append(s.reverse()).append(" ");
			
		}
		System.out.println(s2);
		
		// reverse string order
		String [] s3=name.split(" ");
		StringBuilder sb3=new StringBuilder();
		for(int j=(s3.length-1);j>0;j--) {		
			sb3.append(s3[j]).append(" ");
		}
		
		System.out.println(sb3);
		
		

		
		

	}

}
