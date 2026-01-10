package enumpackage;



public class EnumTest {
	
	public static void main(String[] args) {
		DaysOfWeek weekDays=DaysOfWeek.TUE;
		System.out.println(weekDays);
		
		System.out.printf("Name is %s ,Ordinal value =%d%n",weekDays.name(),weekDays.ordinal());
	}

}
