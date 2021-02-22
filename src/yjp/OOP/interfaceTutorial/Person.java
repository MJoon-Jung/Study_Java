package yjp.OOP.interfaceTutorial;

public class Person {
	private String phone;
	private String addr;
	
	public Person(String phone, String addr) {
		this.phone = phone;
		this.addr = addr;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void eat() {
		System.out.println("사람이 먹습니다");
	}
}
