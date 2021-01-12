package yjp.OOP;

public class Point {
	private int x;
	private int y;
	
	Point(){
		this(0,0);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x : "+ x + " y : "+y;
	}
}
