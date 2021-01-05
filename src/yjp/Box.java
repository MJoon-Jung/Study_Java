package yjp;

public class Box {
	private int width;
	private int height;
	private int length;
	private int volume;
	
	public Box(){
		this(0,0,0);
	}
	public Box(int width,int height,int length){
		this.width = width;
		this.height = height;
		this.length = length;
		this.volume = width * height * length;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String toString() {
		return "width : " + width + " height : " + height + " length : " + length + " volume : " + volume;
	}
}
