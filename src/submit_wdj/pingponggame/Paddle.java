package submit_wdj.pingponggame;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Paddle extends Rectangle{
	Image image = new ImageIcon("bar.png").getImage();
	int width = image.getWidth(null);
	int height = image.getHeight(null);
	
	public Paddle(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
