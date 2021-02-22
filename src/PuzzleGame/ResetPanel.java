package PuzzleGame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ResetPanel extends JPanel{
	JButton reset = new JButton("RESET");
	ResetPanel(){
		this.add(reset, new BorderLayout().CENTER);	
	}
}
