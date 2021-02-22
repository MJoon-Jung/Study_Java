package yjp.OOP;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	private JButton btn;
	private JLabel label;
	
	MyFrame(){
		JPanel panel = new JPanel();
		
		btn = new JButton("clike me btn");
		btn.addActionListener(new MyInnerListener());
		
		label = new JLabel("clik me");
		
		label.add(btn);
		panel.add(btn);
		panel.add(label);
		this.add(panel);
		
		
		setSize(600,400);
		setTitle("MyFrame");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
	}
	private class MyInnerListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("cliked label");
			label.setFont(new Font(null, Font.BOLD, 25));
			btn.setText("cliked btn");
		}
		
	}
}
