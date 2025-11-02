package main01;

public class ExcWall {

	private double width;
	private double height;
	
	public ExcWall() {
		this(100.00, 100.00);
		System.out.println("calling default constructore");
	}

	public ExcWall(double width, double height) {
		System.out.println("calling parameterized constructor");
		 setWidth(width);
		 setHeight(height);
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void setWidth(double width) {
		if(width<0) {
			this.width=0;
		}else {
		this.width = width;
		}
	}

	public void setHeight(double height) {
		if(height<0) {
			this.height=0;
		}
		else {
		this.height = height;}
	}
	
	public double getArea() {
		return (this.width)*(this.height);
		
	}
	
	
}
