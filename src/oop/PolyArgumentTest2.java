package oop;

import java.util.Vector;

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		
		Buyer2 b = new Buyer2();
		Tv3 tv = new Tv3();
		Computer2 pc = new Computer2();
		Audio2 ad = new Audio2();
		
		b.buy(tv);
		b.buy(pc);
		b.buy(ad);
		b.summary();
		System.out.println();
		b.refund(pc);
		b.summary();

	}

}
class Product3{
	int price;
	int bonusPoint;
	
	Product3(){}
	
	Product3(int price){
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv3 extends Product3{
	Tv3(){
		super(100);
	}
	public String toString() {
		return "TV";
	}
}

class Computer2 extends Product3{
	Computer2(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class Audio2 extends Product3{
	Audio2(){
		super(300);
	}
	public String toString() {
		return "Audio";
	}
}
class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();
	int i = 0;
	
	void buy(Product3 p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + " 을/를 구입하셨습니다");
		
	}
	void refund(Product3 p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p +"을/를 반품하셨습니다");
		}
		else {
			System.out.println("구입하신 제품이 없습니다");
		}
		
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다");
		}
		for(int i = 0; i < item.size(); i++) {
			Product3 p = (Product3) item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		System.out.println("sum : " + sum);
		System.out.println("itemList : " + itemList);
	}
	
}
















