package submit_wdj;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class RadioButtonDemo extends JFrame implements ActionListener{
	private JPanel topPanel1,sizePanel1,resultPanel1;
	private JRadioButton small,medium,large;
	private JLabel textLabel;
	public RadioButtonDemo() {
		topPanel1 = new JPanel();
		JLabel label = new JLabel("어떤 크기의 커피를 주문하시겠습니까");
		topPanel1.add(label);
		
		sizePanel1 = new JPanel();
		small = new JRadioButton("small size");
		small.addActionListener(this);
		medium = new JRadioButton("medium size");
		medium.addActionListener(this);
		large = new JRadioButton("large size");
		large.addActionListener(this);
		
		ButtonGroup group = new ButtonGroup();
		group.add(small);
		group.add(medium);
		group.add(large);
		
		sizePanel1.add(small);
		sizePanel1.add(medium);
		sizePanel1.add(large);
		
		Border border = BorderFactory.createTitledBorder("크기");
		sizePanel1.setBorder(border);
		
		resultPanel1 = new JPanel();
		textLabel = new JLabel("크기가 선택되지 않았습니다");
		textLabel.setForeground(Color.red);
		resultPanel1.add(textLabel);
		
		this.add(topPanel1, BorderLayout.NORTH);
		this.add(sizePanel1, BorderLayout.CENTER);
		this.add(resultPanel1, BorderLayout.SOUTH);
		
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(400,180);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == small) {
			textLabel.setText("small size cliked");
		}else if(e.getSource() == medium) {
			textLabel.setText("medium size cliked");
		}else {
			textLabel.setText("large size cliked");
		}
	}
	public static void main(String[] args) {
		new RadioButtonDemo();
	}
}
