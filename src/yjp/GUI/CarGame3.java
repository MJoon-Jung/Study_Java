package yjp.GUI;

import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CarGame3 extends JFrame{
	public CarGame3() {
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(550, 280);
		setVisible(true);
	}
	public static void main(String[] args) {
		CarGame3 c = new CarGame3();
	}
}
class MyPanel2 extends JPanel implements MouseListener{
	BufferedImage img = null;
	private int img_x = 100;
	private int img_y = 100;
	
	MyPanel2(){
		try {
			img = ImageIO.read(new File("D:\\programes\\java_workspace\\Java_self\\src\\Game\\Shooting\\image\\enemy_attack.png"));
		} catch (IOException e) {
			System.out.println("No Imgae");
			System.exit(1);
		}
		this.addMouseListener(this);
		
		this.setFocusable(true); //두줄 코드가 있어야 panel keyevent 발생
		this.requestFocus();
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(img, img_x, img_y, null);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		PointerInfo a = MouseInfo.getPointerInfo();
		Point b = a.getLocation();
		img_x = (int) b.getX();
		img_y = (int) b.getY();
		
		this.repaint();
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
}