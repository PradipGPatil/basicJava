package enumpackage;

import java.util.Random;

public class EnumTest {
	
	public static void main(String[] args) {
		DaysOfWeek weekday=DaysOfWeek.TUE;
		System.out.println(weekday);
		
		System.out.printf("Name is %s ,Ordinal value =%d%n",weekday.name(),weekday.ordinal());
		
		for (int i=0;i<10;i++) {
			weekday=getRandomDay();
		}
		switchDayOfWeek(weekday);
		
		for(Topping topping: Topping.values()) {
			System.out.println(topping.name()+ " : "+ topping.getPrice());
		}
	}
	
	public static DaysOfWeek getRandomDay() {
		int randomeInteger=new Random().nextInt(7);
		var allDays=DaysOfWeek.values();		// values() method return array containing all element in enum
		return allDays[randomeInteger];
	}
	
	public static void switchDayOfWeek(DaysOfWeek weekDay) {
		int weekDayInteger=weekDay.ordinal()+1;
		switch(weekDay) {
		case WED-> System.out.println(" Wednesday is day "+ weekDayInteger);
		case SAT-> System.out.println(" Saturday is Day "+ weekDayInteger);
		default -> System.out.println(weekDay.name().charAt(0)+
				weekDay.name().substring(1).toLowerCase() + 
				" day is day "+ weekDayInteger
				);
		}
	}

}
