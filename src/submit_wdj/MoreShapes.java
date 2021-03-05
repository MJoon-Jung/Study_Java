package submit_wdj;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoreShapes extends JFrame{
	public MoreShapes() {
		this.setSize(600,600);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}
	class myPanel extends JPanel{
		
	}
	
	public static void main(String[] args) {
		new MoreShapes();
	}
}
