package yjp.GUI;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CarGame2 extends JFrame{
	public CarGame2() {
		MyPanel panel = new MyPanel();
		
		this.add(panel);
		
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(550, 280);
		setVisible(true);
	}
	public static void main(String[] args) {
		CarGame2 c = new CarGame2();
	}
}
class MyPanel extends JPanel implements KeyListener{
	BufferedImage img = null;
	private int img_x = 100;
	private int img_y = 100;
	
	MyPanel(){
		try {
			img = ImageIO.read(new File("D:\\programes\\java_workspace\\Java_self\\src\\Game\\Shooting\\image\\enemy_attack.png"));
		} catch (IOException e) {
			System.out.println("No Imgae");
			System.exit(1);
		}
		this.addKeyListener(this);
		
		
		this.setFocusable(true); //두줄 코드가 있어야 panel keyevent 발생
		this.requestFocus();
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img,img_x, img_y, null);
	}

	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP:
			img_y -= 10;
			break;
		case KeyEvent.VK_DOWN:
			img_y += 10;
			break;
		case KeyEvent.VK_LEFT:
			img_x -= 10;
			break;
		case KeyEvent.VK_RIGHT:
			img_x += 10;
			break;
		}
		
		this.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
