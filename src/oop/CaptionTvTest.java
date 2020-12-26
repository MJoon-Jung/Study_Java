package oop;

class TV{
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUP() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}
class CaptionTv extends TV{
	boolean caption;
	void caption() {
		caption = !caption;
	}
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}
public class CaptionTvTest{

	public static void main(String[] args) {
		CaptionTv t = new CaptionTv();
		t.power();
		t.channel = 10;
		System.out.println(t.channel);
		System.out.println(t.power);
		t.displayCaption("Hello OOP");
		t.caption();
		t.displayCaption("Hello OOP");
		t.channelUP();
		System.out.println(t.channel);
	}

}
