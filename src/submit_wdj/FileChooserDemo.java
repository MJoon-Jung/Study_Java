package submit_wdj;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FileChooserDemo extends JFrame implements ActionListener{
	private JButton openBtn, saveBtn;
	private JTextField filename = new JTextField(), dir = new JTextField();
	JFileChooser fileChooser;
	
	public FileChooserDemo() {
		fileChooser = new JFileChooser();
		
		JLabel label = new JLabel("파일 선택기 컴포넌트 테스트입니다.");
		openBtn = new JButton("파일 오픈");
		openBtn.addActionListener(this);
		
		saveBtn = new JButton("파일 저장");
		saveBtn.addActionListener(this);
		
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(openBtn);
		panel.add(saveBtn);
		
		this.add(panel);
		this.setTitle("Select file test");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(250,200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == openBtn) {
			int returnVal = fileChooser.showOpenDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
				if(!Desktop.isDesktopSupported()) {
					System.out.println("지원되지 않음");
					return;
				}
				Desktop desktop = Desktop.getDesktop();
				if(file.exists()) {
					try {
						desktop.open(file);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				System.out.println("open file : " + file.getAbsolutePath());
			}else {
				System.out.println("No File selected");
			}
		}else if(e.getSource() == saveBtn) {
			int returnVal = fileChooser.showSaveDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
				System.out.println("save to " + file.getAbsolutePath());
			}else {
				System.out.println("Save Canceled");
			}
		}
		
	}
	public static void main(String[] args) {
		new FileChooserDemo();
	}
}
