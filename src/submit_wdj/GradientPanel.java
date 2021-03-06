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
import java.awt.geom.Arc2D.Float;

import javax.swing.JPanel;

public class GradientPanel extends JPanel{
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(3));
		GradientPaint gp = new GradientPaint(0,10,Color.white,0,70,Color.red);
	
		g2d.setPaint(gp);
		g2d.fill(new Rectangle2D.Float(10,10,70,80));
		g2d.fill(new RoundRectangle2D.Float(110,10,70,80,20,20));
		g2d.fill(new Ellipse2D.Float(210,10,80,80));
		g2d.fill(new Arc2D.Float(310,10,80,80,90,90,Arc2D.OPEN));
		g2d.fill(new Arc2D.Float(410,10,80,80,0,180,Arc2D.CHORD));
		g2d.fill(new Arc2D.Float(510,10,80,80,45,90,Arc2D.PIE));
		
		g2d.draw(getBounds());
	}
}
