package oop;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame{
	private final int SCREEN_WIDTH = 340;
	private final int SCREEN_HEIGHT = 530;
	private JTextField txt;
	private String prev_operation = "";
	private String num = "";
	private ArrayList<String> equation = new ArrayList<String>();
	Calculator(){
		setLayout(null);
		
		txt = new JTextField();
		txt.setBounds(5, 5, 315, 80);
		txt.setBackground(Color.WHITE);
		txt.setFont(new Font("Arial", Font.BOLD, 15));
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,4,10,10));
		panel.setBounds(12,100,300,380);
		
		String [] btn_names = {"%","DEL","C","/",
								"7","8","9","x",
								"4","5","6","-",
								"1","2","3","+",
								"+/-","0",".","="};
		
		JButton btns [] = new JButton [btn_names.length];
		for(int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(btn_names[i]);
			if(btn_names[i].equals("CE")||btn_names[i].equals("C")) {
				btns[i].setBackground(Color.RED);
			}
			else if((i >= 4 && i <=6) || (i >= 8 && i <= 10) || (i >= 12 && i <= 14) || (i == 17)){
				btns[i].setBackground(Color.BLACK);
			}
			else btns[i].setBackground(Color.GRAY);
			
			btns[i].setFont(new Font("Arial",Font.BOLD,23));
			btns[i].setForeground(Color.WHITE);
			btns[i].setBorderPainted(false);
			btns[i].addActionListener(new PadActionListener());
			panel.add(btns[i]);
		}
		
		add(txt);
		add(panel);
		
		
		setTitle("Calculator");
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	class PadActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String operation = e.getActionCommand();
			if(operation.equals("C")) {
				txt.setText("");
			}
//			else if(operation.equals("=")) {
//				
//			}
			else {
				txt.setText(txt.getText() + e.getActionCommand());
			}
		}
	}
	private void fullTextPasing(String txt) {
		equation.clear();
		for(int i = 0; i < txt.length(); i++) {
			char ch = txt.charAt(i);
			
			if(ch == '-' || ch == '+' || ch =='/') {
				equation.add(num);
				num = "";
				equation.add(ch + "");
			}
			else {
				num = num + ch;
			}
		}
		equation.add(num);
	}
	public static void main(String[] args) {
		new Calculator();
	}

}
