class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
public class TvTest {

	public static void main(String[] args) {
//		Tv t1 = new Tv();
//		Tv t2 = new Tv();
		Tv[] tvarr = new Tv[3];
		tvarr[0] = new Tv();
		tvarr[1] = new Tv();
		tvarr[2] = new Tv();
//		t1.channelUp();
//		t2.channelDown();
		tvarr[0].channel = 8;
		tvarr[1].channelDown();
		tvarr[2].channelUp();
//		System.out.println("t1의 channel 값 : " + t1.channel);
//		System.out.println("t2의 channel 값 : " + t2.channel);
		System.out.println(tvarr[0].channel);
		System.out.println(tvarr[1].channel);
		System.out.println(tvarr[2].channel);
	}

}
