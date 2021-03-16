package yjp.OOP.c2;

public class GraduateStudent extends Student {

	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public void print() {
		System.out.println("major :  " +major);
	}

}
