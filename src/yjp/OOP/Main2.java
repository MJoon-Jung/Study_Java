package yjp.OOP;

public class Main2 {

	public static void main(String[] args) {
//		Animal ani = new Animal();
//		Eagle eagle = new Eagle();
//		Lion lion = new Lion();
//		ani.eat();
//		ani.sleep();
//		eagle.fly();
//		eagle.eat();
//		lion.roar();
//		re.draw();
//		System.out.println("∏È¿˚ ≥–¿Ã : " + re.area());
		Rectangle2 re = new Rectangle2(10,10,100,200);
		ColorRectangle c = new ColorRectangle(re,"blue");
		System.out.println(c);
		ColorRectangle c2 = new ColorRectangle(new Rectangle2(),"blue");
		System.out.println(c2);
	}

}
