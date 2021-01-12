package yjp.GUI;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame{
	private JPanel panel;
	private JTextField textField;
	private JButton[] buttons;
	private String[] labels = {"Backspace","","","CE","C",
								"7","8","9","/","sqrt",
								"4","5","6","x","%",
								"1","2","3","-","1/x",
								"0","+/-",".","+","="};
	public Calculator() {
		textField = new JTextField(35);
		panel = new JPanel();
		textField.setText("0.");
		textField.setEnabled(false);
		
		panel.setLayout(new GridLayout(0,5,3,3));
		buttons = new JButton[25];
		
		int index = 0;
		
		for(int rows = 0; rows < 5; rows++) {
			for(int cols = 0; cols < 5;cols++) {
				buttons[index] = new JButton(labels[index]);
				if(cols >= 3) buttons[index].setForeground(new Color(255,0,0));
				else buttons[index].setForeground(Color.BLUE);
				
				buttons[index].setBackground(Color.YELLOW);
				panel.add(buttons[index++]);
			}
		}
		this.add(textField,BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
		
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String [] args) {
		JFrame frame = new Calculator();
	}
}
