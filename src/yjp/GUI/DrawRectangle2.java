package yjp.GUI;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawRectangle2 extends JFrame{
	
	public DrawRectangle2() {
		this.add(new MyPanel4());
		
		this.setSize(400,400);
		this.setTitle("Draw Rectangle");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		DrawRectangle2 d = new DrawRectangle2();
	}
}
class MyPanel4 extends JPanel {
	Rectangle [] rectangles = new Rectangle[10000];
	int index = 0;
	MyPanel4(){
		this.addMouseListener(new MyMouseListener());
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
//		super.paintComponents(g);
		for(Rectangle r : rectangles) {
			if(r == null) break;
			g.fillRect(r.x, r.y, r.w, r.h);
		}
	}
	class MyMouseListener extends MouseAdapter{
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			if(index >= rectangles.length) return;
			rectangles[index++] = new Rectangle(e.getX(),e.getY(),50,50);
			repaint();
		}
	}
}
