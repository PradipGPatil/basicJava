package exe01;

import java.time.LocalDate;
import java.time.Period;

public class Test {

	public static void main(String[] args) {
		Employee1 e=new Employee1("Tim", "11/01/1997", "10/10/2010");
		System.out.println(e);
		
		System.out.println("Tim age "+e.getAge());
		System.out.println("pay "+e.getCollectPay());
		
		SalariedEmployees joe=new SalariedEmployees("joe", "01/01/1900", "01/01/2010", 	3500);
		System.out.println(joe);
		System.out.println("joe's paycheck  $"+joe.getCollectPay());
		
		joe.retire();
		System.out.println("joe`s pension check "+joe.getCollectPay());
	
	}
}
