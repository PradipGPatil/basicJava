package main01;

public class Car77 {

	private String make = "Maruti";
	private String color = "white";
	private String model = "800";
	private int door = 4;
	private boolean convertible;

	// right cick->source->select getter -. click generate

	public String getMake() {
		return make;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	public int getDoor() {
		return door;
	}

	public boolean isConvertible() {
		return convertible;
	}

	public void setMake(String make) {
		if (make == null)
			make = "undefined";
		String lowerCase = make.toLowerCase();
		switch (lowerCase) {
		case "tesla", "porsche" -> this.make = make;
		default -> {
			this.make = "unsupported";
		}
		}
		
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}

	public void describeCar() {
		System.out
				.println(door + "-door " + color + " " + make + " " + model + " " + (convertible ? "convertible" : ""));
	}

}
