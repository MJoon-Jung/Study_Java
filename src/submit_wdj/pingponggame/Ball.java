package submit_wdj.pingponggame;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Ball {
	int x,y;
	Image image = new ImageIcon("18.png").getImage();
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	
	int speed = 3;
	
	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void move(int dir) {
		if(dir == 1) {
			this.x += speed;
			this.y -= speed;
		}else if(dir == 2) {
			this.x -= speed;
			this.y -= speed;
		}else if(dir == 3) {
			this.x -= speed;
			this.y += speed;
		}else if(dir == 4) {
			this.x += speed;
			this.y += speed;
		}
	}
}
