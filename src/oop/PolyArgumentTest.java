package oop;

public class PolyArgumentTest {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		b.buy(new Tv2());
		System.out.println();
		b.buy(new Computer());
		System.out.println();
		b.buy(new Audio());
		System.out.println();
		b.summary();

	}

}
class Product2{
	int price;
	int bonusPoint;
	
	Product2(){}
	
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
class Audio extends Product2{
	Audio(){
		super(300);
	}
	public String toString() {
		return "Audio";
	}
}
class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	Product2[] item = new Product2[10];
	int i = 0;
	
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다 / price : " + p.price);
		item[i++] = p;
		printbuy();
	}
	void printbuy() {
		System.out.println("현재 남은 돈 : " + money);
		System.out.println("현재 bonusPoint : " + bonusPoint);
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		for(int i = 0; i < item.length; i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			itemList += item[i] + "  ";
			
		}
		printbuy();
		System.out.println("구입하신 제품은 " + itemList + "입니다");
	}
}
















