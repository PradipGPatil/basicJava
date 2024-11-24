package basicJava.StringManupulation;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// palidrome means which are same when we read from backword or forward
		
		String name="abba";
		
		// method 1
		StringBuilder sb =new StringBuilder("abba");
		StringBuilder sb1=sb.reverse();
		if(sb.equals(sb1)) {
		System.out.println(" palidrome !!!");	
		}else
		{
			System.out.println("not palidrome");
		}
		
		
		System.out.println("***** method 2 *** ");
		String rev="";
		// method 2
		for(int i=(name.length()-1);i>=0;i--) {
			rev+=name.charAt(i);
		}
		if(name.equals(rev)) {
			System.out.println(" palidrome !!");
		}
		else {
			System.out.println("not palidrome !!");
		}
	}

}
