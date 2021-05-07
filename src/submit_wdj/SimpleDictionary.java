package submit_wdj;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleDictionary extends JPanel implements ActionListener{
	private JTextField inputField;
	private JButton btn_search;
	private JButton btn_add;
	
	private Map<String,String> dict = new HashMap<>();
	
	public SimpleDictionary() {
		inputField = new JTextField(20);
		btn_search = new JButton("search");
		btn_search.addActionListener(this);
		btn_add = new JButton("add");
		btn_add.addActionListener(this);
		
		this.add(inputField);
		this.add(btn_search);
		this.add(btn_add);
		
		this.setPreferredSize(new Dimension(450,70));
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.add(new SimpleDictionary());
		frame.setTitle("dictionary");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.pack();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String key = inputField.getText().trim();
		
		if(key.length() == 0) {
			inputField.setText("");
			return;
		}
		if(e.getSource() == btn_search) {
			String value = dict.get(key);
			if(value == null) {
				JOptionPane.showMessageDialog(this, "not found", key,JOptionPane.ERROR_MESSAGE);
			}else {				
				JOptionPane.showMessageDialog(this, value, key, JOptionPane.INFORMATION_MESSAGE);
			}
		}else {
			String en = JOptionPane.showInputDialog(this, "input English").trim();
			if(en == null || en.length() == 0) return;
			dict.put(key, en);
			JOptionPane.showMessageDialog(this, "word save");
		}
		inputField.setText("");
	}
}
