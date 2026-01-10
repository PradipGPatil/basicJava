package stringFormating;

public class StringManupulation {

	public static void main(String[] args) {
		String birthDate="22/05/1999";
		int startingIndex=birthDate.indexOf("1999");
		//index start from the zero
		System.out.println("starting index "+startingIndex);
		
		System.out.println("substring "+birthDate.substring(startingIndex));
		
		// start with index and exclude index 5
		System.out.println("month "+birthDate.substring(3, 5));
		
		// String has static method join
		String newDate=String.join("/", "11","12","2025");
		System.out.println("new date "+newDate);
		
		// another way is concat
		newDate="11";
		newDate=newDate.concat("/");
		newDate=newDate.concat("12");
		newDate=newDate.concat("/");
		newDate=newDate.concat("2025");
		System.out.println("new date "+newDate);
		
		newDate="11".concat("/").concat("12").concat("/").concat("2025");
		System.out.println("new date "+newDate);
		
		// substring
		newDate="11"+"/"+"12"+"/"+"2025";
		System.out.println("new date "+newDate);
		
		// replace every forward / with -
		System.out.println(newDate.replace("/", "-"));
		System.out.println(newDate.replace("2", "00"));
		// 1 st argument use regular expression
		System.out.println(newDate.replaceFirst("/", "-"));
		System.out.println(newDate.replaceAll("/", "---"));
		
		System.out.println("ABC\n".repeat(3));
		System.out.println("- - ".repeat(20));
		
		System.out.println("ABC\n".indent(8));
		System.out.println("- - ".repeat(20));
		
		System.out.println("ABC\n".repeat(8).indent(-2));
		System.out.println("- ".repeat(20));
		
		
	}
}
