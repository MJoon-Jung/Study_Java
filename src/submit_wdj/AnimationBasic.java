package submit_wdj;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AnimationBasic extends JPanel implements ActionListener{
	private BufferedImage image;
	private Timer timer;
	private int x,y;
	private int image_WIDTH; //이미지 가로폭
	private int image_HEIGHT; // 이미지 세로폭
	private final int SCREEN_WIDTH = 500;
	private final int SCREEN_HEIGHT = 500;
	private final int START_X; //x의 초기값
	private final int START_Y; //y의 초기값
	private int dir = 1; //어느쪽으로 움직일지 방향을 정함
	private int image_speed = 15;  // 이미지 속도
	
	public AnimationBasic() {
		//image file 읽어서 image object 생성
		//20ms 마다 event 발생시키는 timer 생성 timer start시킴
		File file = new File("spaceShip2.png");
		try {
			image = ImageIO.read(file);
			image_WIDTH = image.getWidth();
			image_HEIGHT = image.getHeight();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(1);
		}
		//초기값 설정
		START_X = 0 + image_WIDTH; 
		START_Y = 470 - image_HEIGHT;
		
		x = START_X;
		y = START_Y;
		
		timer =  new Timer(20, this);
		timer.start();
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//x,y image 를 그린다
		
		g.drawImage(image, x, y, this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//x,y 좌표 변경
		moveChange(dir);
		
		// 왼쪽 아래에서 오른쪽 위로 대각선 방향 움직임
		if(dir == 1) { 
			if(y - image_speed < 0) {
				dir = 4;
			}
			else if(x + image_WIDTH + image_speed > SCREEN_WIDTH) {
				dir = 2;
			}
		}
		//오른쪽아래에서 왼쪽 위로 움직임
		else if(dir == 2) {
			if(y - image_speed < 0) {
				dir = 3;
			}
			else if(x - image_speed < 0) {
				dir = 1;
			}
		}
		//오른쪽 위에에서 왼쪽 아래로 움직임
		else if(dir == 3) {
			if(x - image_speed < 0) {
				dir = 4;
			}
			else if(y + image_HEIGHT + image_speed +15> SCREEN_HEIGHT) {
				dir = 2;
			}
		}
		//왼쪽 위에서 오른쪽 아래로 움직임
		else if(dir == 4) {
			if(y + image_HEIGHT + image_speed + 15> SCREEN_HEIGHT) {
				dir = 1;
			}
			else if(x + image_WIDTH + image_speed > SCREEN_WIDTH) {
				dir = 3;
			}
		}
		repaint();
	}
	//dir 움직임 1~4
	public void moveChange(int dir) {
		switch(dir) {
			case 1:{
				x += image_speed;
				y -= image_speed;
				break;
			}
			case 2:{
				x -= image_speed;
				y -= image_speed;
				break;
			}
			case 3:{
				x -= image_speed;
				y += image_speed;
				break;
			}
			case 4:{
				x += image_speed;
				y += image_speed;
				break;
			}
		}
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		AnimationBasic app = new AnimationBasic();
		frame.add(app);
		frame.setTitle("animation practice");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(app.SCREEN_WIDTH,app.SCREEN_HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
