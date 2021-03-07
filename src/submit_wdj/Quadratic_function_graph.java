package submit_wdj;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quadratic_function_graph extends JPanel implements ActionListener{
	JTextField a, b, c;
	double A, B, C;
	int SCREEN_WIDTH = 800;
	int SCREEN_HEIGHT = 800;
	public Quadratic_function_graph() {
		a = new JTextField("1.0", 10);
		b = new JTextField("0", 10);
		c = new JTextField("0", 10);
		
		add(a);
		add(b);
		add(c);
		
		JButton btn = new JButton("DRAW");
		add(btn);
		btn.addActionListener(this);
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawLine(0, SCREEN_HEIGHT / 2, SCREEN_WIDTH, SCREEN_HEIGHT/2);
		g2d.drawLine(SCREEN_WIDTH / 2, 0, SCREEN_WIDTH / 2, SCREEN_HEIGHT);

		g2d.setPaint(Color.black);
		for(int i = SCREEN_HEIGHT; i >= 0; i -= 5) {
			g2d.drawLine(SCREEN_WIDTH / 2 -1, i , SCREEN_WIDTH / 2 + 1 , i);
			g2d.drawLine(i, SCREEN_HEIGHT / 2 - 1, i, SCREEN_HEIGHT / 2 + 1);
		}
		g2d.setStroke(new BasicStroke(3));
		
//		for(int i = -SCREEN_WIDTH/2; i <= SCREEN_WIDTH/2; i+= 5) {
//			g2d.setPaint(Color.red);
//			int x = SCREEN_WIDTH / 2 + i;
//			int y = SCREEN_HEIGHT / 2 - (int)(A * x * x + B * x + C);
//			g2d.fillOval(SCREEN_WIDTH / 2 + x - 2, SCREEN_HEIGHT / 2 - y - 2, 2, 4);
//			
//		}
		g2d.setColor(Color.red);
		for(int i = -100; i <= 100; i++) {
			int x = i;
			int y = (int) (A * x*x +B * x + C);
			g2d.fillOval(SCREEN_WIDTH / 2 + x - 2, SCREEN_HEIGHT / 2 - y - 2, 2, 4);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		A = Double.parseDouble(a.getText());
		B = Double.parseDouble(b.getText());
		C = Double.parseDouble(c.getText());
		repaint();
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Quadratic_function_graph function = new Quadratic_function_graph();
		frame.add(function);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocation(100,0);
		frame.setSize(function.SCREEN_WIDTH,function.SCREEN_HEIGHT);
		frame.setVisible(true);
	}

}
