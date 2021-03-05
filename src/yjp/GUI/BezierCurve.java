package yjp.GUI;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class BezierCurve extends JFrame implements MouseListener,MouseMotionListener{
	private int [] xs = {50,150,400,450};
	private int [] ys = {200,50,300,200};
	
	private int dragIndex = -1;
	
	class BezierPanel extends JPanel{
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			//xs 배열 ys 배열의 좌표를 이용해 베지어 곡선을 그림
			
		}
	}
	public BezierCurve() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		//선택된 점이 있는지 보고 index -1 이 아니라면 선택된 점의 x,y 좌표 변경
		repaint();
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		dragIndex = 0; //1,2,3
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		dragIndex = -1;
		
		repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {}


	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
	public static void main(String[] args) {
		new BezierCurve();
	}
}
