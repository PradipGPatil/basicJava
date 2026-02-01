package execise01;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product) {
	
}
public class Store {
	
	private static ArrayList<ProductForSale> storeProduct=new ArrayList<>();

	public static void main(String[] args) {
		
		storeProduct.add(new ArtObject("Oild Painiting", 1350, "Impressionistic work by ABF apinted in 2010"));
		storeProduct.add(new ArtObject("Scuplture", 2000, "Bronze worky by JKF, producted in 1950"));
		listProducts();
		
		System.out.println("\n Order 1");
		var order1=new ArrayList<OrderItem>();
		addItemToOrder(order1, 1, 2);
		addItemToOrder(order1, 0, 1);
		printOrder(order1);
	}
	
	public static void listProducts() {
		for(var item:storeProduct) {
			System.out.println("-".repeat(30));
			item.showDetails();
		}
	}
	
	public static void addItemToOrder(ArrayList<OrderItem>order, int orderIndex, int qty) {
		order.add(new OrderItem(qty, storeProduct.get(orderIndex)));
	}
	
	public static void printOrder(ArrayList<OrderItem>order) {
		double salesTotal=0;
		for(var item:order) {
		item.product().printPricedItem(item.qty());	
		salesTotal+=item.product().getSalePrice(item.qty());
		}
		System.out.printf("Sales Total = $%6.2f %n",salesTotal);
	}
}
