package PuzzleGame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class PuzzleGame extends JFrame{
//	LoginPanel login = new LoginPanel();
	MyPanel mypanel = new MyPanel();
	ResetPanel rpanel = new ResetPanel();
//	JPanel currPanel;
	PuzzleGame(){
		
		rpanel.reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mypanel.Rename();
			}
			
		});
		
		this.add(mypanel);
		this.add(rpanel,new BorderLayout().SOUTH);
		
		setTitle("PuzzleGame");
		setLocation(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,600);
		setResizable(false);
		setVisible(true);
	}
}
