package constructorAndClass;

public class Bank_82_Test {
	
	public static void main(String[] args) {
		Bank_82 bank=new Bank_82();
		
		
		// try to withdraw more amount than you currnet balance
		bank.setAccountBalance(100);
		bank.withDrawFund(200);

		bank.setAccountNumber("999");
		bank.setCustomerName("Tim");
		bank.setEmail("testemail@com");
		bank.setPhoneNumber("123456789");
		
		
		
		System.out.println(bank.getAccountNumber());
		System.out.println(bank.getEmail());
		System.out.println(bank.getPhoneNumber());
		System.out.println(bank.getCustomerName());
		System.out.println(bank.getAccountBalance());
		
		// withdraw amount less than 
		bank.withDrawFund(55.55);
		System.out.println(bank.getAccountBalance());
		
		
	}

}
