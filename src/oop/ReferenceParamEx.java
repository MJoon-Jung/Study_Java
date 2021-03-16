package oop;
class Data4{
	int x;
}
public class ReferenceParamEx {

	public static void main(String[] args) {
		Data4 d = new Data4();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change() :  x = " + d.x);
		System.out.println("main() : x = " + d.x);

	}
	static void change(Data4 d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
