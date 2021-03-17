package submit_wdj.pingponggame;

import java.awt.Graphics;

public class Game extends Thread{
	Paddle player1 = new Paddle(0,Main.SCREEN_HEIGHT / 2 - 45);
	Paddle player2 = new Paddle(Main.SCREEN_WIDTH - player1.width ,player1.height);
	Ball ball = new Ball(Main.SCREEN_WIDTH / 2 - 15, Main.SCREEN_HEIGHT - 15);
	int playerSpeed = 5;
	
	private boolean w,s,up,down;
	
	@Override
	public void run() {
		while(true) {
			
		}
	}
	public void gameDraw(Graphics g) {
		g.drawImage(player1.image, player1.x, player1.y, null);
		g.drawImage(player2.image, player2.x, player2.y, null);
		g.drawImage(ball.image, ball.x, ball.y, null);
	}
	private void Coligion() {
		
	}
	private void keyProcess() {
		if(up && player1.y - playerSpeed > 0) { 
			player1.y -= playerSpeed;
		}
		if(down && player1.y + playerSpeed + player1.height < Main.SCREEN_HEIGHT) {
			player1.y += playerSpeed;
		}
		if(w && player2.y - playerSpeed > 0) { 
			player2.y -= playerSpeed;
		}
		if(s && player2.y + playerSpeed + player2.height < Main.SCREEN_HEIGHT) {
			player2.y += playerSpeed;
		}
	}
	public void setW(boolean w) {
		this.w = w;
	}
	public void setS(boolean s) {
		this.s = s;
	}
	public void setUp(boolean up) {
		this.up = up;
	}
	public void setDown(boolean down) {
		this.down = down;
	}
	
	
}
