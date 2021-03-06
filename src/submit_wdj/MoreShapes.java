package submit_wdj;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MoreShapes extends JFrame{
	public MoreShapes() {
//		this.add(new myPanel());
		this.add(new GradientPanel());
		this.setSize(600,130);
		this.setTitle("Java 2D shapes");
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new MoreShapes();
	}
}
class myPanel extends JPanel{
	ArrayList<Shape> shapeArray = new ArrayList<>();
	public myPanel() {
		Shape s;
		
		s = new Rectangle2D.Float(10,10,70,80);
		shapeArray.add(s);
		
		s= new RoundRectangle2D.Float(110,10,70,80,20,20);
		shapeArray.add(s);
		
		s = new Ellipse2D.Float(210,10,80,80);
		shapeArray.add(s);
		
		s = new Arc2D.Float(310,10,80,80,90,90,Arc2D.OPEN); 
		shapeArray.add(s);
		
		s = new Arc2D.Float(410,10,80,80,0,180,Arc2D.CHORD);
		shapeArray.add(s);
		
		s= new Arc2D.Float(510,10,80,80,45,90,Arc2D.PIE);
		shapeArray.add(s);
		
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(3));
//		GradientPaint gp = new GradientPaint(0,10,Color.white,0,70,Color.red);
		
		
		for(Shape s : shapeArray) {
			g2d.draw(s);
		}
	
	}
}
