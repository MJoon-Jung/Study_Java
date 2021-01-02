package oop;

public class PointTest {

	public static void main(String[] args) {
		
		Point2 p1 = new Point2(10,20);
		Point3D p2 = new Point3D(40,20,10);
		
		System.out.println(p1.getLocation());
		System.out.println(p2.getLocation());
	}

}
class Point2{
	int x;
	int y;
	Point2(){
		this(0,0);
	}
	Point2(int x,int y){
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x : " + x + " y : "+ y;
	}
}
class Point3D extends Point2{
	int z;
	
	Point3D(){
		this(0,0,0);
	}
	Point3D(int x, int y,int z){
//		super();
//		this.x = x;
//		this.y = y;
		super(x,y);
		this.z = z;
	}
	@Override
	String getLocation() {
		return "x : "+ x + " y : " + y + " z : " + z;
	}
}