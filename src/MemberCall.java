public class MemberCall {
	
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv; error
	static int cv2 = new MemberCall().iv;
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); error
		MemberCall c = new MemberCall();
		System.out.println(c.iv);
	}
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); error
		MemberCall c = new MemberCall();
		c.instanceMethod1();
//		new MemberCall().instanceMethod1();  상관없음 위아래거 아무거나 써도
	}
}
