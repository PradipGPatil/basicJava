package genericExtra;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		int studnetCount=10;
		List<Student> students=new ArrayList<>();
		for(int i=0;i<studnetCount;i++) {
			students.add(new Student());
		}
		students.add(new LPAStudent());
	//	printList(students);
		printMoreList(students);
		
		List<LPAStudent> lpaStudents=new ArrayList<LPAStudent>();
		for(int i=0;i<studnetCount;i++) {
			lpaStudents.add(new LPAStudent());
		}
		
		// it will give error message
	//	printList(lpaStudents);
	//	printList(lpaStudents);
		printMoreList(lpaStudents);
		testList( new ArrayList<String>(List.of("able","bary ", "charle")));
		testList(new ArrayList<Integer>(List.of(1, 2, 3)));
	}
	
	//List<Student> students instead of this use row version
	
	
//	private static <T extends Student> void printList(List<T> students) {
//		for (var student: students) {
//			System.out.println(student.getYearStarted() + " : "+ student);
//		}
//		System.out.println();
//	}
	
//  public static void testList(List<String> list) {
//
//      for (var element : list) {
//          System.out.println("String: " + element.toUpperCase());
//      }
//  }
//
//  public static void testList(List<Integer> list) {
//
//      for (var element : list) {
//          System.out.println("Integer: " + element.floatValue());
//      }
//  }
	public static void testList(List<?> list) {
		for(var el: list) {
			if(el instanceof String s) {
				System.out.println("String :" + s.toUpperCase());
			}
			else if(el instanceof Integer i) {
				System.out.println(" Integer : "+i.floatValue());
			}
		}
	}
	private static  void printMoreList(List<? extends Student> students) {
		for (var student: students) {
			System.out.println(student.getYearStarted() + " : "+ student);
		}
		System.out.println();
	}
}


