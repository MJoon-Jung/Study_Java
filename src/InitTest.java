
public class InitTest {
	static int cv = 1;
	int iv = 1;
	static {
		cv = 2;
		System.out.println("cv = 2");
	}
	{
		iv = 3;
		System.out.println("iv = 3");
	}
	InitTest(){
		iv = 4;
		System.out.println("iv = 4");
	}
	public static void main(String[] args) {
		
		InitTest it = new InitTest();
		

	}

}
