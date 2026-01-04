package stringFormating;

public class StringBuilderTest {
	
	public static void main(String[] args) {
		String helloWorld="hello"+" world";
		
		helloWorld.concat(" good by ");
		StringBuilder buidler=new StringBuilder("hello"+" world");
		buidler.append(" good by ");
		
		printInformation(helloWorld);
		printInformation(buidler);
		
		// default capacity is 16 if need it get increased
		StringBuilder emptyStart=new StringBuilder();
		emptyStart.append("a".repeat(17));
		
		StringBuilder emptyStart32=new StringBuilder(32);
		emptyStart32.append("a".repeat(17));
		printInformation(emptyStart);
		printInformation(emptyStart32);
		
		
		StringBuilder buidlerPlus=new StringBuilder("hello"+" world");
		buidlerPlus.append(" Good by ");
		
		buidlerPlus.deleteCharAt(15).insert(15, "g");
		System.out.println(buidlerPlus);
		
		buidlerPlus.replace(15, 16, "G");
		
		buidlerPlus.reverse().setLength(7);
		System.out.println(buidlerPlus);
		
	}
	public static void printInformation(String string) {
     System.out.println("String ="+string);
     System.out.println("length ="+string.length());
	} 
	
	public static void printInformation(StringBuilder builder) {
	     System.out.println("builder ="+builder);
	     System.out.println("builderlength ="+builder.length());
	     System.out.println("capacity ="+builder.capacity());
		} 


}


