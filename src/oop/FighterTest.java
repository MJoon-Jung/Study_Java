package oop;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		if(f instanceof Unit2) {
			System.out.println("f�� Unit Ŭ������ �ڼ�");
		}
		if(f instanceof Fightable) {
			System.out.println("f�� Fightable interface ����");
		}
		if(f instanceof Movable) {
			System.out.println("f�� Movable interface ����");
		}
		if(f instanceof Attackable) {
			System.out.println("f�� Attackable interface ����");
		}
		if(f instanceof Object) {
			System.out.println("f�� Object Ŭ������ �ڼ�");
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
		System.out.println(u + "�� ����");
	}
}
interface Movable{void move(int x,int y);}
interface Attackable{void attack(Unit2 u);}
interface Fightable extends Movable,Attackable{}