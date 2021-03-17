package submit_wdj.pingponggame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App extends JFrame{
	private Image bufferImage;
	private Graphics screenGraphic;
	private Image background_image = new ImageIcon("background.png").getImage();
	
	public App() {
		
		
		
		this.setTitle("ping pong game");
		this.setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public void paint(Graphics g) {
		bufferImage = createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		screenGraphic = bufferImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(bufferImage, 0, 0, null);
	}
	public void screenDraw(Graphics g) {
		g.drawImage(background_image, 0, 0, null);
		g.setColor(Color.GREEN);
		g.fillRect(50, 50, 200, 200);
	}
}
