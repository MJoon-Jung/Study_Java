package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson1 {

	private JFrame frame;
	private final JPanel startpage = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lesson1 window = new Lesson1();
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
	public Lesson1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		startpage.setBounds(0, 0, 786, 563);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.getContentPane().add(startpage);
		startpage.setLayout(null);
		
		JButton btn_next = new JButton("Go to Next");
		btn_next.setFont(new Font("양재백두체B", Font.PLAIN, 31));
		btn_next.setBounds(33, 139, 269, 296);
		startpage.add(btn_next);
		
		JPanel endpage = new JPanel();
		endpage.setBounds(0, 0, 786, 563);
		frame.getContentPane().add(endpage);
		endpage.setLayout(null);
		
		JButton btn_before = new JButton("Go to Last");
		btn_before.setFont(new Font("양재백두체B", Font.PLAIN, 25));
		btn_before.setBounds(499, 133, 220, 302);
		endpage.add(btn_before);
		
		endpage.setVisible(false);
		btn_next.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				endpage.setVisible(true);
				startpage.setVisible(false);
			}
		});
		btn_before.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				startpage.setVisible(true);
				endpage.setVisible(false);
			}
		});
	}

}
