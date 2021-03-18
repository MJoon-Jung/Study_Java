package submit_wdj.pingponggame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class App extends JFrame{
	private Image bufferImage;
	private Graphics screenGraphic;
	private Image background_image = new ImageIcon("background.png").getImage();
	
	public static Game game = new Game();
	public App() {
		
		this.addKeyListener(new keyListener());
		
		this.setTitle("ping pong game");
		this.setUndecorated(true);
		this.setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		game.run();
		
	}
	public void paint(Graphics g) {
		bufferImage = createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		screenGraphic = bufferImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(bufferImage, 0, 0, null);
	}
	public void screenDraw(Graphics g) {
		g.drawImage(background_image, 0, 0, null);
		game.gameDraw(g);
		ScoreDraw(g);
		this.repaint();
	}
	public void ScoreDraw(Graphics g) {
		Font f = new Font("Arial", Font.BOLD, 50);
		g.setFont(f);
		g.setColor(Color.green);
		if(game.isGameTrue) {			
			g.drawString(String.valueOf(game.score2), Main.SCREEN_WIDTH / 4, 60);
			g.drawString(String.valueOf(game.score1), Main.SCREEN_WIDTH / 4 * 3, 60);
		}else {
			g.setFont(new Font("Arial", Font.BOLD, 90));
			if(game.score1 > game.score2){
				g.drawString("1Team Win", Main.SCREEN_WIDTH / 2 - 250, 150);
			}else {
				g.drawString("2Team Win", Main.SCREEN_WIDTH / 2 - 250, 150);
			}
		}
	}
	class keyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
			case KeyEvent.VK_UP:
				game.setUp(true);
				break;
			case KeyEvent.VK_DOWN:
				game.setDown(true);
				break; 
			case KeyEvent.VK_S:
				game.setS(true);
				break;
			case KeyEvent.VK_W:
				game.setW(true);
				break;
			case KeyEvent.VK_ESCAPE:
				System.exit(0);
			}
		}	
		@Override
		public void keyReleased(KeyEvent e) {
			switch(e.getKeyCode()) {
			case KeyEvent.VK_UP:
				game.setUp(false);
				break;
			case KeyEvent.VK_DOWN:
				game.setDown(false);
				break;
			case KeyEvent.VK_W:
				game.setW(false);
				break;
			case KeyEvent.VK_S:
				game.setS(false);
				break;
			}
		}
	}
}
