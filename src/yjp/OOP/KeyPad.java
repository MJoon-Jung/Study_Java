package yjp.OOP;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyPad extends JFrame implements ActionListener{
	JTextField txtField;
	JButton btn;
	KeyPad(){
		JPanel panel = new JPanel();
		txtField = new JTextField(20);
		String [] btn_label = {"1","2","3","4","5","6","7","8","9"};
		
		for(int i = 0; i < btn_label.length; i++) {
			btn = new JButton(btn_label[i]);
			panel.add(btn);
			btn.addActionListener(this);
		}
		
		this.pack();
		panel.setLayout(new GridLayout(3,3,5,5));
		this.add(panel, BorderLayout.CENTER);
		this.add(txtField,BorderLayout.NORTH);
		
		setSize(340,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommend = e.getActionCommand();
		txtField.setText(txtField.getText() + actionCommend);
	}
	public static void main(String[] args) {
		KeyPad k = new KeyPad();
	}
}
