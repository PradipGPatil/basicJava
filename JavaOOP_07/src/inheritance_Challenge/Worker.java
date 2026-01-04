package inheritance_Challenge;

public class Worker {

	private String name;
	private String birthDate;
	private String endDate;
	
	public Worker(String name, String birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;

	}
	
	public int getAge() {
		// 
		int currentYear=2026;
		// 22-12-1995
		int birthYear=Integer.parseInt(birthDate.substring(6));
		return currentYear-birthYear;
	}
	
	public double getCollectPay() {
		return 0.0;
	}
	
	public void terminate(String endDate) {
		this.endDate=endDate;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
	}
	
	
}
