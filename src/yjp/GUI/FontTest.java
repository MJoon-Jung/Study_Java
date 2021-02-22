package yjp.GUI;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FontTest {
	static GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String [] fontFamilies = ge.getAvailableFontFamilyNames();


		Font font = new Font("Times New Roman",Font.BOLD , 30);
		JFrame frame= new JFrame();
		JLabel label = new JLabel("Hello Everyone");
		JLabel label2 = new JLabel("Font");
		frame.add(label, BorderLayout.NORTH);
		frame.add(label2, BorderLayout.CENTER);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		try {
			for(String s : fontFamilies) {			
				label2.setText(s);
				label.setFont(new Font(s,Font.BOLD,30));
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		new FontTest();
	}
}
