package javaGeneric;

import java.util.ArrayList;
import java.util.List;

public class BaseBallTeam {
	
	private String teamName;
	private List<BaseBallPlayer> teamMembers=new ArrayList<>();

	private int totalLossess=0;
	private int totalTies=0;
	private int totalWins=0;
	
	
	public BaseBallTeam(String teamName) {
		super();
		this.teamName = teamName;
	}
	
	public void addTeamMember(BaseBallPlayer player) {
		if(!teamMembers.contains(player)) {
			teamMembers.add(player);
		}
	}
	
	public void listTeamMembers() {
		System.out.println(teamName + " Roster :");
		System.out.println(teamMembers);
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
		return teamName +"( Ranked "+ranking() +" ) "; 
	}
	
	
	
}
