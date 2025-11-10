package polymerPhism;

public class NextTes {

	public static void main(String[] args) {
		Movies movies=Movies.getMovies("A", "Jaws");
		movies.watchMovies();
		
		Adventure movies1=(Adventure)Movies.getMovies("A", "Jaws");
		movies1.watchMovies();
		
		// it assume return type is object
		Object comedy=Movies.getMovies("C", "Airplane");
	
		// it try to find getmoves method on object
		//comedy.watchMovies();
		
		Commedy comdeyMoves=(Commedy)comedy;
		comdeyMoves.watchComedy();
		
		var airPlane=Movies.getMovies("A", "Aireplance");
		airPlane.watchMovies();
		
		var plane=new Commedy("Airplacne");
		plane.watchComedy();
		
		Object unknownObject=Movies.getMovies("C", "Airplance");
		if(unknownObject.getClass().getSimpleName()=="Commedy") {
			Commedy c =(Commedy)unknownObject;
			c.watchComedy();
		}
		else if(unknownObject instanceof Adventure) {
			((Adventure)unknownObject).watchAdventure();
		}
		else if(unknownObject instanceof ScienceFiction sys) {
			sys.watchScienceFiction();
		}
	}
}
