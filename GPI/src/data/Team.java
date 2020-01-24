package data;

import java.util.ArrayList;

public class Team {
	
	
	private String nameTeam; 
	private static ArrayList <Player> team ;
	private double scoreTeam;
	
	

	public Team(String nameTeam, double scoreTeam) {
		super();
		team = new ArrayList<Player>() ;
		this.nameTeam = nameTeam;
		this.scoreTeam = scoreTeam;
	}

	public String getNameTeam() {
		return nameTeam;
	}

	public void setNameTeam(String nameTeam) {
		this.nameTeam = nameTeam;
	}

	public static ArrayList<Player> getTeam() {
		return team;
	}

	public static void setTeam(ArrayList<Player> team) {
		Team.team = team;
	}
	
	public double getscoreTeam() {
		return scoreTeam;
	}

	public void setScoreTeam(double scoreTeam) {
		this.scoreTeam = scoreTeam;
	}
	

}
