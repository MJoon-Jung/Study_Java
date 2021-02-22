package yjp.OOP.interfaceTutorial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Main2 implements ActionListener{
	
	private int minute = 0;
	
	public int getMinute() {
		return minute;
	}
	public static void main(String[] args) {
		Main2 lt = new Main2();
//		Timer timer = new Timer(1000, lt);
//		timer.start();
//		Timer timer = new Timer(1000, new ActionListener() {
//			private int seconds = 0;
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Hi" + ++seconds + "초");
//			}
//			
//		});
//		Timer timer = new Timer(1000,(ActionEvent e)->{
//			System.out.println("1 second");
//		});
		Timer timer = new Timer(1000,(e)->{
			System.out.println("1 second");
		});
		timer.start();
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("error");
			}
		}
		System.out.println("메인 종료");
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("Elapsed : " + ++minute);
//	}
}
