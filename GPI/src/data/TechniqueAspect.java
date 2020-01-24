package data;

public class TechniqueAspect {
	

	private double finition; 
	private double speed ;
	private double shotStopped;
	private double aggressiveness;
	
	public TechniqueAspect(double finition, double speed, double shotStopped, double aggressiveness) {
	super();
	this.finition = finition;
	this.speed = speed;
	this.shotStopped = shotStopped;
	this.aggressiveness = aggressiveness;
	}

	public double getFinition() {
		return finition;
	}

	public void setFinition(double finition) {
		this.finition = finition;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getShotStopped() {
		return shotStopped;
	}

	public void setShotStopped(double shotStopped) {
		this.shotStopped = shotStopped;
	}

	public double getAggressiveness() {
		return aggressiveness;
	}

	public void setAggressiveness(double aggressiveness) {
		this.aggressiveness = aggressiveness;
	}
	
	

}
