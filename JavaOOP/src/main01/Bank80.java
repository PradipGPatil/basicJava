package main01;

public class Bank80 {

	private String accountNumber;
	private int balance;
	private String name;
	private String email;
	private String phoneNumber;
	
	public Bank80() {
		// this should be our first line in construnction
		// generate we try to avoid calling set or any other method in constuctor
		this("11",11,"aa@aa.com","aa","11");
		System.out.println(" calling default constructore");
	}
	
	// if we want to 3 argument constructore
	public Bank80(String name, String email, String phoneNumber) {
		this("22",22,"22","22@gmail.com","22");
	}

	
	public Bank80(String accountNumber,int balance,String email,String userName,String number) {
		System.out.println("calling parameterized construncto");
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.email=email;
		name=userName;
		phoneNumber=number;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void depositeFund(int amount) {
		this.balance+=amount;
		System.out.println("balance is : "+this.balance);
	}
	public int withdrawFund(int wAmount) {
		
		if(balance-wAmount<0) {
			System.out.println("your amunt is to low");
			return 0;
		}
		System.out.println("remaining balance "+(this.balance-wAmount));
		return this.balance-wAmount;
	}
}
