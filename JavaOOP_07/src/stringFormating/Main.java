package stringFormating;

public class Main {

	public static void main(String[] args) {
		String bulletList = "Print a bullet list" +
							"\u2022 First point " + 
							"\u2022 Second point";
		// i will print on single line 
		System.out.println(bulletList);
		
		// we used escape character 
		String bulletList1 = "\t Print a bullet list \n" +
				"\t \u2022 First point \n" + 
				"\t \t \u2022 Second point\n";
		
		System.out.println(bulletList1);
		
		// we have text box option to print multiline string
		
		String textbox="""
				Print a bullet list
					\u2022 First point
						\u2022 Second pon
				""";
		System.out.println(textbox);
		
		// %d is placeholder
		int age=26;
		System.out.printf("Your age is %d %n", age);
		
		int yearOfBirth=2023-age;
		// %n does the newline for all operating system
		System.out.printf("age = %d, birth year=%d %n", age,yearOfBirth);
		
		// .2 tell i want two decimal places after the .
		System.out.printf("Your age is %.2f %n", (float)age);
		
		// we need to give i-0 otherwise it will contious loopin
		for(int i=1;i<=10000;i*=10) {
			System.out.printf("Printing %6d%n", i);
		}
		
		// we have format as static method
		
		String formattedString=String.format("your age is %d", age);
		System.out.println(formattedString);
		
		
	}
}
