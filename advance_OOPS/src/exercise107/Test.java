package exercise107;

public class Test {

	public static void main(String[] args) {
		Printer printer=new Printer(100, 10, true);
		int tonnerLevelIs =printer.addToner(10);
		int pagesNeeded=printer.printPages(10);
		
		System.out.println(" tonner level is "+tonnerLevelIs);
		System.out.println(" page need is "+pagesNeeded);
	}
}
