package arrayRef;

import java.util.Iterator;

public class VarArgs {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		System.out.println("print hello world !");
		
		String [] splitString="Hello world again ".split(" ");
//		printText(splitString);
		printText2(splitString);
		
		// we can simple string we want to 
		System.out.println(" _ ".repeat(20));
		printText2("hello");
		
		// we are passing argument to the method
		System.out.println(" _ ".repeat(20));
		printText2("hello","world","again");
		
		System.out.println(" _ ".repeat(20));
		printText2();
		
		String[] sArray= {"first","second","third"};
		System.out.println(String.join(",", sArray));
	}

	private static void printText(String[] textList) {
		
	for (String t : textList) {
		System.out.println(t);
	}
	};
	
	private static void printText2(String... textList ) {
		
	for (String t : textList) {
		System.out.println(t);
	}
	}
}
