package yjp.GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyCounter implements ActionListener{
	private JButton incBtn;
	private JButton desBtn;
	private JButton resetBtn;
	private int count = 0;
	
	private JLabel label1;
	private JLabel label2;
	public MyCounter(){
		init();
		
		JFrame frame = new JFrame();
		frame.setLayout(null);
		frame.add(incBtn);
		frame.add(desBtn);
		frame.add(resetBtn);
		frame.add(label1);
		frame.add(label2);
		
		frame.setSize(400,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private void init() {
		incBtn = new JButton("CountUp");
		incBtn.setBounds(250, 20,100,20);
		incBtn.addActionListener(this);
		desBtn = new JButton("CountDown");
		desBtn.setBounds(250, 50,100,20);
		desBtn.addActionListener(this);
		
		resetBtn = new JButton("CountReset");
		resetBtn.setBounds(250,80,100,20);
		resetBtn.addActionListener(this);
		
		label1 = new JLabel("counter");
		label1.setBounds(50, 20,100,20);
		label1.setBackground(Color.GREEN);
		label1.setOpaque(true);
		
		label2 = new JLabel(String.valueOf(count));
		label2.setBounds(50, 60,100,100);
		label2.setBackground(Color.YELLOW);
		label2.setOpaque(true);
		
		label1.setFont(new Font("Arial",Font.BOLD,20));
		label2.setFont(new Font("Arial",Font.BOLD,60));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == incBtn) count++;
		else if(e.getSource() == desBtn) count--;
		else if(e.getSource() == resetBtn) count = 0;
		
		label2.setText(String.valueOf(count));
	}
	public static void main(String[] args) {
		new MyCounter();
	}
}
