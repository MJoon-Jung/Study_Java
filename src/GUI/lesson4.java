package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class lesson4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lesson4 window = new lesson4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public lesson4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 436, 263);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("D:\\programes\\java_workspace\\Java_self\\src\\Game\\Shooting\\image\\enemy_attack.png"));
		btnNewButton.setSelectedIcon(new ImageIcon("D:\\programes\\java_workspace\\Java_self\\src\\Game\\Shooting\\image\\enemy.png"));
		btnNewButton.setBounds(32, 76, 132, 100);
		btnNewButton.setPressedIcon(new ImageIcon("D:\\programes\\java_workspace\\Java_self\\src\\Game\\Shooting\\image\\player_attack.png"));
		panel.add(btnNewButton);
	}

}
