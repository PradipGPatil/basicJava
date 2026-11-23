package nestedClass;

import java.util.Comparator;

public class Employee {
	
	private int employeeid;
	private String name;
	private int yearStarted;
	
	public static class EmployeeComparator <T extends Employee> implements Comparator<Employee> {
		
		private String sortType;
		
		public EmployeeComparator() {
			this("name");
		}

		public EmployeeComparator(String sortType) {
			super();
			this.sortType = sortType;
		}


		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			if (sortType.equalsIgnoreCase("yearStarted")) {
				return o1.yearStarted-o2.yearStarted;
			}
			return o1.name.compareTo(o2.name);
		}

	}
	

	
	public Employee() {};
	
	public Employee(int employeeid, String name, int yearStarted) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.yearStarted = yearStarted;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "%d %-8s %d".formatted(employeeid, name, yearStarted);

	}
	
	
	

}
