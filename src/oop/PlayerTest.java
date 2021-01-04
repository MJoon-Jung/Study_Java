package oop;

public class PlayerTest {

	public static void main(String[] args) {
		
//		Player p = new Player();
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer();  //다형성
		ap.play(100);
		ap.stop();
	}

}
//추상 클래스는 상속을 통해 완성해야 객체 생성가능
/*abstract*/ class AudioPlayer extends Player{
	void play(int pos) {
		System.out.println(pos + "위치부터 play");
	}
	void stop() {
		System.out.println("stop");
	}
//	abstract void stop();
}
abstract class Player{ 
	abstract void play(int pos);
	abstract void stop();
	
}