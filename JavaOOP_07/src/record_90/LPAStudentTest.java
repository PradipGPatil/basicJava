package record_90;

import pojo_89.Student;

public class LPAStudentTest {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			LPAStudent s=new LPAStudent("S-123"+i,
					
					switch(i)
					{
					case(1)->"Test 1";
					case(2)->"Test 2";
					case(3)->"Test 3";
					case(4)->"Test 4";
					case(5)->"Test 5";
					default->"Anonymous";
					}
					,"22-12-88","java masterclass");
			// here we do not need to use tostring method. java when pass 's' implicity execute to string method 
			// as this class has to string method on Student class
			
			System.out.println(s);
		}
		
		
		Student pojoStudent=new Student("1", "studen one", "10-10-2000", "java masterclass");
		LPAStudent recordStudent=new LPAStudent("2", "lpa student 1", "12-12-2010", "jave guid");
		
		System.out.println(pojoStudent);
		System.out.println(recordStudent);
		
		pojoStudent.setClassList(pojoStudent.getClassList() + "java exam ");
		
		// record does not have setter method we can only pass the value as argument for the record
//		recordStudent.setClassList(recordStudent.classList() + "java exam ");
		
		
		// getting the data from the class
		System.out.println(pojoStudent.getName() + " is taking "+pojoStudent.getClassList());
		
		System.out.println(recordStudent.name() + " is taking "+recordStudent.classList());
	}
}
