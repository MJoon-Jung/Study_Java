package yjp.GUI;

import javax.swing.*;
import java.awt.*;

public class FlowTest extends JFrame{
	public FlowTest() {
		JButton btn1 = new JButton("btn1");
		JButton btn2 = new JButton("btn2");
		JButton btn3 = new JButton("btn3");
		JButton btn4 = new JButton("btn4");
		JButton btn5 = new JButton("btn5");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(btn4);
		this.add(btn5);
		
		this.setLayout(new FlowLayout());
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String [] args) {
		FlowTest frame = new FlowTest();
		
		
	}
}
