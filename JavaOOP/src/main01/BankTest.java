package main01;

public class BankTest {

	public static void main(String[] args) {
		
		// here we do not provide the constuctore to bank java implemcity create the construceto
		// if we provide constructor java will not override the constructore
		
//	Bank bank=new Bank();
//		Bank bank=new Bank("12345", 100, "test1@gmail.com", "pradip", "12324");
		Bank bank=new Bank("threeName", "threeEmail", "333");
		System.out.println("name "+ bank.getName()+ " email "+bank.getEmail()+" number "+bank.getAccountNumber());
	
		bank.setAccountNumber("12345");
		bank.setBalance(100);
		bank.setEmail("test1@gmail.com");
		bank.setName("pradip");
		bank.setPhoneNumber("12323");
		
		bank.depositeFund(100);
		bank.withdrawFund(50);
		System.out.println(bank.getBalance());
	}
}
