package yjp.OOP;

public class Date {
	private int year;
	private int month;
	private int day;
	
	public String toString() {
		return "year : " + year + " month : " + month + " day : " + day;
	}
	public Date() {
		this(1900,1,1);
	}
	public Date(int year) {
		this(year,1,1);
	}
	public Date(int year,int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
}
