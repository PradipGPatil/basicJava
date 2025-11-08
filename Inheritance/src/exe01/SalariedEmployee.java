package exe01;

public class SalariedEmployee extends Employee {

	private double anualSalary;
	private boolean isRetire;

	public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate,
			double anualSalary, boolean isRetire) {
		super(name, birthDate, endDate, employeeId, hireDate);
		this.anualSalary = anualSalary;
		this.isRetire = isRetire;
	}

	public void isRetire() {
		System.out.println(" is employee is " + isRetire);
	}
}
