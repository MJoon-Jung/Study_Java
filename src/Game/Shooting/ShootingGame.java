package Game.Shooting;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class ShootingGame extends JFrame{
	private Image bufferImage;
	private Graphics screenGraphic;
	
	private Image mainScreen = new ImageIcon("src/Game/Shooting/image/main_screen.png").getImage();
	private Image loadingScreen = new ImageIcon("src/Game/Shooting/image/loading_screen.png").getImage();
	private Image gameScreen = new ImageIcon("src/Game/Shooting/image/game_screen.png").getImage();
	
	private boolean isMainScreen, isLoadingScreen, isGameScreen;
	
	public ShootingGame() {
		setTitle("shooting Game");
//		setUndecorated(true); //테두리없음
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		
		addKeyListener(new KeyListener());
		
	}
	public void init() {
		isMainScreen = true;
		isLoadingScreen = false;
		isGameScreen = false;
		
		addKeyListener(new KeyListener());
	}
	public void gameStart() {
		isMainScreen = false;
		isLoadingScreen = true;
		
		Timer loadingTimer = new Timer();
		TimerTask loadingTask = new TimerTask() {
			@Override
			public void run() {
				isLoadingScreen = false;
				isGameScreen = true; 
			}
		}
	}
	public void paint(Graphics g) {
		bufferImage = createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		screenGraphic = bufferImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(bufferImage,0,0,null);
		
		
	}
	public void screenDraw(Graphics g) {
		if(isMainScreen) {
			g.drawImage(mainScreen,0,0,null);
		}
		if(isLoadingScreen) {
			g.drawImage(loadingScreen,0,0,null);
		}
		if(isGameScreen) {
			g.drawImage(gameScreen,0,0,null);
		}
		g.drawImage(mainScreen, 0, 0, null);
		this.repaint();
	}
	class KeyListener extends KeyAdapter{
		
		@Override
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
			case KeyEvent.VK_ESCAPE:
				System.exit(0);
				break;
			}
		}
		
	}
}
