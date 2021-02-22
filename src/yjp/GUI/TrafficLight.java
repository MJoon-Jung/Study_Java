package yjp.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrafficLight extends JFrame{
	public TrafficLight() {
		trafficPanel panel = new trafficPanel();
		
		this.add(panel);
		setSize(300,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(400, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		TrafficLight t = new TrafficLight();
	}
}
class trafficPanel extends JPanel implements ActionListener{
	private int lightNumber = 0;
	public trafficPanel() {
		JPanel panel = new JPanel();
		setLayout(new BorderLayout());
		JButton b=  new JButton("RED");
		JButton b2=  new JButton("YELLOW");
		JButton b3=  new JButton("GREEN");
		b.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		panel.add(b,BorderLayout.SOUTH);
		panel.add(b2,BorderLayout.SOUTH);
		panel.add(b3,BorderLayout.SOUTH);
		this.add(panel, BorderLayout.SOUTH);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
//		System.out.println("paint component");
		g.setColor(Color.BLACK);
		g.drawOval(100, 100, 100, 100);
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);
		
		if(lightNumber == 1) {
			g.setColor(Color.GREEN);
			g.fillOval(100, 100, 100, 100);
		}
		else if(lightNumber == 2) {
			g.setColor(Color.YELLOW);
			g.fillOval(100, 200, 100, 100);
		}else if(lightNumber == 3){
			g.setColor(Color.RED);
			g.fillOval(100, 300, 100, 100);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s  = e.getActionCommand();
		
		if(s.equals("RED")) {
			lightNumber = 3;
		}else if(s.equals("YELLOW")) {
			lightNumber = 2;
		}else if(s.equals("GREEN")) {
			lightNumber = 1;
		}
		this.repaint();
		
	}
}