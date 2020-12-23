class Car3{
	String color;
	String gearType;
	int door;
	
	Car3(){
		this("white","auto",4);
	}
	Car3(Car3 c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	Car3(String color, String gearType, int door){
		this.color= color;
		this.gearType = gearType;
		this.door = door;
	}
	public void print() {
		System.out.println("color :" + color + "\t gearType : "+ gearType + "\t door : "+ door);
	}
}
public class CarTest3 {

	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);
		c1.print();
		c2.print();
		c1.door = 6;
		c2.color = "black";
		c1.print();
		c2.print();
		
	}
}
