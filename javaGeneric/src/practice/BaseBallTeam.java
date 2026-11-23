package practice;

import java.util.ArrayList;
import java.util.List;

public class BaseBallTeam {

	private String teamName;
	private List<BaseBallPlayer> teamMember=new ArrayList<>();
	private int totalWins=0;
	private int totalLoss=0;
	private int totalTies=0;
	
	public BaseBallTeam(String teamName) {
		this.teamName = teamName;
	}
	
	public void addTeamMember(BaseBallPlayer player) {
		if (!teamMember.contains(player)) {
			teamMember.add(player);
		}

	}
	
	public void listTeamMember() {
		// TODO Auto-generated method stub

		System.out.println();
		System.out.println(teamName+ " Roaster");
		System.out.println(teamMember);
		
	}
	
	public int 	ranking() {
		return (totalLoss*2)+totalTies+1;
	}
	
	public String setScore(int ourScroe, int theirScore) {
		// TODO Auto-generated method stub

		String message=" losss to ";
		if (ourScroe>theirScore) {
			totalWins++;
			message=" Beat ";
		}
		else if (ourScroe== theirScore) {
			totalTies++;
			message=" Tied";
			
		}
		else {
			totalLoss++;
		}
		return message;
	}

	@Override
	public String toString() {
		return teamName + " (Ranked " + ranking() + ")";
	}
	
	
} 

