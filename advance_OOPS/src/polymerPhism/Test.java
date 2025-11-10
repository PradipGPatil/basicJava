package polymerPhism;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Movies movie=new Movies(" star war ");
//		movie.watchMovies();
//		
//		Movies movie1=new Adventure(" star war ");
//		movie1.watchMovies();
		// calling code does need to know diff kind of instance
//		Movies theMovie=Movies.getMovies("Science", "Star war");
//		theMovie.watchMovies();
		Scanner scan=new Scanner(System.in);
		while(true) {
		System.out.println(" Enter type (A for adventure), c for comedy, S for science fiction or Q to quite");	
		String type=scan.nextLine();
		
		if("Qa".contains(type)) {
			break;
		}
		
		System.out.println("Enter movie title ");
		String title=scan.next();
		Movies movies=Movies.getMovies(type, title);
		movies.watchMovies();
		}
		
	}
}
