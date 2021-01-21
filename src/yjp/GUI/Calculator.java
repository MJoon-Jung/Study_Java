package yjp.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{
	private TextField txt;
	private JPanel panel;
	private JButton[] numberButtons;
	private JButton addButton,subButton,mulButton,divButton,decButton,equButton,delButton,clrButton,negButton;
//	private Font myFont = new Font(Font.SANS_SERIF,Font.SERIF);
	private double num1;
	private double num2;
	private double result;
	private String operator = "";
	
	
	Calculator(){
		txt = new TextField(35);
		txt.setBounds(50, 25, 300, 50);
//		txt.setFont(myFont);
		txt.setEditable(false);
		
		panel = new JPanel();
		panel.setBounds(50, 100, 300, 300);
		panel.setLayout(new GridLayout(0,4,10,10));
		
		numberButtons = new JButton[10];
		for(int i = 0; i < numberButtons.length; i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
//			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
			numberButtons[i].addActionListener(this);
		}
		addButton = new JButton("+");
		addButton.setFocusable(false);
		addButton.addActionListener(this);
		subButton = new JButton("-");
		subButton.setFocusable(false);
		subButton.addActionListener(this);
		mulButton = new JButton("*");
		mulButton.addActionListener(this);
		mulButton.setFocusable(false);
		divButton = new JButton("/");
		divButton.addActionListener(this);
		divButton.setFocusable(false);
		decButton = new JButton(".");
		decButton.addActionListener(this);
		decButton.setFocusable(false);
		equButton = new JButton("=");
		equButton.addActionListener(this);
		equButton.setFocusable(false);
		
		delButton = new JButton("Delete");
		delButton.setBounds(150, 430, 100, 50);
		
		clrButton = new JButton("Clear");
		clrButton.setBounds(250, 430, 100, 50);
		
		negButton = new JButton("(-)");
		negButton.setBounds(50, 430, 100, 50);
		
		this.setLayout(null);
		this.add(txt);
		this.add(panel);
		this.add(delButton);
		this.add(negButton);
		this.add(clrButton);
		
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
		
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		
		panel.add(decButton);
		panel.add(numberButtons[0]);
		panel.add(equButton);
		panel.add(divButton);
		
//		this.setLocationRelativeTo(null); //화면 중앙에 나타나게 해줌
		this.setTitle("Calculator");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(420,550);
		this.setResizable(false);
		this.setVisible(true);
	}
	public static void main(String [] args) {
		JFrame ccl = new Calculator();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < numberButtons.length; i++) {
			if(e.getSource() == numberButtons[i]) {
				System.out.println(i + "버튼 클릭");
				String str = txt.getText();
				txt.setText(str.concat(String.valueOf(i)));
				break;
			}
			if(e.getSource() == decButton) {
				System.out.println("decimal 버튼 클릭");
			}
			else if(e.getSource() == addButton || e.getSource() == subButton
							|| e.getSource() == mulButton || e.getSource() == divButton) {
				System.out.println(((JButton)(e.getSource())).getText() + "버튼 클릭");
				String str = txt.getText();
				num1 = Double.parseDouble(str);
				operator = ((JButton)(e.getSource())).getText();
				txt.setText("");
			}
			else if(e.getSource() == equButton) {
				System.out.println("= 버튼 클릭");
				String str = txt.getText();
				num2 = Double.parseDouble(str);
				switch(operator) {
					case "+":
						result = num1 + num2;
						break;
					case "-":
						result = num1 - num2;
						break;
					case "*":
						result = num1 * num2;
						break;
					case "/":
						result = num1 / num2;
						break;
					default:
						break;
				}
				txt.setText(String.valueOf(result));
			}
			else if(e.getSource() == clrButton) {
				txt.setText("");
				System.out.println("clear 버튼 클릭");
			}
			else if(e.getSource() == delButton) {
				String str = txt.getText();
				if(txt.getText().length() > 0) {					
					txt.setText(str.substring(0,str.length()-1));
				}
				System.out.println("delete 버튼 클릭");
			}
			else if(e.getSource() == negButton) {
				String str = txt.getText();
				double temp = Double.parseDouble(str);
				temp *= -1;
				txt.setText(String.valueOf(temp));
				System.out.println("- 버튼 클릭");
			}
		}
		
	}
}
