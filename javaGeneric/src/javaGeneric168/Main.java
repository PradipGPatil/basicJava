package javaGeneric168;

interface Player{};

record BaseBallPlayer(String name,String position) implements Player {};
record FootBallPlayer(String name,String position) implements Player {};

public class Main {
	
	public static void main(String[] args) {

	    SportTeam phillies = new SportTeam("Philadelphia Phillies");
	    SportTeam astros = new SportTeam("Houston Astros");
	    scoreResult(phillies, 3, astros, 5);
	    
	    var harper=new BaseBallPlayer("B Harper", "Right Fielder");
	    var marsh=new BaseBallPlayer("B Marsh", "Right Fielder");
	    phillies.addTeamMember(harper);
	    phillies.addTeamMember(marsh);
	    phillies.listTeamMember();
	    
	    SportTeam afc=new SportTeam("Adelaide Crows");
	    var tex=new FootBallPlayer("Tex Walker", "Center half forward");
	    afc.addTeamMember(tex);
	    
	    // here we do not have type checking we are able to add Baseball player as well footballplayer
	    var guthrie=new BaseBallPlayer("D Guthrie", "Center Fielder");
	    afc.addTeamMember(guthrie);
	    afc.listTeamMember();
	    
	    // so avoid this created Generic call Team
	    System.out.println(" *** *** **");
	    
	    
	    
	    Team<BaseBallPlayer> phillies3 = new Team<>("Philadelphia Phillies 3");
	    Team<BaseBallPlayer> astros3 = new Team<>("Houston Astros 3");
	    scoreResult(phillies3, 3, astros3, 5);
	    
	    var harper3=new BaseBallPlayer("B Harper 3", "Right Fielder 3");
	    var marsh3=new BaseBallPlayer("B Marsh 3", "Right Fielder 3");
	    phillies3.addTeamMember(harper3);
	    phillies3.addTeamMember(marsh3);
	    phillies3.listTeamMember();
	    
	    Team<FootBallPlayer> afc3=new Team<>("Adelaide Crows 3");
	    var tex3=new FootBallPlayer("Tex Walker 3", "Center half forward 3");
	    afc3.addTeamMember(tex3);
	    
	    // while adding gutheri3 it will give compile time error 
//	    var guthrie3=new BaseBallPlayer("D Guthrie 3", "Center Fielder 3");
//	    afc3.addTeamMember(guthrie3);
//	    afc3.listTeamMember();
	}
	
	public static void scoreResult(BaseBallTeam team1, int t1_score,
			   BaseBallTeam team2, int t2_score	) {
		String message=team1.setScore(t1_score, t2_score);
		team2.setScore(t2_score, t1_score);
		System.out.printf("%s %s %s %n ", team1, message, team2);
			}
	
	public static void scoreResult(SportTeam team1, int t1_score,
			SportTeam team2, int t2_score	) {
		String message=team1.setScore(t1_score, t2_score);
		team2.setScore(t2_score, t1_score);
		System.out.printf("%s %s %s %n ", team1, message, team2);
			}
	
	public static void scoreResult(Team team1, int t1_score,
			Team team2, int t2_score	) {
		String message=team1.setScore(t1_score, t2_score);
		team2.setScore(t2_score, t1_score);
		System.out.printf("%s %s %s %n ", team1, message, team2);
			}
}


						
