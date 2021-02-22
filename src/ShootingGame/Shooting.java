package ShootingGame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Shooting extends JFrame{
	private Image bufferImage;
	private Graphics screenGraphic;
	
	private Image mainScreen = new ImageIcon("D:\\programes\\java_workspace\\Java_self\\src\\ShootingGame\\image\\main_screen.png").getImage();
	private Image loadingScreen = new ImageIcon("D:\\programes\\java_workspace\\Java_self\\src\\ShootingGame\\image\\loading_screen.png").getImage();
	private Image gameScreen = new ImageIcon("D:\\programes\\java_workspace\\Java_self\\src\\ShootingGame\\image\\game_screen.png").getImage();
	
	private boolean isMainScreen,isLoadingScreen,isGameScreen;
	
	private static Game game = new Game();
	
	private Audio backgroundMusic;
	public Shooting() {
		setTitle("Shooting Game");
		setUndecorated(true);
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(null);
		
		init();
		
		this.addKeyListener(new keyListener());
		
	}
	private void init() {
		isMainScreen = true;
		isLoadingScreen = false;
		isGameScreen = false;
		
		backgroundMusic = new Audio("D:\\programes\\java_workspace\\Java_self\\src\\ShootingGame\\audio\\menuBGM.wav",true);
		backgroundMusic.start();
		this.addKeyListener(new keyListener());
	}
	private void gameStart() {
		isMainScreen = false;
		isLoadingScreen = true;
		
		Timer loadingTimer = new Timer();
		TimerTask loadingTask = new TimerTask() {

			@Override
			public void run() {
				backgroundMusic.stop();
				isLoadingScreen = false;
				isGameScreen = true;
				game.start();
			}
			
		};
		loadingTimer.schedule(loadingTask, 3000);
	}
	public void paint(Graphics g) {
		bufferImage = createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		screenGraphic = bufferImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(bufferImage, 0, 0, null);
	}
	public void screenDraw(Graphics g) {
		if(isMainScreen) {			
			g.drawImage(mainScreen, 0, 0, null);
		}
		if(isLoadingScreen) {			
			g.drawImage(loadingScreen, 0, 0, null);
		}
		if(isGameScreen) {			
			g.drawImage(gameScreen, 0, 0, null);
			game.gameDraw(g);
		}
		this.repaint();
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
            case KeyEvent.VK_LEFT:
                game.setLeft(true);
                break;
            case KeyEvent.VK_RIGHT:
                game.setRight(true);
                break;
            case KeyEvent.VK_SPACE:
            	game.setShooting(true);
            	break;
            case KeyEvent.VK_R:
            	if(game.isOver())game.reset();
            	break;
			case KeyEvent.VK_ENTER:
				if(isMainScreen) {					
					gameStart();
				}
				break;
			case KeyEvent.VK_ESCAPE:
				System.exit(1);
				break;
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
            case KeyEvent.VK_LEFT:
                game.setLeft(false);
                break;
            case KeyEvent.VK_RIGHT:
                game.setRight(false);
                break;
            case KeyEvent.VK_SPACE:
            	game.setShooting(false);
            	break;
			}
			
		}
		
	}
}
