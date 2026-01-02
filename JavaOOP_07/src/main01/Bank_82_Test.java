package main01;

public class Bank_82_Test {
	
	public static void main(String[] args) {
		Bank_82 bank=new Bank_82();
		
		bank.setAccountBalance(10000);
		bank.setAccountNumber("8888");
		bank.setCustomerName("Mickal");
		bank.setEmail("abc@gmail.com");
		bank.setPhoneNumber("123456789");
		
		bank.depositFund(1000);
		bank.withDrawFund(100);
		bank.withDrawFund(2000);
		bank.depositFund(10);
		bank.withDrawFund(110);
		
	}

}
