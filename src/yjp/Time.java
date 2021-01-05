package yjp;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(){
		this(0,0,0);
	}
	public Time(int hour,int minute,int second){
//		if(isPrime(hour,minute,second)) {
		this.hour = (hour >= 0 && hour < 24)?hour:0;
		this.minute = (minute >= 0 && minute < 60)?minute:0;
		this.second = (second >= 0 && second < 60)?second:0;
//			this.hour = hour;
//			this.minute = minute;
//			this.second = second;
//		}
//		else {
//			this.hour = 0;
//			this.minute = 0;
//			this.second = 0;
//		}
	}
//	public boolean isPrime(int hour,int minute,int second) {
//		if(hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) 
//			return false;
//		hour = hour < 0 || hour > 23
//		return true;
//	}
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour,minute,second);
	}
}
