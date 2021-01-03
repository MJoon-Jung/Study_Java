package oop;

public class TimeTest {

	public static void main(String[] args) {
	
		Time t= new Time();
//		t.hour = 25;
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(25);
		System.out.println(t.getHour());
	}

}
class Time{
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(isValidHour(hour))
			return;
		this.hour = hour;
	}
	private boolean isValidHour(int hour) {
		return hour > 23 || hour < 0;
	}
	public int getHour() {
		return hour;
	}
}