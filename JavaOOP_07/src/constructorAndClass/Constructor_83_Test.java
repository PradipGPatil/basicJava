package constructorAndClass;

public class Constructor_83_Test {
	
	public static void main(String[] args) {
//		Bank_83 bank=new Bank_83();
//		bank.setAccountBalance(10000);
//		bank.setAccountNumber("8888");
//		bank.setCustomerName("Mickal");
//		bank.setEmail("abc@gmail.com");
//		bank.setPhoneNumber("123456789");
		
		Constructor_83 bank=new Constructor_83("8888", 100000, "Mickal", "abc@gmail.com", "123456789");
		
		bank.depositFund(1000);
		bank.withDrawFund(100);
		bank.withDrawFund(2000);
		bank.depositFund(10);
		bank.withDrawFund(110);
		
	}

}
