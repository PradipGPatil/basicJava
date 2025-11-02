package exercise01;

public class Floor {

	private double width;
	private double lenght;
	
	public Floor(double width, double lenght) {
		// instead of if loop used tirnary operation	
		this.width=width<0?0:width;
		this.lenght=lenght<0?0:lenght;	
	}
	
	public double getArea() {
		return width*lenght;
	}
}
