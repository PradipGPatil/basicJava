package advance_OOPS;

public class Products {

	private String model;
	private String manufacturer;
	int width;
	int height;
	int depth;
	
	public Products() {}

	public Products(String model, String manufacturer) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
	}
}

class Monitor extends Products {
	private int size;
	private String resolution;

	public Monitor(String model, String manufacturer) {
		super(model, manufacturer);
	}

	public Monitor(String model, String manufacturer, int size, String resolution) {
		super(model, manufacturer);
		this.size = size;
		this.resolution = resolution;
	}
	
	public void drawFixelAt(int x, int y, String color) {
		System.out.println(String.format("Drawing pixel at %d , %d in color %s", x,y,color));
	}
}

class MotherBoard extends Products {
	private int ramSlots;
	private int cardSlots;
	private String bios;

	public MotherBoard(String model, String manufacturer) {
		super(model, manufacturer);
	}

	public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
		super(model, manufacturer);
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	
	
	public void loadPrograme(String programName) {
		System.out.println("Program name is "+ programName +" is loading !!");
	}
}

class ComputorCase extends Products {
	private String powerSupply;
	
	public ComputorCase(String model, String manufacturer) {
		super(model, manufacturer);
	}

	public ComputorCase(String model, String manufacturer, String powerSupply) {
		super(model, manufacturer);
		this.powerSupply = powerSupply;
	}
	
	public void pressPowerButton() {
		System.out.println("power button is pressed !!");
	}
}