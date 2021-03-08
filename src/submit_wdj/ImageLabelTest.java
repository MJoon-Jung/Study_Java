package submit_wdj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageLabelTest extends JFrame implements ActionListener{
	private JPanel panel;
	private JLabel label;
	private JButton button;
	private ImageIcon icon = new ImageIcon("button_icon.jpg");
	private ImageIcon dog = new ImageIcon("dog.jpg");
	
	public ImageLabelTest() {
		panel = new JPanel();
		label = new JLabel("�̹����� ���÷��� ��ư�� ��������");
		
		button = new JButton("�̹��� ����");
		
		panel.add(label);
		panel.add(button);
		
		button.setIcon(icon);
		button.addActionListener(this);
		
		this.add(panel);
		this.setSize(600,600);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		File file = new File("dog.jpg");
//		System.out.println(file.getAbsolutePath());
		
		String s = button.getText();
		if(s.equals("�̹��� ����")) {
			label.setIcon(dog);
			label.setText(null);
			button.setText("�������");
		}else {
			label.setIcon(null);
			label.setText("�̹����� ������ ��ư�� Ŭ��");
			button.setText("�̹��� ����");
		}
	}
	public static void main(String[] args) {
		new ImageLabelTest();
	}
}
