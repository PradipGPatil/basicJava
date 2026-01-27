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
		
		// to identify test runtime object 
		Object unknownObject=Movies.getMovies("C", "Airplance");
		
		// 1) you can get instance name 
		if(unknownObject.getClass().getSimpleName()=="Commedy") {
			Commedy c =(Commedy)unknownObject;
			c.watchComedy();
		}
		// 2) have instance of method and after that we are casting to the adventure work
		else if(unknownObject instanceof Adventure) {
			((Adventure)unknownObject).watchAdventure();
		}
		// science fiction automatically get cast to scenecefiction we do not need to type case
		else if(unknownObject instanceof ScienceFiction sys) {
			sys.watchScienceFiction();
		}
	}
}
