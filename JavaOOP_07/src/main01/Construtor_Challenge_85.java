package main01;

public class Construtor_Challenge_85 {
	
	private String name;
	private double creditLimit;
	private String email;
	
	
	
	public Construtor_Challenge_85(String name, double creditLimit, String email) {
		super();
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public Construtor_Challenge_85() {
		this("defaultName",500,"default@gmail.com");
	}
	


	public Construtor_Challenge_85(String name, String email) {
		this(name,00,email);
	}

	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmail() {
		return email;
	}
	
	

}
