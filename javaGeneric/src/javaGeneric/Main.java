package javaGeneric;

// the reason to add empty interface is Record can not extends the class but can implement interface
interface Players {
	
	// added public static name abstract method
	String name();
};

record BaseBallPlayer(String name, String position) implements Players {
}


record FootBallPlayer(String name, String position) implements Players {
}


record VollyBallPlayer(String name, String position) implements Players {
}

public class Main {

	public static void main(String[] args) {
		
		var ind= new Affiliation("City", "Mumbai", "US");
		

		BaseBallTeam india1 = new BaseBallTeam("Team India");
		BaseBallTeam aus1 = new BaseBallTeam("Team Austrilia");
		scroe(india1, 3, aus1, 5);

		SportTeam india2 = new SportTeam("Team India");
		SportTeam aus2 = new SportTeam("Team Austrilia");
		scroe(india2, 3, aus2, 5);
		
		Team <BaseBallPlayer,Affiliation>india = new Team<>("Team India",ind);
		Team <BaseBallPlayer,Affiliation> aus = new Team<>("Team Austrilia");
		scroe(india, 3, aus, 5);

		var rahul = new BaseBallPlayer("B rahul", "Right filder");
		var marsh = new BaseBallPlayer("S marsh", "Right filer");
		india.addTeamMember(rahul);
		india.addTeamMember(marsh);
		var dk=new BaseBallPlayer("Dk", "center forwaard");
		india.addTeamMember(dk);
		india.listTeamMembers();
		
		// here we have sport team which take 'Player as interface'
		// but the probleam is we can add football player or hollyball player. since both implement the 
		// same interface so we does not have type check here
		SportTeam afc1=new SportTeam("Adelade crow");
		Team<FootBallPlayer,Affiliation> afc=new Team<>("Adelade crow");
		var txt=new FootBallPlayer("tex walker", "centerHalf forward");
		
		//var dk=new BaseBallPlayer("Dk", "center forwaard");
		// due to generic it will not allow to add baseballplayer in footballplayer 
		//afc.addTeamMember(dk);
		
		var fin=new FootBallPlayer("fin alen", "mid field");
		
		afc.addTeamMember(txt);
		afc.addTeamMember(fin);
		afc.listTeamMembers();
		
		// here our generic class with working with any type of parameter
//		Team<String> s1=new Team<String>("String name");
//		s1.addTeamMember("member name");
//		s1.listTeamMembers();
//		
//		Team<String> s2 =new Team<String>("String name 2");
//		s2.addTeamMember("member name 2");
//		s2.listTeamMembers();
//		
//		scroe(s1, 4, s2, 2);
//		
		// we can not use generic class with primitive data type. we need to use Integer class here
	//	Team<Integer> i1=new Team<>("Int team");
		
		// so we created generic call Team to overcome sport team drawback
		Team<VollyBallPlayer,Affiliation> s1=new Team<>("String name");
		s1.addTeamMember(new VollyBallPlayer("V1 player", "front"));
		s1.listTeamMembers();
		
		Team<VollyBallPlayer,Affiliation> s2 =new Team<>("String name 2");
		s2.addTeamMember(new VollyBallPlayer("V2 player", "mid"));
		s2.listTeamMembers();
		
		scroe(s1, 4, s2, 2);
		

	}

	public static void scroe(BaseBallTeam team1, int t1_scroe, BaseBallTeam team2, int t2_score) {
		// TODO Auto-generated method stub
		String message = team1.setScore(t1_scroe, t2_score);
		team2.setScore(t2_score, t1_scroe);
		System.out.printf("%s %s %s %n", team1, message, team2);

		/*
		 * The ranking formula used in the ranking() method of the BaseballTeam class
		 * calculates the ranking position based on the number of losses and ties. The
		 * number of wins is not used in the calculation. The formula return (losses *
		 * 2) + ties + 1 calculates the ranking position by assigning a score of 2 for
		 * each loss and adding it to the number of ties, and then adding 1 to the final
		 * result.
		 * 
		 * For example, if a team has 2 wins, 3 losses, and 1 tie, the ranking position
		 * is calculated as follows:
		 * 
		 * - Losses: 3 losses * 2 = 6
		 * 
		 * - Ties: 1 tie
		 * 
		 * - Total score: 6 + 1 = 7
		 * 
		 * - Ranking position: 7 + 1 = 8
		 * 
		 * So, the team's ranking position is 8.
		 * 
		 * Regarding the printf statement, the first %s refers to the team1 object, and
		 * team1.toString() is called to convert the team1 object to a string. The
		 * second %s refers to the message returned from the setScore method. The third
		 * %s refers to the team2 object, and team2.toString() is called to convert the
		 * team2 object to a string. The rankings of the two teams are calculated
		 * independently based on their respective number of losses and ties. The team
		 * with fewer losses and more ties will have a better ranking position.
		 */

	}

	public static void scroe(SportTeam team1, int t1_scroe, SportTeam team2, int t2_score) {
		// TODO Auto-generated method stub
		String message = team1.setScore(t1_scroe, t2_score);
		team2.setScore(t2_score, t1_scroe);
		System.out.printf("%s %s %s %n ", team1, message, team2);
	}
	
	public static void scroe(Team team1, int t1_scroe, Team team2, int t2_score) {
		// TODO Auto-generated method stub
		String message = team1.setScore(t1_scroe, t2_score);
		team2.setScore(t2_score, t1_scroe);
		System.out.printf("%s %s %s %n ", team1, message, team2);
	}
}
