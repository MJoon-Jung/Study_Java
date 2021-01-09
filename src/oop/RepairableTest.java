package oop;

public class RepairableTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		DropShip dropship = new DropShip();
		Marine marine = new Marine();	
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
//		scv.repair(marine);
	}

}
interface Repairable{}
class Units{
	int hitPoint;
	final int MAX_HP;
	Units(int hp){
		MAX_HP = hp;
	}
}
class GroundUnit extends Units{
	GroundUnit(int hp){
		super(hp);
	}
}
class AirUnit extends Units{
	AirUnit(int hp){
		super(hp);
	}
}
class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Tank";
	}
}
class DropShip extends AirUnit implements Repairable{
	DropShip(){
		super(125);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "DropShip";
	}
}
class Marine extends GroundUnit{
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "Marine";
	}
}
class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	void repair(Repairable r) {
		if(r instanceof Units) {
			Units u = (Units) r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다");
		}
	}
	public String toString() {
		return "SCV";
	}
}




























