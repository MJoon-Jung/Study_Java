package yjp.OOP.c3;

import java.util.Arrays;

public class Student extends Person{
	private int [] grade= new int [10];
	private int index = 0;
	
	
	public void GradePrint() {
		int [] copyAr = Arrays.copyOf(grade,index);
		System.out.println(Arrays.toString(copyAr));
	}
	public int[] getGrade() {
		return grade;
	}

	public void setGrade(int[] grade) {
		this.grade = grade;
	}
	public void setGrade(int score) {
		grade[index++] = score;	
	}

	@Override
	public void print() {
		System.out.println("Name : " + getName() + "\t Age" + getAge() + "\t juso : "+ getJuso() + "\t jumin : " + getJumin() + "\t phone : "+getPhnum());
	}

}
