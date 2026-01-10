package constructorAndClass;

public class TestExcWall88 {

	public static void main(String[] args) {
		ExcWall88 wall=new ExcWall88(5.0,4.0);
		System.out.println("area= "+wall.getArea());
		
		wall.setHeight(-1.5);
		System.out.println("height "+wall.getHeight());
		System.out.println("height "+wall.getWidth());
		System.out.println("height "+wall.getArea());
		
	}
}
