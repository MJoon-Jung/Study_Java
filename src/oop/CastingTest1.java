package oop;

public class CastingTest1 {

	public static void main(String[] args) {
		Car4 car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		car = fe;
		fe.water();
		car = fe;
//		car.water();
		car.stop();
		fe2 = (FireEngine) car;
		fe2.water();
		
//		Car4 c = new Car4();
//		FireEngine fe3 = (FireEngine) c;
//		fe3.stop();
		
		
		
	}

}

class Car4{
	String color;
	int door;
	void stop() {
		System.out.println("stop!");
	}
	void drive() {
		System.out.println("drive!");
	}
}
class FireEngine extends Car4{
	void water() {
		System.out.println("water!");
	}
}