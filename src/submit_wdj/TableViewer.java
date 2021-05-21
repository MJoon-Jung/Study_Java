package submit_wdj;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TableViewer extends JFrame implements ActionListener{
	private JTextField idField, titleField, publisherField, yearField, priceField;
	private JButton previousBtn, nextBtn, insertBtn, finishBtn;
	private ResultSet rs = null;
	private Connection con = null;
	
	
	public TableViewer() {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/OOP", "root", "rhksflwk");
			String sql = "select * from books ";
			PreparedStatement ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			System.out.println("asaa");
		} catch (Exception e) {
			System.out.println("db ���� ��������");
			e.printStackTrace();
			System.exit(0);
		}
		
		/*
		 * �� ������Ʈ�� frame�� �߰��ϱ�
		 * TableViewr ��ü�� ������ ��, DB�� books ���̺���
		 * ���ڵ���� �о� �´�.
		 */
		
		this.setLayout(new GridLayout(0, 2));
		this.add(new JLabel("ID", JLabel.CENTER));
		idField = new JTextField(10);
		this.add(idField);
		
		this.add(new JLabel("Title", JLabel.CENTER));
		titleField = new JTextField(10);
		this.add(titleField);
		
		this.add(new JLabel("Publisher", JLabel.CENTER));
		publisherField = new JTextField(10);
		this.add(publisherField);
		
		this.add(new JLabel("Year", JLabel.CENTER));
		yearField = new JTextField(10);
		this.add(yearField);
		
		this.add(new JLabel("Price", JLabel.CENTER));
		priceField = new JTextField(10);
		this.add(priceField);
		
		previousBtn = new JButton("Previous");
		previousBtn.addActionListener(this);
		this.add(previousBtn);
		
		nextBtn = new JButton("Next");
		nextBtn.addActionListener(this);
		this.add(nextBtn);
		
		insertBtn = new JButton("Insert");
		insertBtn.addActionListener(this);
		this.add(insertBtn);
		
		finishBtn = new JButton("Finish");
		finishBtn.addActionListener(this);
		this.add(finishBtn);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(350,200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		/*
		 * TableViwer ��ü�� ������ ��, DB�� books ���̺���
		 * ���ڵ���� �о� �´�.
		 * 1. �����ͺ��̽��� ����
		 * 2. select �� �����ϰ� ��ȯ�� ResultSet ��ü�� ������ �־�� ��.
		 */
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == nextBtn) {
			try {
				rs.next();
				setting();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}else if(e.getSource() == previousBtn) {
			try {
				rs.previous();
				setting();
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	private void setting() {
		try {
			int id = rs.getInt("book_id");
			String title = rs.getString("title");
			String publisher = rs.getString("publisher");
			Date year = rs.getDate("year");
			int price = rs.getInt("price");
			
			idField.setText(id + "");
			titleField.setText(title);
			publisherField.setText(publisher);
			yearField.setText(year + "");
			priceField.setText(price + "");
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new TableViewer();
	}
}
