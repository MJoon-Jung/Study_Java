package PuzzleGame;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameOver extends JPanel{
	public GameOver() {
		JLabel label = new JLabel("GAME OVER");
		this.add(label);
		setVisible(false);
	}
}
