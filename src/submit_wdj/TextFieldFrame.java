package submit_wdj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame implements ActionListener{
	private JButton button;
	private JTextField text,result;
	private JLabel text_label,result_label;
	public TextFieldFrame() {
		JPanel panel = new JPanel();
		
		text_label = new JLabel("숫자 입력 : ");
		text = new JTextField(20);
		
		result_label = new JLabel("제곱한 값 : ");
		result = new JTextField(20);
//		result.setEnabled(false);
		result.setEditable(false);
		
		button = new JButton("OK");
		button.addActionListener(this);
		
		panel.add(text_label);
		panel.add(text);
		panel.add(result_label);
		panel.add(result);
		panel.add(button);
		
		this.add(panel);
		setSize(300,130);
		setTitle("제곱 계산하기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int n = Integer.parseInt(text.getText());
		result.setText(n*n + "");
		text.requestFocus();
	}
	public static void main(String[] args) {
		new TextFieldFrame();
	}
}
