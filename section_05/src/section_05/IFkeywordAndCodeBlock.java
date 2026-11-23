package section_05;

public class IFkeywordAndCodeBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean gameover=true;
		int score=4000;
		int levelCompleted=5;
		int bonus=100;
		
		if (score<5000 && score >1000) {
			System.out.println("Your score is less than 5000 and grader than 1000");
		}
		else if (score <100) {
			System.out.println("your score is less than 100");
		}
		else {
			System.out.println("Got here");
		}

	}

}
