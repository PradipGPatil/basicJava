package objectClass_94;



public class Test extends Object {
	public static void main(String[] args) {
		Student max=new Student("max",29);
		System.out.println(max.toString()); // Student@24d46ca6 where student is class name and after @ is haxcode
		// java call implecitly to string method
		System.out.println(max);
		
		PrimarySchoolStudent jimmy=new PrimarySchoolStudent("Jimmy", 8, "james");
		System.out.println(jimmy);
	}
}


class Student{
	
	private String name;
	private int age;
	
	Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return name + " is "+age;
	}

}


class PrimarySchoolStudent extends Student{
	private String parentName;
	
	 PrimarySchoolStudent(String name, int age, String parentName) {
		super(name,age);
		this.parentName=parentName;
	}
	 
		@Override
		public String toString() {
			return parentName +"s kids " + super.toString();
		}
}
