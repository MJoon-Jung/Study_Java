package yjp.CollectionFrameWork;

public class Student{
	String name;
	int gsc;
	String sid;
	Student(String name,int gsc, String sid){
		this.name = name;
		this.gsc = gsc;
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGsc() {
		return gsc;
	}
	public void setGsc(int gsc) {
		this.gsc = gsc;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gsc=" + gsc + ", sid=" + sid + "]";
	}	
	
}
