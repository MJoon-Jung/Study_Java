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
	private int image_WIDTH; //�̹��� ������
	private int image_HEIGHT; // �̹��� ������
	private final int SCREEN_WIDTH = 500;
	private final int SCREEN_HEIGHT = 500;
	private final int START_X; //x�� �ʱⰪ
	private final int START_Y; //y�� �ʱⰪ
	private int dir = 1; //��������� �������� ������ ����
	private int image_speed = 15;  // �̹��� �ӵ�
	
	public AnimationBasic() {
		//image file �о image object ����
		//20ms ���� event �߻���Ű�� timer ���� timer start��Ŵ
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
		//�ʱⰪ ����
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
		//x,y image �� �׸���
		
		g.drawImage(image, x, y, this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//x,y ��ǥ ����
		moveChange(dir);
		
		// ���� �Ʒ����� ������ ���� �밢�� ���� ������
		if(dir == 1) { 
			if(y - image_speed < 0) {
				dir = 4;
			}
			else if(x + image_WIDTH + image_speed > SCREEN_WIDTH) {
				dir = 2;
			}
		}
		//�����ʾƷ����� ���� ���� ������
		else if(dir == 2) {
			if(y - image_speed < 0) {
				dir = 3;
			}
			else if(x - image_speed < 0) {
				dir = 1;
			}
		}
		//������ �������� ���� �Ʒ��� ������
		else if(dir == 3) {
			if(x - image_speed < 0) {
				dir = 4;
			}
			else if(y + image_HEIGHT + image_speed +15> SCREEN_HEIGHT) {
				dir = 2;
			}
		}
		//���� ������ ������ �Ʒ��� ������
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
	//dir ������ 1~4
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
