package arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Challenge_137 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag = true;

		ArrayList<String> groceries = new ArrayList<String>();

		while (flag) {
			printAction();
			switch (Integer.parseInt(scanner.nextLine())) {
			case 1 -> addItems(groceries);
			case 2 -> removeItems(groceries);
			default -> flag = false;
			}
			groceries.sort(Comparator.naturalOrder());
			System.out.println(groceries);
		}

	}

	private static void addItems(ArrayList<String> groceries) {
		System.out.println("add items [separted by comma ]");
		String[] items = scanner.nextLine().split(",");
		// if user enter space it takes precedance , it adding duplicate element
//		groceries.addAll(List.of(items));

		for (String i : items) {
			String trimmed = i.trim();
			if (groceries.indexOf(trimmed) < 0) {
				groceries.add(trimmed);
			}
		}
	}

	private static void removeItems(ArrayList<String> groceries) {
		System.out.println("remove items [separted by comma ]");
		String[] items = scanner.nextLine().split(",");

		for (String i : items) {
			String trimmed = i.trim();
			groceries.remove(trimmed);
		}
	}

	private static void printAction() {

		String textBlock = """
				Available actions:

				0 - to shutdown

				1 - to add item(s) to list (comma delimited list)

				2 - to remove any items (comma delimited list)

				Enter a number for which action you want to do:""";

		System.out.println(textBlock + "");
	}

}
