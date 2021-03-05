package ShootingGame;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Enemy {
	Image image= new ImageIcon("D:\\programes\\java_workspace\\Java_self\\src\\ShootingGame\\image\\Enemy.png").getImage();
	int x,y;
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	int hp = 10;
	
	public Enemy(int x,int y) {
		this.x = x;
		this.y = y;
		
		
	}
	public void move() {
		this.x -= 5;
	}
}
