package yjp.OOP.interfaceTutorial;

public class Refrigerator implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("����� ŵ�ϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("����� ���ϴ�");
	}
	
}
