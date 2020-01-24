package data;

public class Player {
	
	
	private String firstname ;
	private String name; 
	private int age ;
	private double scorePlayer ;
	
	

	public Player(String firstname, String name, int age, double scorePlayer) {
		super();
		this.firstname = firstname;
		this.name = name;
		this.age = age;
		this.scorePlayer= scorePlayer;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public double getScorePlayer() {
		return scorePlayer;
	}

	public void setScorePlayer(double scorePlayer) {
		this.scorePlayer = scorePlayer;
	}
	
	
	

}
