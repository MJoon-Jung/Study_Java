package yjp.generic;

public class Student implements Comparable<Student>{
//public class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "[name : " + name + ", score : " + score + "]";
	}
	@Override
	public int compareTo(Student o) {
		return this.score - o.score;
	}
}
