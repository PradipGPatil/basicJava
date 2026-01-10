package constructorAndClass;

public class ConstructorChaining_84_Test {
	
	public static void main(String[] args) {
//		ConstructorChaining_84 bank=new ConstructorChaining_84();
//		bank.setAccountBalance(10000);
//		bank.setAccountNumber("8888");
//		bank.setCustomerName("Mickal");
//		bank.setEmail("abc@gmail.com");
//		bank.setPhoneNumber("123456789");
		
	//	ConstructorChaining_84 bank=new ConstructorChaining_84("8888", 100000, "Mickal", "abc@gmail.com", "123456789");
		ConstructorChaining_84 bank=new ConstructorChaining_84();
		
		System.out.println(bank.getAccountBalance());
		System.out.println(bank.getAccountNumber());
		bank.depositFund(1000);
		bank.withDrawFund(100);
		bank.withDrawFund(2000);
		bank.depositFund(10);
		bank.withDrawFund(110);
		
		
		ConstructorChaining_84 timAccount=new ConstructorChaining_84("5555", 1000, "test customer");
		System.out.println(" here is another customer =  > "+ timAccount.getAccountNumber());
		timAccount.depositFund(500);
		timAccount.withDrawFund(300);
	}

}
