package polymerPhism;

public class Movies {
	
	private String title;
	
	public Movies(String title) {
		this.title=title;
	}
	
	public void watchMovies() {
		String instanceType=this.getClass().getSimpleName();
		System.out.println(title + " is a "+ instanceType+" film");
	}
	
	public static Movies getMovies(String types, String title) {
		return switch(types.toUpperCase().charAt(0)) {
		case 'A'-> new Adventure(title);
		case 'C' -> new Commedy(title);
		case 'S'-> new ScienceFiction(title);
		default->new Movies(title);
		};
	}

}

class Adventure extends Movies{

	public Adventure(String title) {
		super(title);
	}

	@Override
	public void watchMovies() {
		// TODO Auto-generated method stub
		super.watchMovies();
		System.out.printf(".. %s %n".repeat(3),
				"Please sense",
				"Scary music ",
				"Something bad happen");
	}
	
	public void watchAdventure() {
		System.out.println(" watching the adventure ");
	}
}


class Commedy extends Movies{

	public Commedy(String title) {
		super(title);
	}

	@Override
	public void watchMovies() {
		// TODO Auto-generated method stub
		super.watchMovies();
		System.out.printf(".. %s %n".repeat(3),
				"Something funny happen",
				"new somethinf funny here",
				"Happy ending");
	}
	
	public void watchComedy() {
		System.out.println(" watching the Comdey ");
	}

	
	
}


class ScienceFiction extends Movies{

	public ScienceFiction(String title) {
		super(title);
	}

	@Override
	public void watchMovies() {
		// TODO Auto-generated method stub
		super.watchMovies();
		System.out.printf(".. %s %n".repeat(3),
				"Bad aliance",
				"nchagne aliance",
				"end");
	}
	
	public void watchScienceFiction() {
		System.out.println(" watching the Science fiction ");
	}

	
}

