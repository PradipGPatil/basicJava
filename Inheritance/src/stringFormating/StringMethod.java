package stringFormating;

public class StringMethod {
	
	public static void main(String[] args) {
		printInformation("Hello world");
		printInformation("");
		printInformation("\t      \n");
		
		String helloworld="Hello World";
		System.out.println("index of r "+helloworld.indexOf("r"));
		
		System.out.println("index of world "+helloworld.indexOf("world"));
		
		// give position of first l
		System.out.printf(" index of l= %d %n",helloworld.indexOf("l"));
		
		// give position of last l
		System.out.printf(" index of l= %d %n",helloworld.lastIndexOf("l"));
		
		
		// string comparison method
		
		String helloworldLower=helloworld.toLowerCase();
		
		if(helloworld.equals(helloworldLower)) {
		System.out.println("world matched excatly");	
		}
		
		
		if(helloworld.equalsIgnoreCase(helloworldLower)) {
		System.out.println("world matched ignoring cases");	
		}
		
		if(helloworld.startsWith("Hello")) {
			System.out.println(" string start with hello");
		}
		
		if(helloworld.endsWith("World")) {
			System.out.println(" string end with world");
		}
		
		if(helloworld.contains("World")) {
			System.out.println(" string contains world");
		}
		// content equla can used to compare object as well
		if(helloworld.contentEquals("Hello World")) {
		System.out.println("world matched exactly cases");	
		}
	}

	public static void printInformation(String string) {
		int length=string.length();
		System.out.printf("lenght = %d%n",length);
		if(string.isEmpty()) {
			System.out.println("string is empty");
			return;
		}
		
		if(string.isBlank()) {
			System.out.println("string is blank");
			return;
		}
		

		
		System.out.printf("First char =%c %n",string.charAt(0));
		System.out.printf("last char =%c %n",string.charAt(length-1));
	}
}
