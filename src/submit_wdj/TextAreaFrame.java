package submit_wdj;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class TextAreaFrame extends JFrame implements ActionListener{
	protected JTextField textField;
	protected JTextArea textArea;
	public TextAreaFrame() {
		textField = new JTextField(30);
		textField.addActionListener(this);
		add(textField, BorderLayout.NORTH);
		
		textArea = new JTextArea(10,30);
		textArea.setEditable(false);
		add(textArea, BorderLayout.CENTER);
		JScrollPane scrollPane = new JScrollPane(textArea); //scrollbar
		add(scrollPane);
		
		pack();
		
		
		
		setTitle("Text Area Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		textArea.append(textField.getText() + "\n");
//		textField.setText("");
		textField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}
	public static void main(String[] args) {
		new TextAreaFrame();
	}
}
