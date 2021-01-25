package yjp.OOP.interfaceTutorial;

public class Main {

	public static void main(String[] args) {
//		MyClass mc = new MyClass();
//		mc.test();
//		mc.test2();
//		mc.test3();
		
		RemoteControl tvc = new Television();
		RemoteControl tvr = new Refrigerator();
		
		tvc.turnOn();
		tvc.turnOff();
		tvr.turnOn();
		tvr.turnOff();
	}

}
