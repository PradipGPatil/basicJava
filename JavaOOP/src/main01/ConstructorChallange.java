package main01;

public class ConstructorChallange {
	private String name;
	private String creditName;
	private String emailAddress;

	public ConstructorChallange(String name, String creditName, String emailAddress) {
		this.name = name;
		this.creditName = creditName;
		this.emailAddress = emailAddress;

	}

	public ConstructorChallange() {
		this("default name","111","defaul email");
	}

	public ConstructorChallange(String name, String emailaddress) {
		this(name, "123", emailaddress);
	}

	public String getName() {
		return this.name;
	}

	public String getCreditName() {
		return this.creditName;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}
}
