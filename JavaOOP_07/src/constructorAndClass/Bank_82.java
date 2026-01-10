package constructorAndClass;

public class Bank_82 {
	
	private String accountNumber;
	
	// instead of int here better to use double because balance should be real number
	private int accountBalance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int getAccountBalance() {
		return accountBalance;
	}
	
	public String customerName() {
		return customerName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	public void setAccountBalance(int accountBalance) {
		this.accountBalance=accountBalance;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	
	public void depositFund(int depositAmount) {
		if(depositAmount <0) return;
		accountBalance+=depositAmount;
		System.out.println(" Total balance is =>" +accountBalance);
	}
	
	public void withDrawFund(int withDrawAmount) {
		if(accountBalance-withDrawAmount <0) {
			System.out.println("Your account balance is low");
		}
		else {
			accountBalance-=withDrawAmount;
			System.out.println("Your remaing balance is "+ accountBalance);
		}
	}
}
