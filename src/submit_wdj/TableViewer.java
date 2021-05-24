package submit_wdj;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TableViewer extends JFrame implements ActionListener{
	private JTextField idField, titleField, publisherField, yearField, priceField;
	private JButton previousBtn, nextBtn, insertBtn, finishBtn;
	private ResultSet rs = null;
	private Connection con = null;
	JPanel homePanel;
	JPanel insertPanel;
	
	
	
	public TableViewer() {
		PreparedStatement ps = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/OOP", "root", "rhksflwk");
			String sql = "select * from books order by book_id";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
		} catch (Exception e) {
			System.out.println("db 연결 문제있음");
			e.printStackTrace();
			System.exit(0);
		}finally {
			try {				
				if(ps != null) {
					System.out.println("ps delete");
					ps.close();
				}
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		homePanel = new JPanel();
		insertPanel = new insertPanel();
		/*
		 * 각 컴포넌트를 frame에 추가하기
		 * TableViewr 객체가 생성될 때, DB의 books 테이블의
		 * 레코드들을 읽어 온다.
		 */
		
		homePanel.setLayout(new GridLayout(0, 2));
		homePanel.add(new JLabel("ID", JLabel.CENTER));
		idField = new JTextField(10);
		homePanel.add(idField);
		
		homePanel.add(new JLabel("Title", JLabel.CENTER));
		titleField = new JTextField(10);
		homePanel.add(titleField);
		
		homePanel.add(new JLabel("Publisher", JLabel.CENTER));
		publisherField = new JTextField(10);
		homePanel.add(publisherField);
		
		homePanel.add(new JLabel("Year", JLabel.CENTER));
		yearField = new JTextField(10);
		homePanel.add(yearField);
		
		homePanel.add(new JLabel("Price", JLabel.CENTER));
		priceField = new JTextField(10);
		homePanel.add(priceField);
		
		previousBtn = new JButton("Previous");
		previousBtn.addActionListener(this);
		homePanel.add(previousBtn);
		
		nextBtn = new JButton("Next");
		nextBtn.addActionListener(this);
		homePanel.add(nextBtn);
		
		insertBtn = new JButton("Insert");
		insertBtn.addActionListener(this);
		homePanel.add(insertBtn);
		
		finishBtn = new JButton("Finish");
		finishBtn.addActionListener(this);
		homePanel.add(finishBtn);
		
		this.add(homePanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350,200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		/*
		 * TableViwer 객체가 생성될 때, DB의 books 테이블의
		 * 레코드들을 읽어 온다.
		 * 1. 데이터베이스와 연결
		 * 2. select 문 실행하고 반환된 ResultSet 객체를 가지고 있어야 함.
		 */
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == nextBtn) {
			try {
				if(rs.next()) {					
					setting();
				}	
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}else if(e.getSource() == previousBtn) {
			try {
				if(rs.previous()) {					
					setting();
				}
			}catch(SQLException e1) {
				e1.printStackTrace();
			}
		}else if(e.getSource() == finishBtn) {
			disConnect();
			this.dispose();
			System.exit(0);
		}else if(e.getSource() == insertBtn) {
			change("insertPanel");
			try {
				reloading();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
//			insertData();
		}
	}
	private void reloading() throws Exception{
		String sql = "select * from books order by book_id desc";
		PreparedStatement ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
	}
	private void change(String panelName) {
		getContentPane().removeAll();
		if(panelName.equals("homePanel")) {
			getContentPane().add(homePanel);
		}else {
			getContentPane().add(insertPanel);
		}
		revalidate();
		repaint();
	}
	private void disConnect() {
		try {			
			if(rs != null) {
				System.out.println("rs delete");
				rs.close();
			}
			if(con != null) {
				System.out.println("con delete");
				con.close();
			}
		}catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	private void insertData(){		
		
		Connection con = null;
		PreparedStatement ps = null;
		try {			
			con = DBCon.getConnection();
			ps = con.prepareStatement("INSERT INTO books(title, publisher, year, price) VALUES(?,?,?,?)");
			
//			ps.setString(1, titleField.getText());
//			ps.setString(2, publisherField.getText());
//			
//			ps.setString(3, yearField.getText());
//			ps.setString(4, priceField.getText());
			
			ps.setString(1, titleField.getText());
			ps.setString(2, publisherField.getText());
			
			ps.setString(3, yearField.getText());
			ps.setString(4, priceField.getText());
			
			ps.executeUpdate();
			
			System.out.println("insert 성공");
			
		}catch(Exception e) {
			e.printStackTrace();
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
	
	class insertPanel extends JPanel implements ActionListener{
		private JButton submit_btn;
		private JTextField titleField2, publisherField2, yearField2, priceField2;
		private ArrayList<String> infoList = new ArrayList<>();
		public insertPanel() {
			this.setLayout(new GridLayout(0, 2));
			
			this.add(new JLabel("Title", JLabel.CENTER));
			titleField2 = new JTextField(10);
			this.add(titleField2);
			
			this.add(new JLabel("Publisher", JLabel.CENTER));
			publisherField2 = new JTextField(10);
			this.add(publisherField2);
			
			this.add(new JLabel("Year", JLabel.CENTER));
			yearField2 = new JTextField(10);
			this.add(yearField2);
			
			this.add(new JLabel("Price", JLabel.CENTER));
			priceField2 = new JTextField(10);
			this.add(priceField2);
			
			submit_btn = new JButton("save");
			submit_btn.addActionListener(this);
			this.add(submit_btn);
			
			setLocationRelativeTo(null);
			setSize(400,300);
			setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Connection con = null;
			PreparedStatement ps = null;
			try {			
				con = DBCon.getConnection();
				ps = con.prepareStatement("INSERT INTO books(title, publisher, year, price) VALUES(?,?,?,?)");			
				
				ps.setString(1, titleField2.getText());
				ps.setString(2, publisherField2.getText());
				
//				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//				java.util.Date date = sdf.parse(yearField2.getText());
//				Date sqlDate = new Date(date.getTime());
//				
//				ps.setDate(3, sqlDate);
//				
				ps.setDate(3, Date.valueOf(yearField2.getText()));
				
				ps.setInt(4, Integer.parseInt(priceField2.getText()));
				
				ps.executeUpdate();
				
				System.out.println("insert 성공");
				
				titleField2.setText("");
				publisherField2.setText("");
				yearField2.setText("");
				priceField2.setText("");
				
			}catch(Exception e2) {
				e2.printStackTrace();
			}
			change("homePanel");
		}
	}
	
	public static void main(String[] args) {
		new TableViewer();
	}
}

