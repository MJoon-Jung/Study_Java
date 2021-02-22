package yjp.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BasicPaint {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Graphic basic program");
		
		frame.add(new MyDrawingPanel());
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(300,200);
		frame.setVisible(true);
	}
}
class MyDrawingPanel extends JPanel{
	private int squareX = 50;
	private int squareY = 50;
	private int squareW = 20;
	private int squareH = 20;
	
	public MyDrawingPanel() {
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				drawSquare(e.getX(),e.getY());
			}
			
		});
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				drawSquare(e.getX(),e.getY());
			}
			
		});
	}
	private void drawSquare(int x, int y) {
		squareX = x;
		squareY =y;
		
//		if(squareX != x || squareY != y) {
//			repaint(squareX,squareY,squareW,squareH);
//			squareX = x;
//			squareY =y;
//			repaint(squareX,squareY,squareW+1,squareH+1);
//		}
		repaint();
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("마우스 클릭하면 사각형이 그려집니다", 10, 10);
		g.setColor(Color.green);
		g.fillRect(squareX, squareY, squareW, squareH);
		g.setColor(Color.red);
		g.drawRect(squareX, squareY, squareW, squareH);
	}
}
