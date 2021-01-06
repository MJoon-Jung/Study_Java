package oop;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		if(f instanceof Unit2) {
			System.out.println("f는 Unit 클래스의 자손");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable interface 구현");
		}
		if(f instanceof Movable) {
			System.out.println("f는 Movable interface 구현");
		}
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable interface 구현");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object 클래스의 자손");
		}	
	}
}
class Unit2{
	int currentHP;
	int x;
	int y;
}
class Fighter extends Unit2 implements Fightable{
	public void move(int x, int y) {
		System.out.println("x : " + x + " y : " + y);
	}
	public void attack(Unit2 u) {
		System.out.println(u + "을 공격");
	}
}
interface Movable{void move(int x,int y);}
interface Attackable{void attack(Unit2 u);}
interface Fightable extends Movable,Attackable{}