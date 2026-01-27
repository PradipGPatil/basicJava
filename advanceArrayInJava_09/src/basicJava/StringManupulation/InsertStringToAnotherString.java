package basicJava.StringManupulation;

public class InsertStringToAnotherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		originalString = "GeeksGeeks", 
//	            stringToBeInserted = "For", 
//	            index = 4
		
		String s="GeeksGeeks";
		String sti="For";
		char[] ca=sti.toCharArray();
		StringBuilder sb=new StringBuilder(s);
		sb.insert(4, sti);
		System.out.println(sb);
		

	}

}
