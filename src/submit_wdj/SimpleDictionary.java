package submit_wdj;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleDictionary extends JPanel implements ActionListener{
	private JTextField inputField;
	private JButton btn_search;
	private JButton btn_add;
	private static final String DIC_FILE_NAME = "dict.props";
	
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
		buildDictionaryFromFile();
	}

	private void buildDictionaryFromFile() {
		Properties props = new Properties();
		try (FileReader fReader = new FileReader(DIC_FILE_NAME)){
			props.load(fReader);	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<Object> set =  props.keySet();
		for(Object key : set) {
			Object value = props.get(key);
			dict.put((String) key, (String) value);
		}
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
				char c = key.charAt(0);
				if((c >= 65 && c <= 90) || (c >=97 && c<= 122)) {
					String ans = getKey(key);
					JOptionPane.showMessageDialog(this, ans, key, JOptionPane.INFORMATION_MESSAGE);
				}else {					
					JOptionPane.showMessageDialog(this, "not found", key,JOptionPane.ERROR_MESSAGE);
				}
			}else {			
				JOptionPane.showMessageDialog(this, value, key, JOptionPane.INFORMATION_MESSAGE);
			}
		}else {
			String en = JOptionPane.showInputDialog(this, "input English").trim();
			if(en == null || en.length() == 0) return;
			dict.put(key, en);
			addWordToFile(key, en);
			JOptionPane.showMessageDialog(this, "word save");
		}
		inputField.setText("");
	}
	private String getKey(String value) {
        for (String key : dict.keySet()) {
            if (value.equals(dict.get(key))) {
                return key;
            }
        }
        return null;
	}

	private void addWordToFile(String key, String value) {
		try (FileWriter fwriter = new FileWriter(DIC_FILE_NAME, true)){
			String str = key + "=" + value +"\n";
			fwriter.write(str);
			
			fwriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
