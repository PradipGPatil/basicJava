package main01;

public class TestConstructorChallange {

	public static void main(String[] args) {
		ConstructorChallange c = new ConstructorChallange();
		System.out.println(" name " + c.getName() + " email " + c.getEmailAddress() + " credit " + c.getCreditName());

		ConstructorChallange c2 = new ConstructorChallange("pradip", "pradi@email");
		System.out
				.println(" name " + c2.getName() + " email " + c2.getEmailAddress() + " credit " + c2.getCreditName());

		ConstructorChallange c3 = new ConstructorChallange("3Name", "3credit", "3email");
		System.out
				.println(" name " + c3.getName() + " email " + c3.getEmailAddress() + " credit " + c3.getCreditName());

	}
}
