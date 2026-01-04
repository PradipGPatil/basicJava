package constructorAndClass;

// class is bluePrint by using which we are going to create the object
public class Car_79 {

	//we have diff type of data type like int , float, long but those are limited 
	// so we can say class is another powerful datatype mainly we can say user defined datatype
	
	
	// if we donot specify the access modifier , the java give default modified or package modified 
	// which allow the access to member within the package only 
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

	// setter method does not return data so return type is void it only set the value 
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
