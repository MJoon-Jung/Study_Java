package yjp.generic;

public class BoxTest {
	public static void main(String[] args) {
		
		MyBox<String> mybox = new MyBox<>();
		
		mybox.setValue("gjgjajaj");
		System.out.println(mybox.getValue());
		
		MyBox<Integer> mybox2 = new MyBox<>();
		mybox2.setValue(1241);
		System.out.println(mybox2.getValue());
		
		MyBox mybox3 = new MyBox();
		
//		Box box = new Box();
//		box.setValue("ȫ�浿");
//		String v= box.getValue();
//		System.out.println(v);
//		
//		BoxInteger box2 = new BoxInteger();
//		box2.setValue(100);
//		System.out.println(box2.getValue());
	}
	private static void openBox(MyBox box) {
		Object obj = box.getValue();
	}
}
