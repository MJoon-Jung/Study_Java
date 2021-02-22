package yjp.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorChooserTest extends JFrame implements ChangeListener,ActionListener{
	private JColorChooser colorChooser = new JColorChooser();
	private MyDrawingColorPanel drawingPanel = new MyDrawingColorPanel();
	private JPanel panel = new JPanel();
	private JButton selectBtn = new JButton("색상선택완료");
	public ColorChooserTest() {
		colorChooser.getSelectionModel().addChangeListener(this);
		
		
		panel.add(colorChooser);
		this.add(panel,BorderLayout.CENTER);
		this.add(selectBtn,BorderLayout.SOUTH);
		selectBtn.addActionListener(this);
		this.pack();
		this.setSize(600,600);
		this.setTitle("Color Picker");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		System.out.println(colorChooser.getColor());
		
	}
	public static void main(String[] args) {
		new ColorChooserTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if(action.equals("색상선택완료")) {
			this.remove(panel);
			this.add(drawingPanel,BorderLayout.CENTER);
			drawingPanel.color = colorChooser.getColor();
			selectBtn.setText("색상선택하기");
		}else {
			this.remove(drawingPanel);
			this.add(panel,BorderLayout.CENTER);
			selectBtn.setText("색상선택완료");
		}
		repaint();
	}

}
class MyDrawingColorPanel extends JPanel implements MouseMotionListener{
	Color color = Color.black;
	JButton resetBtn = new JButton("Reset");
	ArrayList<Point>plist = new ArrayList<Point>();
	class Point{
		int x,y;
		Color color;
	}
	public MyDrawingColorPanel() {
		this.addMouseMotionListener(this);
		resetBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				repaint();
			}
		});
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
//		g.setColor(color);
		for(int i = 0; i < plist.size(); i++) {			
			g.setColor(plist.get(i).color);
			g.drawRect(plist.get(i).x,plist.get(i).y, 5, 5);
		}
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		Point p = new Point();
		p.x = e.getX();
		p.y = e.getY();
		p.color = color;
		plist.add(p);
		
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}