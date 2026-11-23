package constructorAndClass;

public class Bank_82 {
	
	private String accountNumber;
	
	// instead of int here better to use double because balance should be real number
	private double accountBalance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public String getCustomerName() {
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
	
	public void setAccountBalance(double accountBalance) {
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
	
	public void depositFund(double depositAmount) {
		if(depositAmount <0) return;
		accountBalance+=depositAmount;
		System.out.println(" Total balance is =>" +accountBalance);
	}
	
	public void withDrawFund(double withDrawAmount) {
		if(accountBalance-withDrawAmount <0) {
			System.out.println("your withdraw amount is $" + withDrawAmount + " but you balance is $"+accountBalance);
		}
		else {
			accountBalance-=withDrawAmount;
			System.out.println("Amount withdrew  "+withDrawAmount+" successfully Your remaing balance is "+ accountBalance);
		}
	}
}
