package submit_wdj.pingponggame;

import java.awt.Graphics;

public class Game extends Thread{
	private int delay = 20;
	private long pretime;
	private int cnt;
	
	private Paddle p1 = new Paddle(Main.SCREEN_WIDTH - 30, Main.SCREEN_HEIGHT / 2 - 20);
	private Paddle p2 = new Paddle(0, p1.y);
	private Ball ball = new Ball(Main.SCREEN_WIDTH / 2 - 15, Main.SCREEN_HEIGHT / 2 - 15);
	
	private int playerSpeed = 5;
	private boolean w,s,up,down;
	
	int score1,score2;
	private int dir = (int)(Math.random() * 4) + 1;
	
	boolean isGameTrue = true;
	@Override
	public void run() {
		cnt = 0;
		while(true) {
			pretime = System.currentTimeMillis();
			if(System.currentTimeMillis() - pretime < delay) {
				try {
					Thread.sleep(delay - System.currentTimeMillis() + pretime);
					keyProcess();
					Colligion();
					move();
					cnt++;
					if(!isGameTrue)break;
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	}
	public void gameDraw(Graphics g) {
		g.drawImage(p1.image, p1.x, p1.y, null);
		g.drawImage(p2.image, p2.x, p2.y, null);
		g.drawImage(ball.image, ball.x, ball.y, null);
	}
	public void move() {
		if(cnt % 250 == 0) {
			ball.speed++;
		}
		ball.move(dir);
	}
	private void Colligion() {
		if(ball.x + ball.width + ball.speed > p1.x && ball.y > p1.y && ball.y < p1.y + p1.height) {
			if(dir == 1) {
				dir = 2;
			}else if(dir == 4) {
				dir = 3;
			}
		}
		if(ball.x < p2.x + p2.width  && ball.y >  p2.y && ball.y < p2.y + p2.height) {
			if(dir == 3) {
				dir = 4;
			}else if(dir == 2) {
				dir = 1;
			}
		}
//		score 양 옆 충돌 처리
		if(ball.x < 0) {
			if(dir == 2) {
				dir = 1;
			}else if(dir == 3) {
				dir = 4;
			}
			score1++;
		}
		if(ball.x + ball.width + ball.speed > Main.SCREEN_WIDTH ) {
			if(dir == 1) {
				dir = 2;
			}else if(dir == 4) {
				dir = 3;
			}
			score2++;
		}
		//위아래 충돌처리
		if(ball.y - ball.speed < 0) {
			if(dir == 1) {
				dir = 4;
			}else if(dir == 2) {
				dir = 3;
			}
		}
		if(ball.y + ball.height + ball.speed > Main.SCREEN_HEIGHT) {
			if(dir == 3) {
				dir = 2;
			}else if(dir == 4) {
				dir = 1;
			}
		}
		if(score1 >= 10 || score2 >= 10) {
			isGameTrue = false;
		}
	}
	private void keyProcess() {
		if(up && p1.y - playerSpeed + 4> 0) { 
			p1.y -= playerSpeed;
		}
		if(down && p1.y + playerSpeed + p1.height < Main.SCREEN_HEIGHT) {
			p1.y += playerSpeed;
		}
		if(w && p2.y - playerSpeed > 0) { 
			p2.y -= playerSpeed;
		}
		if(s && p2.y + playerSpeed + p2.height < Main.SCREEN_HEIGHT) {
			p2.y += playerSpeed;
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
