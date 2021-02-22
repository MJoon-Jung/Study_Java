package yjp.GUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class DrawingFace extends JFrame{
	public DrawingFace() {
		this.setSize(280,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("face");
		this.add(new MyDrawingFacePanel());
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new DrawingFace();
	}
}
class MyDrawingFacePanel extends JPanel{
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(20, 30, 200, 200);
		
		g.setColor(Color.black);
//		x y width height startangle endangle
		g.drawArc(60, 60, 50, 50, -180, 180);
		g.drawArc(140, 60, 50, 50, -180, 180);
		g.drawArc(70, 150, 100, 70, -180, -180);
	}
}