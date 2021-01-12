package yjp.OOP;

public class Circle {
	private Point center;
	private int radius;
	
	public Circle() {
		this(new Point(),0);
	}
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	public String toString() {
		return center+ " radius : " + radius;
	}
}
