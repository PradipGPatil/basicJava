package practice;

record BaseBallPlayer(String name, String position) {}
public class Main {

	public static void main(String[] args) {
		
		BaseBallTeam team1= new BaseBallTeam("TEAM A");
		BaseBallTeam team2= new BaseBallTeam("Team B");
		
		scoreResult(team1, 3, team2, 5);
		
		
		var player1=new BaseBallPlayer("Player 1", "right hand batman");
		var player2= new BaseBallPlayer("Player 2", "Right hand batsman");
		
		team1.addTeamMember(player1);
		team1.addTeamMember(player2);
		team1.listTeamMember();
	};
	
	public static void scoreResult(BaseBallTeam team1, int t1_score,
									BaseBallTeam team2, int t2_score
									) {
		String message= team1.setScore(t1_score, t2_score);
		team2.setScore(t2_score, t1_score);
		System.out.printf("%s %s %s ", team1 , message , team2);
		
	}
}
