package submit_wdj;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextConverter extends JFrame implements ActionListener{
	private JButton convertBtn;
	private JButton cancelBtn;
	private JTextArea textIn;
	private JTextArea textOut;
	
	public TextConverter() {
		textIn = new JTextArea(20,30);
		textOut = new JTextArea(20,30);
		textIn.setLineWrap(true);
		textOut.setLineWrap(true);
		textOut.setEditable(false);
		
		JPanel txtPanel = new JPanel();
		
		txtPanel.add(textIn);
		txtPanel.add(textOut);
		
		convertBtn = new JButton("convert");
		convertBtn.addActionListener(this);
		cancelBtn = new JButton("cancel");
		cancelBtn.addActionListener(this);
		
		JPanel btnPanel = new JPanel();
		btnPanel.add(convertBtn);
		btnPanel.add(cancelBtn);
		
		JPanel mainPanel = new JPanel(new GridLayout(2,1,20,20));
		
		mainPanel.add(txtPanel);
		mainPanel.add(btnPanel);
		
		this.add(mainPanel);
		
		this.setSize(700,500);
		this.setTitle("papago");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == convertBtn) {
			String s = textIn.getText();
			String a = s.replace(" ", "");
			if(!a.equals("")) {				
				ApiExamTranslateNmt papago = new ApiExamTranslateNmt();
				papago.setTxt(s);
				textOut.setText(papago.toString());
			}
		}else if(e.getSource() == cancelBtn) {
			textIn.setText("");
			textOut.setText("");
		}
	}
	public static void main(String[] args) {
		new TextConverter();
	}
}
