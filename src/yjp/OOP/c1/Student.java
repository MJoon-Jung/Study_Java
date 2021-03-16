package yjp.OOP.c1;

import java.util.Arrays;

public class Student {
	private String name;
	private String sid;
	private String phone;
	private String dept;
	private int slevel;
	private int [] grades = new int[10];
	private int idx = 0;
	//Properties, attributes, data, fields, member variables, state
	
	
	//member methods, behaviors, functions
	public int add(int n1, int n2) {
		return n1+n2;
	}
	public double add(double n1, double n2) {
		return n1+n2;
	}
	
	public void addGrade(int n) {
		if(idx < grades.length) {
			grades[idx++] = n;
		}
		else {
			System.out.println("index 초과입니다");
		}
		
	}
	public int [] getGrade() {
		int [] copy = Arrays.copyOf(grades, idx);
		return grades;
	}
	public double getAverage() {
		int sum = 0;
		for(int i = 0; i < idx; i++) {
			sum+= grades[i];
		}
		return (double) sum/ idx;
	}
	public int maxGrade() {
		int max = grades[0];
		for(int i = 1; i < idx; i++) {
			if(max < grades[i])
				max = grades[i];
		}
		return max;
	}
	public int minGrade() {
		int min = grades[0];
		for(int i = 1; i < idx; i++) {
			if(min > grades[i])
				min = grades[i];
		}
		return min;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public void setSlevel(int slevel) {
		this.slevel = slevel;
	}

	public void getSid() {
		System.out.println(sid);
	}
	
	public void setSid(String sid) {
		//sid가 숫자로만 구성되었는지 체크
		//그렇다면 설정..
		// 그렇지 않다면
		// 욕치고 설정하지 않는다.
		boolean checkResult = isNumberic(sid);
		if(checkResult)
			this.sid = sid;
		else {
			System.out.println("Retry input number");
		}
	}
	private boolean isNumberic(String sid) {
		for(int i = 0; i < sid.length(); i++) {
			char c = sid.charAt(i);
			if(c < '0' || c > '9')
				return false;
		}
		return true;
		
	}
	
	public int getSlevel() {
		return slevel;
	}
	
	void study() {
		slevel++;
		System.out.println(name + "이(가) 공부합니다. 학습레벨 : " + slevel);
	}
	void play() {
		slevel--;
		System.out.println(name + "이(가) 노는 중 입니다 학습레벨 :" + slevel);
	}
}
