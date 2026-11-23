package javaGeneric;

import java.util.ArrayList;
import java.util.List;

record Affiliation(String name,String type, String countryCode) {

	@Override
	public String toString() {
		return name + "( " +type + " in  "+countryCode + " )";
	}
	
	
};

// for this generic method , parameter should be type of Players or subtype of players
// notice we used extends instead of implement for interface
public class Team<T extends Players ,S > {
	
	private String teamName;
	private List<T> teamMembers=new ArrayList<>();

	private int totalLossess=0;
	private int totalTies=0;
	private int totalWins=0;
	
	private S affiliation;
	
	
	public Team(String teamName) {
		super();
		this.teamName = teamName;
	}
	
	
	
	
	public Team(String teamName, S affiliation) {
		super();
		this.teamName = teamName;
		this.affiliation = affiliation;
	}




	public void addTeamMember(T player) {
		if(!teamMembers.contains(player)) {
			teamMembers.add(player);
		}
	}
	
	public void listTeamMembers() {
		System.out.print(teamName + " Roster :");
		System.out.println(affiliation==null?"":"affiliation : "+ affiliation);
		for(T t: teamMembers) {
			System.out.println(t.name());
		}
	}

	public int ranking() {
		return (totalLossess*2)+totalTies +1;
	}
	
	public String setScore(int ourScore, int theirScore) {
		String message="Lost to";
		if(ourScore>theirScore) {
			totalWins++;
			message="beat";
		}
		else if (ourScore==theirScore) {
			totalTies++;
			message="Ties";
			
		}
		else {
			totalLossess++;
			message="Lost";
		}
		return message;
	}

	@Override
	public String toString() {
		return teamName +"( Ranked "+ranking() +" )"; 
	}
	
	
	
}
