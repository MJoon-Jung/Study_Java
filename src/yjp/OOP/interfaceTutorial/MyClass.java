package yjp.OOP.interfaceTutorial;

public class MyClass implements MyInterface{

	@Override
	public void test() {
		System.out.println("test");
	}

	@Override
	public int test2() {
		System.out.println("test2");
		return 0;
	}

	@Override
	public double test3() {
		System.out.println("test3");
		return 0;
	}
}
