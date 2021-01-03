public class InstanceOfTest {

	public static void main(String[] args) {
//		FireEngine2 fe = new FireEngine2();
		Car5 fe = new Car5();
		
		if(fe instanceof FireEngine2) {
			System.out.println("this is FireEngine2 instance");
		}
		if(fe instanceof Car5) {
			System.out.println("this is Car5 instance");
		}
		if(fe instanceof Object) {
			System.out.println("this is Object instance");
		}
		
		System.out.println(fe.getClass().getName());
		
	}

}

class Car5{}
class FireEngine2 extends Car5{}