package PuzzleGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel{
	JTextField id = new JTextField(20);
	JPasswordField psd = new JPasswordField(20);
	JLabel idl = new JLabel("ID");
	JLabel psdl = new JLabel("PSD");
	JButton login_btn = new JButton("Login");
	LoginPanel(){
		login_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String ID = "gjgjajaj";
				String PSD = "1111";
				if(ID.equals(id.getText()) && PSD.equals(psd.getText())){
					JOptionPane.showMessageDialog(new PuzzleGame(), "Correct");
					
				}else {
					JOptionPane.showMessageDialog(null, "Login fail");
				}
			}
				
		});
		
		this.add(idl);
		this.add(id);
		this.add(psdl);
		this.add(psd);
		this.add(login_btn);
	}
}
