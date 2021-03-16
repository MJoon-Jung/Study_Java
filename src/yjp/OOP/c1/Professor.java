package yjp.OOP.c1;

import java.util.Arrays;

public class Professor {
	private String name;
	private String sid;
	private String gender;
	private String phone;
	private String dept;
	private String[] lectures;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String[] getLectures() {
		return lectures;
	}
	public void setLectures(String[] lectures) {
		this.lectures = lectures;
	}
	public void print() {
		System.out.println("name: "+name + "\t sid : "+ sid + "\t gender : " + gender + "\t phonenumber : " + phone + "\tlectures :" + Arrays.toString(lectures));
	}
	

}
