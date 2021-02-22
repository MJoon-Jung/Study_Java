package yjp.GUI;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImagePuzzle extends JFrame implements ActionListener{
	private int pieces = 4;
	private int totalPices = pieces * pieces;
	private BufferedImage img;
	private ArrayList<Integer>pieceList = new ArrayList<>();
	
	public static void main(String[] args) {
		new ImagePuzzle();
	}
	public ImagePuzzle() {
		this.setTitle("Puzzle game");
		try {
			img = ImageIO.read(new File("galaxy.jpg"));
		}catch(IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		for(int i = 0; i < totalPices; i++) {
			pieceList.add(i);
		}
		this.add(new ImagePanel(), BorderLayout.CENTER);
		JButton imgdivideBtn = new JButton("Divide");
		this.add(imgdivideBtn, BorderLayout.SOUTH);
		
		imgdivideBtn.addActionListener(this);
		this.setSize(img.getWidth()+100,img.getHeight()+ 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	private void shuffle() {
		for(int i = 0; i < totalPices; i++) {
			pieceList.add(i);
		}
		Collections.shuffle(pieceList);
		
		System.out.println(pieceList);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		shuffle();
		repaint();
	}
	class ImagePanel extends JPanel implements MouseListener{
		private int pieceWidth,pieceHeight;
		private int priorClickedNum = -1;
		public ImagePanel() {
			this.addMouseListener(this);
		}
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			pieceWidth = img.getWidth() / pieces;
			pieceHeight = img.getHeight() / pieces;
			int idx = 0;
			for(int x = 0; x < pieces; x++) {
				for(int y = 0; y < pieces; y++) {
					int sx = pieceList.get(idx) / pieces * pieceWidth;
					int sy = pieceList.get(idx) % pieces * pieceHeight;
					int dx = x * pieceWidth;
					int dy = y * pieceHeight;
					
					g.drawImage(img, dx, dy, dx+pieceWidth,dy+pieceHeight,sx,sy,sx+pieceWidth,sy+pieceHeight,null);
					idx++;
				}
			}
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			
			int row = y / pieceHeight;
			int col = x / pieceWidth;
			int clikedPiece = col * pieces + row;
			System.out.println(clikedPiece + " 가 클릭되었습니다.");
			
			if(priorClickedNum == -1) {
				priorClickedNum = clikedPiece;
			}else {
				if(priorClickedNum == clikedPiece) {
					priorClickedNum = -1;
				}else{
					int temp = pieceList.get(priorClickedNum);
					pieceList.set(priorClickedNum, pieceList.get(clikedPiece));
					pieceList.set(clikedPiece, temp);
					
					priorClickedNum = -1;
					
					repaint();
				}
			}
			
			System.out.println(pieceList);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}
