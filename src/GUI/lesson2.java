package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ImagePanel extends JPanel{
	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0,0,null);
	}
}

public class lesson2{
	private static Image mainScreen = new ImageIcon("src/Game/Shooting/image/main_screen.png").getImage();
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Lesson2");
		frame.setSize(1280,720);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		ImagePanel panel = new ImagePanel(mainScreen);
		frame.add(panel);
		frame.pack();
	}
	
}

















