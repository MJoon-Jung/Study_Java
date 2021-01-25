package yjp.OOP.interfaceTutorial;

public class abstract_impl extends Abstract_practice{

	@Override
	public void test2() {
		System.out.println("test2");
	}
	
	public static void main(String[] args) {
		abstract_impl ai = new abstract_impl();
		ai.test();
		ai.test2();
		ai.test3();
	}
}
