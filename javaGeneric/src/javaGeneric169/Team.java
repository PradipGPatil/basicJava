package javaGeneric169;

import java.util.ArrayList;
import java.util.List;
record Affiliation(String name,String type, String countyCode) {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " ( " + type + "  ) " + "in " + countyCode;
	}
	
	
}

public class Team<T extends Player,S> {
	
	// handle only baseBallTeam
	private String teamName;
	private List<T> teamMemberName= new ArrayList<>();
	private int totalWins=0;
	private int totalLossess=0;
	private int totalTies=0;
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



	public void addTeamMember(T t) {
		if(!teamMemberName.contains(t)) {
			teamMemberName.add(t);
		}
	}
	
	public void listTeamMember() {
		System.out.print(teamName + " Roaster => ");
		System.out.println(affiliation==null? " ": "affliation => "+affiliation);
		// consider the scenario , i just wanted to print name of the player only 
		for(T t : teamMemberName) {
			// below line will give error if our class type paramter does not extend the Player interface
			// by default it will search in global object since we does not have name() method it will give the error
			
			System.out.println(t.name());
		}
	}
	
	public int ranking() {
		return (totalLossess*2)+totalTies+1;
	}
	
	
	public String setScore(int ourScore, int thierScore) {
		String message="lost to ";
		if(ourScore>thierScore) {
			totalWins++;
			message="beat";
		}
		else if (ourScore==thierScore) {
			totalTies++;
			message= " Tied";
		}
		else {
			totalLossess ++;
		}
		return message;
	}


	@Override
	public String toString() {
		return teamName + " ( Ranked "+ranking() + ")";
	}
	
	

}
