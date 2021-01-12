package yjp.GUI;

import java.awt.*;

import javax.swing.*;

public class MyFrame extends JFrame{
	public MyFrame() {
		JButton button = new JButton("button");
		JButton button2 = new JButton("button2");
		this.add(button);
		this.add(button2);
		this.setLayout(new FlowLayout());
		
		
		this.setSize(420,280);
		this.setTitle("My Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
