package oop;

public class PointTest2 {

	public static void main(String[] args) {
		Point3D2 p1 = new Point3D2(10,20,30);
		
		System.out.println("x : " + p1.x + " y  : " + p1.y + " z : " + p1.z);

	}

}
class Point3{
	int x;
	int y;
	Point3(){
		this(0,0);
	}
	Point3(int x, int y){
		this.x = x;
		this.y = y;
	}
}
class Point3D2 extends Point3{
	int z;
	
	Point3D2(){
		this(0,0,0);
	}
	Point3D2(int x, int y,int z) {
		super(x, y);
		this.z = z;
		
	}
	
}