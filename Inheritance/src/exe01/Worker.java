package exe01;

import java.time.LocalDate;
import java.time.Period;

public class Worker {

	private String name;
	private String birthDate;
	// make as protected to my subclass can use
	protected String endDate;
	
	public Worker() {
		
	}

// while creating employee we do not know the enddate
	public Worker(String name, String birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

	public int getAge() {
		// to get current date in java we have class LocalDate
		int currentYear = 2025;
		// 11/05/1994
		int birthYear = Integer.parseInt(birthDate.substring(6));
		return birthYear - currentYear;

	}

	// this method will be overwrite by subclass
	public double getCollectPay() {
		return 0.0;
	}

	// instead of creating setter method, we created method so subclass and override
	public void terminate(String endDate) {
		this.endDate=endDate;
	}

	// create to string method
	@Override
	public String toString() {
		return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
	}
	

	


}
