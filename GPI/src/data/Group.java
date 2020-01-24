package data;

import java.util.ArrayList;

public class Group {
	
	private static ArrayList<Team> groupA;


	private static ArrayList<Team> groupB;
	private static ArrayList<Team> groupC;
	private static ArrayList<Team> groupD;

	private static ArrayList<Team> groupE;
	private static ArrayList<Team> groupF;
	private static ArrayList<Team> groupG;
	private static ArrayList<Team> groupH;
	
	public Group () {
		groupA= new ArrayList<Team>();
		groupB= new ArrayList<Team>();
		groupC= new ArrayList<Team>();
		groupD= new ArrayList<Team>();

		groupE= new ArrayList<Team>();
		groupF= new ArrayList<Team>();
		groupG= new ArrayList<Team>();
		groupH= new ArrayList<Team>();

	}
	
	public static ArrayList<Team> getGroupA() {
		return groupA;
	}

	public static ArrayList<Team> getGroupB() {
		return groupB;
	}

	public static ArrayList<Team> getGroupC() {
		return groupC;
	}

	public static ArrayList<Team> getGroupD() {
		return groupD;
	}

	public static ArrayList<Team> getGroupE() {
		return groupE;
	}

	public static ArrayList<Team> getGroupF() {
		return groupF;
	}

	public static ArrayList<Team> getGroupG() {
		return groupG;
	}

	public static ArrayList<Team> getGroupH() {
		return groupH;
	}
	


}
