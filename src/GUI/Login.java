package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame{
	public Login() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID");
		JTextField txtID = new JTextField(10);
		JLabel pawd = new JLabel("Password");
		JPasswordField txtpass = new JPasswordField(10);
		JButton login_btn = new JButton("Login");
		
		
		panel.add(label);
		panel.add(txtID);
		panel.add(pawd);
		panel.add(txtpass);
		panel.add(login_btn);
		
		login_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "gjgjajaj";
				String pass = "1234";
				
				if(id.equals(txtID.getText()) && pass.equals(txtpass.getText())) {
					JOptionPane.showMessageDialog(null, "Login Success");
				}
				else {
					JOptionPane.showMessageDialog(null, "Login Fail");
				}
				
			}
		});
		
		this.add(panel);
		
		setVisible(true);
		setSize(600,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Login();
	}
}
