package yjp.OOP.interfaceTutorial;

public class Employee implements Employable{
	private String name;
	
	public Employee(String name) {
		if(Employable.isEmpty(name)) {
			throw new RuntimeException("�̸��� �ݵ�� �Է��Ͽ��� �մϴ�");
		}
		this.name = name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("ȫ�浿");
		System.out.println(e1.getName());
		Employee e2 = new Employee("");
		System.out.println(e2.getName());
	}
}
