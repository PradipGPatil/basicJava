package basicJava.StringManupulation;

public class IndexOfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Ronala@%do1$23$$";
		
		// print character between first 'o' and last 'o'
		
		int firstO=name.indexOf("o");
		int lastO=name.lastIndexOf("o");
		System.out.println(firstO);
		System.out.println(lastO);
		
		String name2=name.substring(firstO+1, lastO);
		System.out.println(name2);
		
		
		// to print number and character sperate
		
		int c=name.indexOf("1");
		
		// to print number only
		System.out.println(name.substring(8));
		
		// to print character only
		System.out.println(name.substring(0,8));
		
		// find the no of the special character in name
		
		int count=0;
		
		for(int i=0;i<name.length();i++) {
			
			char eachChar=name.charAt(i);
			if(!Character.isLetterOrDigit(eachChar)) {
				count++;
			}
		}
		
		System.out.println("spcecail character are : "+count);

	}

}
