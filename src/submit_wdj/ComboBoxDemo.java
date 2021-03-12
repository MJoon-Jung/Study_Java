package submit_wdj;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ComboBoxDemo extends JFrame implements ActionListener{
	private JLabel label;
	private JComboBox animalList;
	ArrayList<String>animals;
	public ComboBoxDemo() {
		animals = new ArrayList<>();
		animals.add("dog"); animals.add("lion"); animals.add("tiger");
//		String [] animals = {"dog", "lion", "tiger"};
		animalList = new JComboBox(animals.toArray(new String [animals.size()]));
		animalList.setSelectedIndex(0);
		animalList.addActionListener(this);
		animalList.setEditable(true);
				
		label = new JLabel();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		changePicture(animals.get(animalList.getSelectedIndex()));
		
		this.add(animalList, BorderLayout.NORTH);
		this.add(label, BorderLayout.CENTER);
				
		this.setTitle("combobox");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(500,400);
		this.setVisible(true);
	}
	public void changePicture(String name) {
		ImageIcon icon = new ImageIcon("Images/" + name + ".jpg");			
		label.setIcon(icon);
		label.setText(null);
	}
	public boolean fileOn(String name) {
		File file = new File("Images/" + name + ".jpg");
		if(!file.isFile()) {
			return false;
		}
		return true;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = (String) animalList.getSelectedItem();
		
		if(!animals.contains(name)) {			
			if(fileOn(name)) {
				animalList.addItem(name);				
				changePicture(name);
				animals.add(name);
			}
		}else {
			changePicture(name);
		}
	}
	public static void main(String[] args) {
		new ComboBoxDemo();
	}
}
