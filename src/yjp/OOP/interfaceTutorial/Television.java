package yjp.OOP.interfaceTutorial;

public class Television implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("TV�� ŵ�ϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}

}
