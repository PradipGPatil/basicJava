package javaGeneric169;

interface Player{
	String name();  // by default it public and static for interface
};

record BaseBallPlayer(String name,String position) implements Player {};
record FootBallPlayer(String name,String position) implements Player {};

public class Main {
	
	public static void main(String[] args) {
		
		var affiliation=new Affiliation("Team India", "cricket", "IND");
		
		Team<BaseBallPlayer,Affiliation>	team1=new Team<>("Team india",affiliation);
		var sachin=new BaseBallPlayer("sachin", "openner batter");
		var zahir=new BaseBallPlayer("zahir", "boller");
		team1.addTeamMember(sachin);
		team1.addTeamMember(zahir);
		
		team1.listTeamMember();
		
		var team2=new Team<BaseBallPlayer,Affiliation>("Team Australia");
		var headen=new BaseBallPlayer("haden", "opnner batter");
		var bretelee=new BaseBallPlayer("bretelee", "Boller");
		team2.addTeamMember(headen);
		team2.addTeamMember(bretelee);
		team2.listTeamMember();
		
		scoreResult(team1, 2, team2,3);
		
		System.out.println("=========");
		
		// below method will work since we used Tea except type <T> only
//	Team<String> adalide=new Team<>("Addide storm");
//	adalide.addTeamMember("N robet");
//	adalide.listTeamMember();
//	
//	var canberra=new Team<String>("Canberra Heat");
//	canberra.addTeamMember("B Black");
//	canberra.listTeamMember();
//	
//	scoreResult(canberra, 0, adalide, 1);
	    
	    
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


						
