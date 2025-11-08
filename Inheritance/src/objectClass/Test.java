package objectClass;


// this class by defulat extends the Object class
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s=new Student("max", 21);
		System.out.println(s.toString());
		// Student@49097b5d to string method print name of the class and haxcode unique to the object
		// so we are going to override toString method

		// jave implecitly call to string method here
		System.out.println(s);
		
		PrimaryStudent jimmay=new PrimaryStudent("jimmy", 8, "Carloes");
		System.out.println(jimmay);
	}

}

class Student{
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public String toString() {
//		return "Student [name=" + name + ", age=" + age + "]";
		
		return name+" is age "+age;
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
	

}

class PrimaryStudent extends Student{
	private String parentName;
	
	public PrimaryStudent(String name, int age, String parentName) {
		// TODO Auto-generated constructor stub
		
		super(name, age);
		this.parentName=parentName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return parentName+" s Kid" + super.toString();
	}
}