package oop;

public class PlayerTest {

	public static void main(String[] args) {
		
//		Player p = new Player();
//		AudioPlayer ap = new AudioPlayer();
		Player ap = new AudioPlayer();  //������
		ap.play(100);
		ap.stop();
	}

}
//�߻� Ŭ������ ����� ���� �ϼ��ؾ� ��ü ��������
/*abstract*/ class AudioPlayer extends Player{
	void play(int pos) {
		System.out.println(pos + "��ġ���� play");
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