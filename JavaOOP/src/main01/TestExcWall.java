package main01;

public class TestExcWall {

	public static void main(String[] args) {
		ExcWall wall=new ExcWall(5.0,4.0);
		System.out.println("area= "+wall.getArea());
		
		wall.setHeight(-1.5);
		System.out.println("height "+wall.getHeight());
		System.out.println("height "+wall.getWidth());
		System.out.println("height "+wall.getArea());
		
	}
}
