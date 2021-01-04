package oop;

public class PolyArgumentTest {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		b.buy(new Tv2());
		System.out.println();
		b.buy(new Computer());

	}

}
class Product2{
	int price;
	int bonusPoint;
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv2 extends Product2{
	Tv2(){
		super(100);
	}
	public String toString() {
		return "TV";
	}
}

class Computer extends Product2{
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("�ܾ� ����");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "��/�� �����ϼ̽��ϴ� / price : " + p.price);
		System.out.println("���� ���� �� : " + money);
		System.out.println("���� bonusPoint : " + bonusPoint);
	}
}
















