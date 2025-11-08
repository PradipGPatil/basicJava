package exe01;

public class SalariedEmployees extends Employee1 {

	double AnualSalary;
	boolean isRetired;
	
	// we did not add isRetired in constructor
	public SalariedEmployees(String name, String birthDate, String hireDate, double anualSalary) {
		super(name, birthDate, hireDate);
		AnualSalary = anualSalary;
		
	}
	
	@Override
	public double getCollectPay() {
		double paycheck=AnualSalary/26;
		double adjPaycheck=(isRetired)?0.9*paycheck:paycheck;
		return (int)adjPaycheck;
		
	}
	
	public void retire() {
		terminate("12/12/2025");
		isRetired=true;
	}
	
}
