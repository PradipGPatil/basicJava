package pojo_89;

public class TestStudent {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			Student s=new Student("S-123"+i,
					
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
		
		
	}

}
