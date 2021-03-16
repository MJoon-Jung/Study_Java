package oop;
class Car2{
	String color;
	String gearType;
	int door;
	
	Car2(){
		this("white","auto",4);
	}
	Car2(String color){
		this(color,"auto", 4);
	}
	Car2(String color, String gearType, int door){
		this.color= color;
		this.gearType = gearType;
		this.door = door;
	}
}
public class CarTest2 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		System.out.println("c1 - color : " + c1.color + "\t c1 gearType : "+c1.gearType + "\t door : "+c1.door);
		c1.color = "black";
		c1.gearType = "parking";
		c1.door = 2;
		System.out.println("c1 - color : " + c1.color + "\t c1 gearType : "+c1.gearType + "\t door : "+c1.door);
		
		Car2 c2 = new Car2("blue");
		System.out.println("c2 - color : " + c2.color + "\t c2 gearType : "+c2.gearType + "\t door : "+c2.door);
		
		Car2 c3= new Car2("red", "parking", 1);
		System.out.println("c3 - color : " + c3.color + "\t c3 gearType : "+c3.gearType + "\t door : "+c3.door);
	}
}
