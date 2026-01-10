package constructorAndClass;

public class ExeForSimpleCalculator {

	private double firstNumber;
	private double secondNumber;
	
	public double getFristNumber() {
		return this.firstNumber;
	}
	
	public double getSecondNumber() {
		return this.secondNumber;
	}
	
	public void setFirstNumber(double firstNumber) {
		this.firstNumber=firstNumber;
	}
	
	public void setSecondNumber(double secondNumber) {
		this.secondNumber=secondNumber;
	}
	
	public double getAdditionNumber() {
		double result=this.firstNumber+this.secondNumber;
		return result;
	}
	
	public double getSubtractNumber() {
		return this.secondNumber-this.firstNumber;
	};
	
	public double getMultiplicationResult () {
		return this.firstNumber*this.secondNumber;
	}
	
	public double getDivisionResult () {
		if(this.secondNumber!=0) {
			return this.firstNumber/this.secondNumber;
		}
	return 0;	
	}
}
