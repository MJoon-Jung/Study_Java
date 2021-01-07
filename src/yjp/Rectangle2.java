package yjp;

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
}
