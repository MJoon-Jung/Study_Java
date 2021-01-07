package yjp;

public class Bus {
	private int speed;
	private String direction;
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	public void turn(String direction) {
		this.direction = direction;
	}
	public String getDirection() {
		return direction;
	}
}
