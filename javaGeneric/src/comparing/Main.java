package comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Integer five=5;
		Integer [] other= {0,5,10,-50, 50};
		
		for (Integer i : other) {
			int val=five.compareTo(i);
			System.out.printf("%d %s %d compareTo = %d %n",five,
					(val==0? " == ":(val <0 ? " < ": " > ")), i,val
					);
		}
		
		String banana="banana";
		String [] fruit= {"apple","banana","pear", "BANANA"};
		
		for (String s : fruit) {
			int val=banana.compareTo(s);
			
			System.out.printf("%s %s %s compareTo = %d %n ", banana,
			
			(val==0? "== ":(val<0 ? " < ":" > ")), s,val
			);
		}
		
		Arrays.sort(fruit);
		System.out.println(Arrays.toString(fruit));
		
		System.out.println( " A :" + (int)'A' + " " + " a: "+(int)'a');
		System.out.println( " B :" + (int)'B' + " " + " b: "+(int)'b');
		System.out.println( " P:" + (int)'P' + " " + " p: "+(int)'p');
		
		Student tim=new Student("Tim");
		Student [] students= {
				new Student("Zach"), new Student("Tim"),new Student("Ann")
		};
		
		
		// here arrays.sort method give error because we can not sort student which is not implementing comprable interface	
		Arrays.sort(students);
		System.out.println(Arrays.toString(students));
		
		System.out.println("result : "+tim.compareTo(new Student("TIM")));
		
		Comparator< Student> gpaSorter=new StudentGPACompartor();
		Arrays.sort(students, gpaSorter.reversed());
		System.out.println(Arrays.toString(students));
		
	}
}

class StudentGPACompartor implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {
		return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);
	}


}


// in order to use in sort .we have implmented comparabel interface here
class Student implements Comparable<Student>{
	
	String name;
	private static int LAST_ID=1000;
	private static Random random=new Random();
	private int id;
	protected double gpa;
	
	
	public Student(String name) {
		super();
		this.name = name;
		id=LAST_ID++;
		gpa=random.nextDouble(1.0,4.0);
	}

	@Override
	public String toString() {
//		return name;
		return "%d - %s (%.2f)".formatted(id,name,gpa);
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
//		return name.compareTo(o.name);
		return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
	}
//	
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		Student other=(Student) o;
//		return name.compareTo(other.name);
//	}

	
	
	
	
}
