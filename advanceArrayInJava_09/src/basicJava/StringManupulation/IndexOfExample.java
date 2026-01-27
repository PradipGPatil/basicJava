package basicJava.StringManupulation;

public class IndexOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="learn java";
		
		//getting index of character j
		int result=str.indexOf('j');
		System.out.println(result);
		
		// find first occurence of a
		int result2=str.indexOf("a");
		System.out.println(result2);
		
		// character not in string 'J'
		int result3=str.indexOf("J");
		System.out.println(result3);  // if character not found it will return -1
		
		// substring not found
		
		int result4=str.indexOf("JAVA");
		System.out.println(result4);  // return -1 if not found
		
		// index of space
		int result5=str.indexOf(" ");
		System.out.println(result5);
		
									
		
		
		
	}

}
