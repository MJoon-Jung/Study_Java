package submit_wdj;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckBoxDemo extends JPanel implements ItemListener{
	private JCheckBox[] checkBoxes = new JCheckBox[3];
	private String [] fruits = {"grape","apple","orange"};
	private JLabel [] labels = new JLabel [3];
	private ImageIcon [] icons = new ImageIcon[3];
	{
		icons[0] = new ImageIcon("Images/grape.jpg");
		icons[1] = new ImageIcon("Images/apple.jpg");
		icons[2] = new ImageIcon("Images/orange.jpg");
	}
	public CheckBoxDemo() {
		JPanel labelPanel = new JPanel();
		labelPanel.setLayout(new GridLayout(1,0));
//		this.setLayout(new GridLayout(0,4));
		
		for(int i = 0; i < 3; i++) {
			checkBoxes[i] = new JCheckBox(fruits[i]);
			checkBoxes[i].addItemListener(this);
			labels[i] = new JLabel();
//			labels[i].setIcon(icons[i]);
		}
		
		JPanel checkBoxPanel1 = new JPanel(new GridLayout(1,0));
		for(int i = 0; i < checkBoxes.length; i++) {
			checkBoxPanel1.add(checkBoxes[i]);
		}
		this.add(checkBoxPanel1);
		for(int i = 0; i < labels.length; i++) {
			labelPanel.add(labels[i]);
		}
		this.setLayout(new GridLayout(2,1));
		this.add(labelPanel);
		this.add(checkBoxPanel1);
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		ImageIcon icon = null;
		Object source = e.getItemSelectable();
		
		for(int i = 0; i < 3; i++) {
			if(source == checkBoxes[i]) {
				if(e.getStateChange() == ItemEvent.SELECTED) {					
					labels[i].setIcon(icons[i]);
				}else {
					labels[i].setIcon(null);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		CheckBoxDemo panel = new CheckBoxDemo();
		
		frame.add(panel);
		frame.setSize(1000,600);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
