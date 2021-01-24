package Account_Book;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTable;

public class App {
	private final String ID = "gjgjajaj";
	private final String PASS = "111";
	private JFrame frame;
	private JTextField idField;
	private JPasswordField passField;
	private JPanel currPanel;
	private JTextField nameInput;
	private JTextField amountInput;
	private JTextField searchInput;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		TableData td = new TableData();
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImagePanel sumPanel = new ImagePanel(new ImageIcon("D:\\programes\\java_workspace\\Java_self\\src\\Account_Book\\images\\Activation1.jpg").getImage());
		ImagePanel loginPanel = new ImagePanel(new ImageIcon("D:\\programes\\java_workspace\\Java_self\\src\\Account_Book\\images\\theme.jpg").getImage());
		ImagePanel tranPanel = new ImagePanel(new ImageIcon("D:\\programes\\java_workspace\\Java_self\\src\\Account_Book\\images\\Activation1.jpg").getImage());
		currPanel = loginPanel;
		
		frame.setSize(loginPanel.getDim());
		frame.setPreferredSize(loginPanel.getDim());
		frame.setLocationRelativeTo(null);
		frame.getContentPane().add(sumPanel);
		frame.getContentPane().add(loginPanel);
		frame.getContentPane().add(tranPanel);
		
		JButton sumBtn = new JButton("");
		sumBtn.setBorder(null);
		sumBtn.setIcon(new ImageIcon("D:\\programes\\java_workspace\\Java_self\\src\\Account_Book\\images\\Summary.jpg"));
		sumBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currPanel.setVisible(false);
				sumPanel.setVisible(true);
				currPanel = sumPanel;
			}
		});
		
		sumBtn.setBounds(29, 123, 259, 40);
		tranPanel.add(sumBtn);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(405, 129, 158, 49);
		tranPanel.add(lblNewLabel);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblType.setBounds(405, 199, 158, 49);
		tranPanel.add(lblType);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblAmount.setBounds(405, 269, 158, 49);
		tranPanel.add(lblAmount);
		
		JLabel lblNote = new JLabel("Note");
		lblNote.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNote.setBounds(405, 328, 158, 49);
		tranPanel.add(lblNote);
		
		nameInput = new JTextField();
		nameInput.setFont(new Font("Tahoma", Font.PLAIN, 33));
		nameInput.setBounds(554, 123, 940, 55);
		tranPanel.add(nameInput);
		nameInput.setColumns(10);
		
		
		String [] typeArr = new String [] {"Deposit","Withdraw"};
		JComboBox typeInput = new JComboBox(typeArr);
		typeInput.setFont(new Font("Tahoma", Font.PLAIN, 33));
		typeInput.setBounds(554, 199, 940, 49);
		tranPanel.add(typeInput);
		typeInput.setBackground(Color.WHITE);
		
		amountInput = new JTextField();
		amountInput.setFont(new Font("Tahoma", Font.PLAIN, 33));
		amountInput.setColumns(10);
		amountInput.setBounds(554, 269, 940, 49);
		tranPanel.add(amountInput);
		
		JTextArea noteInput = new JTextArea();
		noteInput.setFont(new Font("Tahoma", Font.PLAIN, 33));
		noteInput.setBounds(554, 328, 940, 165);
		tranPanel.add(noteInput);
		noteInput.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					boolean fileExists = new File("D:\\programes\\java_workspace\\Java_self\\src\\Account_Book\\data.csv").exists();
					FileWriter fw = new FileWriter("D:\\programes\\java_workspace\\Java_self\\src\\Account_Book\\data.csv",true); //false로 하면 매번 최신화되서 그 전 내용이 날라감
					if(!fileExists) {
						fw.append("Name,Type,Amount,Note\n");
					}
					String name = nameInput.getText();
					String type = (String)typeInput.getSelectedItem();
					String amount = amountInput.getText();
					String note = noteInput.getText();
					fw.append(name +"," + type + ","+amount+","+note+"\n");
					fw.close();
					nameInput.setText("");
					typeInput.setSelectedIndex(0);
					amountInput.setText("");
					noteInput.setText("");
					
					JOptionPane.showMessageDialog(null,"Data saved Successfully");
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "There was an error while writing the data");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnNewButton.setBounds(927, 522, 188, 49);
		tranPanel.add(btnNewButton);
		
		JButton tranBtn = new JButton("");
		tranBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currPanel.setVisible(false);
				tranPanel.setVisible(true);
				currPanel = tranPanel;
			}
		});
		// summary
		tranBtn.setIcon(new ImageIcon("D:\\programes\\java_workspace\\Java_self\\src\\Account_Book\\images\\Transaction.jpg"));
		tranBtn.setPressedIcon(new ImageIcon("D:\\programes\\java_workspace\\Java_self\\src\\Account_Book\\images\\Transaction.jpg"));
		tranBtn.setBorder(null);
		tranBtn.setBounds(29, 182, 259, 40);
		sumPanel.add(tranBtn);
		
		JLabel lblNewLabel_1 = new JLabel("Search");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(387, 75, 83, 51);
		sumPanel.add(lblNewLabel_1);
		
		searchInput = new JTextField();
		searchInput.setFont(new Font("Tahoma", Font.PLAIN, 33));
		searchInput.setBounds(492, 75, 1002, 51);
		sumPanel.add(searchInput);
		searchInput.setColumns(10);
		
		JPanel tp = new JPanel();
		tp.setBounds(387, 182, 1109, 386);
		sumPanel.add(tp);
		tp.setLayout(null);
		
		table = new JTable();
		table.setBounds(12, 10, 1085, 366);
		tp.add(table);
		sumPanel.setVisible(false);
		tranPanel.setVisible(false);
		
		idField = new JTextField();
		idField.setFont(new Font("굴림", Font.PLAIN, 23));
		idField.setBounds(1230, 317, 284, 34);
		loginPanel.add(idField);
		idField.setColumns(10);
		idField.setBorder(null);
		
		passField = new JPasswordField();
		passField.setFont(new Font("굴림", Font.PLAIN, 26));
		passField.setBounds(1230, 397, 284, 34);
		passField.setBorder(null);
		loginPanel.add(passField);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(1184, 442, 26, 23);
		loginPanel.add(chckbxNewCheckBox);
		
		
		JButton loginbtn = new JButton("New button");
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ID.equals(idField.getText()) && PASS.equals(passField.getText())) {
					currPanel.setVisible(false);
					sumPanel.setVisible(true);
					currPanel = sumPanel;
				}else {
					JOptionPane.showMessageDialog(null, "Login Fail");
				}
			}
		});
		loginbtn.setBounds(1184, 467, 339, 43);
		loginbtn.setBorder(null);
		loginPanel.add(loginbtn);
		loginbtn.setIcon(new ImageIcon("D:\\programes\\java_workspace\\Java_self\\src\\Account_Book\\images\\button.jpg"));
		
		loginbtn.setPressedIcon(new ImageIcon("D:\\programes\\java_workspace\\Java_self\\src\\Account_Book\\images\\btnClicked.jpg"));
		
		
		frame.pack();
	}
}
