package yjp.GUI;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoadImage extends JPanel{
	static BufferedImage img;
	static {
		try {
			img = ImageIO.read(new File("galaxy.jpg"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("Image null");
			System.exit(1);
		}		
	}
	public LoadImage(){
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, null);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JLabel label = new JLabel();
//		LoadImage panel = new LoadImage();
		label.setIcon(new ImageIcon(img));
		frame.add(label);
//		frame.add(panel);
		frame.setSize(img.getWidth(),img.getHeight());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		new LoadImage();
	}
}
