package constructorAndClass;

public class TestSimpleCalculator {

	public static void main(String[] args) {
		ExeForSimpleCalculator simpleCalculatore=new ExeForSimpleCalculator();
		simpleCalculatore.setFirstNumber(5.0);
		simpleCalculatore.setSecondNumber(4);
		System.out.println("addition "+simpleCalculatore.getAdditionNumber());
		System.out.println("substraction "+simpleCalculatore.getSubtractNumber());
		
		simpleCalculatore.setFirstNumber(5.25);
		simpleCalculatore.setSecondNumber(0);
		
		System.out.println("multiple "+simpleCalculatore.getMultiplicationResult());
		System.out.println("division "+simpleCalculatore.getDivisionResult());
	}
}
