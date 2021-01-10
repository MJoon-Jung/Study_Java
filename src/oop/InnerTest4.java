package oop;

public class InnerTest4 {

	public static void main(String[] args) {
		Outer oc =  new Outer();
		Outer.InstanceInner ii = oc.new InstanceInner();
		ii.method1();
		System.out.println(Outer.StaticInner.cv);
		
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println(si.iv);
	}

}
class Outer{
	int iv = 10;
	class InstanceInner{
		int iv = 50;
		void method1() {
			int iv = 100;
			System.out.println("iv : " + iv);
			System.out.println("this.iv : " + this.iv);
			System.out.println("Outer.this.iv : " + Outer.this.iv);
		}
	}
	static class StaticInner{
		int iv= 200;
		static int cv = 300;
	}
	void myMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
}