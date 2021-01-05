package yjp;

public class Rectangle {
	private int width;
	private int length;
	
	Rectangle(){
		this(10,10);
	}
	Rectangle(int width,int length){
		this.width = width;
		this.length = length;
	}
	public boolean isSame(Rectangle r) {
		boolean result = false;
		if(width == r.width && length == r.length) {
			result = true;
		}
		return result;
	}
	public String toString() {
		return "width : " + width + " length : " + length;
	}
}
