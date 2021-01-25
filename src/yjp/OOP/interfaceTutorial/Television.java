package yjp.OOP.interfaceTutorial;

public class Television implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("TV¸¦ Åµ´Ï´Ù");
	}

	@Override
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù");
	}

}
