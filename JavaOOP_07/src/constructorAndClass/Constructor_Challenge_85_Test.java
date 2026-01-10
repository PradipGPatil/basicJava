package constructorAndClass;

public class Constructor_Challenge_85_Test {
	
	public static void main(String[] args) {
		Construtor_Challenge_85 test=new Construtor_Challenge_85("tim",999.99,"tim@gmail.com");
		System.out.println(test.getCreditLimit());
		System.out.println(test.getEmail());
		System.out.println(test.getName());
		
		
		Construtor_Challenge_85 test2=new Construtor_Challenge_85("test2", "test2@gmail.com");
		System.out.println(test2.getCreditLimit());
		System.out.println(test2.getEmail());
		System.out.println(test2.getName());
		
		Construtor_Challenge_85 test3=new Construtor_Challenge_85();
		System.out.println(test3.getCreditLimit());
		System.out.println(test3.getEmail());
		System.out.println(test3.getName());
		
		
	}

}
