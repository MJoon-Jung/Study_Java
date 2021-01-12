package yjp.GUI;

import javax.swing.*;
import java.awt.*;

public class AbsoluteLayoutTest extends JFrame{
	public AbsoluteLayoutTest() {
		JButton btn1 = new JButton("btn1");
		JButton btn2 = new JButton("btn2");
		JButton btn3 = new JButton("btn3");
		
		btn1.setBounds(0, 0, 100, 100);
		btn2.setBounds(10, 200, 50, 50);
		btn3.setBounds(50, 150, 10, 10);
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		this.setLayout(null);
		this.setTitle("Absolute position Test");
		this.setSize(300,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String [] args) {
		AbsoluteLayoutTest frame = new AbsoluteLayoutTest();
		
		
	}
}
