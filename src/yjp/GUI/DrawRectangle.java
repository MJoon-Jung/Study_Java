package yjp.GUI;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawRectangle extends JFrame{
	
	public DrawRectangle() {
		this.add(new MyPanel3());
		
		this.setSize(400,400);
		this.setTitle("Draw Rectangle");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		DrawRectangle d = new DrawRectangle();
	}
}
class Rectangle{
	int x,y,w,h;
	public Rectangle(int x,int y,int w,int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
}
class MyPanel3 extends JPanel implements MouseListener, MouseMotionListener{
	Rectangle [] rectangles = new Rectangle[10000];
	int index = 0;
	MyPanel3(){
//		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
//		if(index >= rectangles.length) index = 0;
//		rectangles[index] = new Rectangle(e.getX(),e.getY(),10,10);
//		repaint();
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
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		if(index >= rectangles.length) return;
		rectangles[index++] = new Rectangle(e.getX(),e.getY(),10,10);
		
		repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
