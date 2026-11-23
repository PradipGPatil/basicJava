package hambergerChallenge;

public class Item {
	
	private String type;
	private String name;
	private double price;
	private String size="MEDIUM";
	
	
	public Item(String type, String name, double price) {
		super();
		this.type = type.toUpperCase();
		this.name = name.toUpperCase();
		this.price = price;
		
	}


	public String getName() {
		if(type.equals("SIDE")|| type.equals("DRINK")) {
			return size + " "+name;
		}
		
		return name;
	}
	
	public double getAdjustedPrice() {
		return switch(size) {
		case "SMALL"->getBasePrice()-0.5;
		case "LARGE"->getBasePrice()+1;
		default->getBasePrice();
			
		};
	}


	public void setSize(String size) {
		this.size = size;
	}


	public double getBasePrice() {
		return price;
	}


	

}
