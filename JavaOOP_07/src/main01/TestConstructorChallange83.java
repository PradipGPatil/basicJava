package main01;

public class TestConstructorChallange83 {

	public static void main(String[] args) {
		ConstructorChallange83 c = new ConstructorChallange83();
		System.out.println(" name " + c.getName() + " email " + c.getEmailAddress() + " credit " + c.getCreditName());

		ConstructorChallange83 c2 = new ConstructorChallange83("pradip", "pradi@email");
		System.out
				.println(" name " + c2.getName() + " email " + c2.getEmailAddress() + " credit " + c2.getCreditName());

		ConstructorChallange83 c3 = new ConstructorChallange83("3Name", "3credit", "3email");
		System.out
				.println(" name " + c3.getName() + " email " + c3.getEmailAddress() + " credit " + c3.getCreditName());

	}
}
