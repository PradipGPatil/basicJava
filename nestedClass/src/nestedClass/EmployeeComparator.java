package nestedClass;

import java.util.Comparator;

public class EmployeeComparator <T extends Employee> implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
		
		// suppose we wanted to sort by year
		// return o1.yearStarted-o2.yearstarted
		// as year started is private field which will not be accessible here
		// we have option like either make this fild public or provide the getter emthod
		// but for some reason we do not want to do like this 
	}

}
