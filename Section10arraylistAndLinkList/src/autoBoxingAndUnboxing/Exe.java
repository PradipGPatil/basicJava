package autoBoxingAndUnboxing;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transaction) {

	public Customer(String name, double intialDeposite) {
		this(name.toUpperCase(), new ArrayList<Double>(500));
		transaction.add(intialDeposite);

	}
}

public class Exe {

	public static void main(String[] args) {
        Customer bob = new Customer("Bob S", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.addCustomer("Jane A", 500.0);
        System.out.println(bank);

        bank.addTransaction("Jane A", -10.25);
        bank.addTransaction("jane A", -75.01);
        bank.printStatment("Jane a");

        bank.addCustomer("bob s", 25);
        bank.addTransaction("Bob S", 100);
        bank.printStatment("Bob S");
	}
}

class Bank {

	private String name;
	private ArrayList<Customer> customers = new ArrayList<Customer>();

	public Bank(String name) {
		this.name = name;
	}

	public Customer getCustomer(String customerName) {
		for (Customer customer : customers) {
			if (customer.name().equalsIgnoreCase(customerName)) {
				return customer;
			}

		}
		System.out.printf(" customer (%s) was not found %n ", customerName);
		return null;
	}

	
	public void addCustomer(String customerName, double initialDeposite) {
		
		if(getCustomer(customerName)==null) {
			Customer customer=new Customer(customerName, initialDeposite);
			customers.add(customer);
			System.out.println("new customer is add "+customer.name());
		}
	}
	
	public void addTransaction(String name, double transactionAmount) {
		Customer customer=getCustomer(name);
		if(customer!=null) {
			customer.transaction().add(transactionAmount);
		}
	}
	
	public void printStatment(String customerName) {
		Customer customer=getCustomer(customerName);
		
		if(customer==null) {
			return;
		}
		
		System.out.println("-".repeat(30));
		System.out.println(" customer Name "+customer.name());
		System.out.println("transaction ");
		
		for (double d: customer.transaction()) {
			System.out.printf("$%10.2f (%s) %n", d,d<0?"debit": "credit");
		}
		
		
	}
}