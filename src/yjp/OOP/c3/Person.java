package yjp.OOP.c3;

public class Person {
	private String name;
	private int age;
	private String juso;
	private String jumin;
	private String phnum;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJuso() {
		return juso;
	}
	public void setJuso(String juso) {
		this.juso = juso;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public String getPhnum() {
		return phnum;
	}
	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}
	
	public void print() {
		System.out.println("name \t" + name + "age \t" + age + "juso :\t" + juso + "jumin :\t" + jumin +"phnum :\t" + phnum);
	}
}
