package submit_wdj;

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
	public Quadratic_function_graph() {
		a = new JTextField("1.0", 10);
		b = new JTextField("-5.0", 10);
		c = new JTextField("6.0", 10);
		
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
		g2d.drawLine(0, 200, 400, 200);
		g2d.drawLine(200, 0, 200, 400);
		g2d.setPaint(Color.red);
		
		for(int i = -100; i < 100; i++) {
			int x = i;
			int y = (int) (A * x*x +B * x + C);
			g2d.fillOval(200+x-2, 200 - (y-2), 4, 4);
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
		
		frame.add(new Quadratic_function_graph());
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setSize(500,400);
		frame.setVisible(true);
	}

}
