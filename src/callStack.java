//classStack = stack ±¸Á¶´Ù
public class callStack {

	public static void main(String[] args) {
		System.out.println("MainMethod Start");
		firstMethod();
		System.out.println("MainMethod end");

	}
	static void firstMethod() {
		System.out.println("firstMethod Start");
		secondMethod();
		System.out.println("firstMethod end");
	}
	static void secondMethod() {
		System.out.println("secondMethod Start");
		System.out.println("secondMethod end");
	}

}
