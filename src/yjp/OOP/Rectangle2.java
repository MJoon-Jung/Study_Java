package yjp.OOP;

public class Rectangle2 extends Shape{
	int width;
	int height;
	
	Rectangle2(){
		this(0,0);
	}
	Rectangle2(int width,int height){
		this.width = width;
		this.height = height;
	}
	Rectangle2(int x,int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	double area() {
//		System.out.print("면적 넓이 : ");
		return width * height;
	}
	void draw() {
		System.out.printf("(%d,%d)위치에 가로 : %d 세로 : %d \n",x,y,width,height);
	}
	public String toString() {
		return "width : sdfasdfasdfdas";
	}
}
class ColorRectangle extends Rectangle2{
	   String color;
	   public ColorRectangle(int x, int y, int width, int height,String color) {
	      super(x, y, width, height);
	      this.color=color;
//	      System.out.println("colorRectangle");
	      
	   }
	public ColorRectangle(Rectangle2 re, String color) {
		  this.x = re.x;
		  this.y = re.y;
	      this.width = re.width;
	      this.height = re.height;
	      this.color=color;
//	      System.out.println("colorRectangle");
	}
	public void getLink() {
	      System.out.print("");
	   }
	   @Override
	   public String toString() { 
		   int sum = x+y;
	      return "ColorRectangle [color=" + color + "]"+sum;
	   }	      
}