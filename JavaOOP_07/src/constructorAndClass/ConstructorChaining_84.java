package constructorAndClass;

public class ConstructorChaining_84 {
	
	// we can overload the constructore like we overload the method
	public ConstructorChaining_84() {
		this("111",5000,"default name","defaultEmail","defaultPhoneNumber");
		System.out.println("default constructore is being called !!");
	}
	
	public ConstructorChaining_84(String accountNumber, int accountBalance, String customerName,
			String userEmail, String phoneNumber) {
		System.out.println("parameterized construtore is being called ");
		
		//setAccountNumber(accountNumber);
		// it generally good practice to set value directly in construnctor instead of calling setter method
		// their migh changes that set method might not set the value 
		this.accountNumber=accountNumber;
		this.accountBalance=accountBalance;
		this.customerName=customerName;
		userEmail=email;
		this.phoneNumber=phoneNumber;
	}
	
	
	
	public ConstructorChaining_84(String accountNumber, int accountBalance, String customerName) {
		this(accountNumber,accountBalance,customerName,"zz@gmail.com","2343234");
//		super();
//		this.accountNumber = accountNumber;
//		this.accountBalance = accountBalance;
//		this.customerName = customerName;
	}



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
		System.out.println(" you have deposited $"+depositAmount+" The total  balance is =>" +accountBalance);
	}
	
	public void withDrawFund(int withDrawAmount) {
		if(accountBalance-withDrawAmount <0) {
			System.out.println("Your withdrwa amount is "+ withDrawAmount + " but you have total balance "+accountBalance +""
					+ "balance is low !!"
					);
		}
		else {
			accountBalance-=withDrawAmount;
			System.out.println("Your remaing balance is "+ accountBalance+ " withdraw amount is =>"+ withDrawAmount);
		}
	}
}
