package javaGeneric168;

import java.util.ArrayList;
import java.util.List;

public class SportTeam {
	
	// handle only baseBallTeam
	private String teamName;
	private List<Player> teamMemberName= new ArrayList<>();
	private int totalWins=0;
	private int totalLossess=0;
	private int totalTies=0;
	
	public SportTeam(String teamName) {
		super();
		this.teamName = teamName;
	}
	
	
	public void addTeamMember(Player player) {
		if(!teamMemberName.contains(player)) {
			teamMemberName.add(player);
		}
	}
	
	public void listTeamMember() {
		System.out.println(teamName + " Roaster");
		System.out.println(teamMemberName);
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
