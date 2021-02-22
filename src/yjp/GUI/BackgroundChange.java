package yjp.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BackgroundChange extends JFrame{
	private JButton button1;
	private JButton button2;
	private JPanel panel;
	public BackgroundChange() {
		button1 = new JButton("RED");
		button2 = new JButton("GREEN");
		panel = new JPanel();
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				panel.setBackground(Color.red);
				getContentPane().setBackground(Color.RED);
				
			}
		});
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				panel.setBackground(Color.GREEN);
				getContentPane().setBackground(Color.GREEN);
			}
		});
		
		panel.add(button1);
		panel.add(button2);
		
		this.add(panel,BorderLayout.NORTH);
		
		setTitle("BackgroundChange");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		BackgroundChange bc = new BackgroundChange();
	}
}
