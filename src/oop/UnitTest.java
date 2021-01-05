package oop;

public class UnitTest {

	public static void main(String[] args) {
		Unit [] u = new Unit[3];
		u[0] = new Marine();
		u[1] = new Tank();
		u[2] = new Dropship();
		
//		for(int i = 0; i < u.length; i++) {
//			u[i].move(100,200);
//		}
	}

}
abstract class Unit{
	int x;
	int y;
	
	abstract void move(int x, int y);
	void stop() {};
}
class Tank extends Unit{
	void move(int x,int y){
		System.out.println("Tank move : "+x+","+y); 
	}
	void ChangeMode() {
		System.out.println("change mode");
	}
}
class Marine extends Unit{
	void move(int x,int y){
		System.out.println("Marine move : "+x+","+y); 
	}
	void StimPack() {
		System.out.println("StimPack");
	}
}
class Dropship extends Unit{
	void move(int x,int y){
		System.out.println("Dropship move : "+x+","+y); 
	}
	void Drop(int x, int y) {
		System.out.println("Drop : "+x+","+y);
	}
}