package yjp.GUI;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame implements KeyListener{
	private JLabel imgLabel;
	
	public CarGame() {
		imgLabel = new JLabel();
		ImageIcon image = new ImageIcon("D:\\programes\\java_workspace\\Java_self\\src\\Game\\Shooting\\image\\enemy_attack.png");
		imgLabel.setIcon(image);
		
		this.add(imgLabel);
		this.addKeyListener(this);
		
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		CarGame c = new CarGame();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP:
			imgLabel.setLocation(imgLabel.getX(), imgLabel.getY()-10);
			break;
		case KeyEvent.VK_DOWN:
			imgLabel.setLocation(imgLabel.getX(), imgLabel.getY()+10);
			break;
		case KeyEvent.VK_LEFT:
			imgLabel.setLocation(imgLabel.getX()-10, imgLabel.getY());
			break;
		case KeyEvent.VK_RIGHT:
			imgLabel.setLocation(imgLabel.getX()+10, imgLabel.getY());
			break;
		}
		
	}
	public void rec(int x, int y) {
		if(x < 0)x = 0;
		else if(x > 300) x= 300;
		if(y < 0) y = 0;
		else if(y > 300) y = 300;
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
