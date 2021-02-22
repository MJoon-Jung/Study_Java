package ShootingGame;

import java.awt.Image;

import javax.swing.ImageIcon;

public class EnemyAttack {
	int x,y;
	Image image= new ImageIcon("D:\\programes\\java_workspace\\Java_self\\src\\ShootingGame\\image\\Enemy_attack.png").getImage();
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	int attack = 5;
	
	public EnemyAttack(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void fire() {
		this.x -= 12;
	}
}
