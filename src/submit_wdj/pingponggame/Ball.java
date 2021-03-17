package submit_wdj.pingponggame;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Ball {
	int x,y;
	Image image = new ImageIcon("18.png").getImage();
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	
	Rectangle rect;
	
	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
		rect = new Rectangle(x,y,width,height);
	}
	public void move(int dir) {
		if(dir == 0) {
			
		}else if(dir == 1) {
			
		}else if(dir == 2) {
			
		}else if(dir == 3) {
			
		}
	}
}
