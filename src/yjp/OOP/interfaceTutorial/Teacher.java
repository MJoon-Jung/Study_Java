package yjp.OOP.interfaceTutorial;

public class Teacher {
	private String subject;

	public Teacher(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void eat() {
		System.out.println("�������� �Ļ縦 �մϴ�");
	}
}
