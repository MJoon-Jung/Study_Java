package submit_wdj;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Calculator extends JFrame{
	private labelPanel lp;
	private ButtonPanel bp;
	private JLabel tl;
	private JLabel ll;
	
	private JButton [] ar = new JButton [20];
	private String [] setBtn = {"/","CE","C","<-","7","8","9", "X","4","5","6","-","1","2","3","+","+/-","0",".","="};
	private int [] background_array = {0,1,2,3,7,11,15,19};
	private int [] sign = {0,7,11,15,19};
	private int [] number = {4,5,6,8,9,10,12,13,14,17};
	private boolean point = false;
	private boolean isSign = false;
	private double sum = 0.0;
	private double num = 0.0;
	private String buho = "";
	private int count = 0;
	
	public Calculator() {
//		this.setLayout(new GridLayout(2,1));
		
		lp = new labelPanel();
		bp = new ButtonPanel();
		
		this.add(lp, BorderLayout.NORTH);
		this.add(bp, BorderLayout.CENTER);
		this.setTitle("Calculator");
		this.setResizable(false);
		this.pack();
		this.setSize(600,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	class labelPanel extends JPanel{
		
		public labelPanel() {
			this.setLayout(new GridLayout(2,1,20,20));
			tl = new JLabel("");
			tl.setFont(new Font("Arial", Font.BOLD, 30));
			tl.setHorizontalAlignment(SwingConstants.RIGHT);
			
			ll = new JLabel("0");
			ll.setFont(new Font("Arial", Font.BOLD, 80));
			ll.setHorizontalAlignment(SwingConstants.RIGHT);
			
			this.add(tl);
			this.add(ll);
			this.setBackground(Color.WHITE);
	}
	}
	class ButtonPanel extends JPanel implements MouseListener{
		
		public ButtonPanel() {
			this.setLayout(new GridLayout(5,4));
			for(int i = 0; i < ar.length; i++) {
				ar[i] = new JButton(setBtn[i]);
				ar[i].setBackground(Color.orange);
				ar[i].setFocusable(false);
				ar[i].setFont(new Font("Arial", Font.BOLD, 50));
				ar[i].addMouseListener(this);
				this.add(ar[i]);
			}
			for(int idx : background_array) {
				ar[idx].setBackground(Color.gray);
			}			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			JButton clicked = (JButton) e.getSource();
			String s = clicked.getText();
			
			//switch���� �����ڶ� number input �������� ���� ó���Ѵ�.
			switch(s) {
			//�Ʒ��� �ʱ�ȭ
			case("CE"):
				ll.setText("0");
				point = false;
				count = 0;
				break;
			//������ �ʱ�ȭ
			case("C"):
				tl.setText("");
				ll.setText("0");
				sum = 0.0;
				num = 0.0;
				count = 0;
				point = false;
				break;
			//�ѹ��ھ� ����
			case("<-"):
				String tmp = ll.getText();
				String v = tl.getText();
				if(tmp.length() != 1) {
					tmp = tmp.substring(0, tmp.length()-1);
					v = v.substring(0, v.length()-1);
					ll.setText(tmp);
					tl.setText(v);
				}else {					
					ll.setText("0");
				}
				break;
			//��� ���� �ݴ��
			case("+/-"):
				if(!isSign) {					
					double temp = Double.parseDouble(ll.getText());
					int num_length = ll.getText().length();
					if(temp != 0) {
						temp = -temp;
					}
					ll.setText(String.valueOf(temp));
					String tl_tmp = tl.getText().substring(0, tl.getText().length()- num_length);
					tl.setText(tl_tmp + ll.getText());
				}
				break;
			case("."):
				if(!point) {
					char tt = tl.getText().charAt(tl.getText().length()-1);
					System.out.println(tt);
					if(tt >= '0' && tt <= '9') {
						ll.setText(ll.getText() + ".");
						tl.setText(tl.getText() + ".");
					}
					point = true;					
					break;
				}
			}
			
			/*number �� ������ ���Ʒ� label�� text�� �ٲ۴�.
			 * ���ڴ� �ٷ� �Ʒ� �󺧿� ����.
			 * �����Է��ϸ� ������ isSign�� false�� ���ش�.
			 */
			
			for(int n : number) {
				if(ar[n] == clicked) {
					if(!isSign) {			
						if(ll.getText().equals("0")) {
							if(!ar[n].getText().equals("0")) {
								ll.setText(ar[n].getText());
								tl.setText(ar[n].getText());
							}
						}else {
							ll.setText(ll.getText() + ar[n].getText());
							tl.setText(tl.getText() + ar[n].getText());
						}
					}else {
						ll.setText(ar[n].getText());
						tl.setText(tl.getText() + ar[n].getText());
					}
					isSign = false;				
					
				}  
			}
			/*�����ڸ� �Է��� �Ҷ��� �Ʒ� ���� ������ number�� �޴´�. �� ù��° �Է��� sum���� �Է��Ѵ�.
			 * ���� ��ü�� ���� ������ ���� �̷� �����̹Ƿ� ó�� ���� sum ���� ���� num���� �����ϰ� �Ѵ�.
			 * �������� ���缭 ������ �ϰ� = �� �׻� sum�� ���� �����⶧���� ���� ������ �����ʾҴ�.
			 * isSign�� ���� ���ڸ� �Է��� ���¿��� ���ڷ� �Ѿ�������� �� �߰������ʵ��� boolean ���� �־ �����ߴ�.
			 * count ���� �ܼ��� ���� ù��° ���� �޾Ҵ����� üũ�ϴ� ���̴�.
			 */
			
			if(!tl.getText().equals("")) {
				for(int k : sign) {
					if(ar[k] == clicked) {
						String t = tl.getText();
						int n = t.length() - 1;
						String ts = t.substring(0, n);
						if(count == 0) {
							sum = Double.parseDouble(ll.getText());
						}else {				
							num = Double.parseDouble(ll.getText());													
						}				
						count++;
						if(isSign) {
							if(!ar[k].getText().equals("=")) {								
								tl.setText(ts + ar[k].getText());
							}
						}else {
							if(count >= 2) {								
								if(buho.equals("+")) {
									sum += num;
								}else if(buho.equals("-")) {
									sum -= num;
								}else if(buho.equals("/")) {
									sum /= num;
								}else if(buho.equals("X")) {
									sum *= num;
								}
								ll.setText(String.valueOf(sum));
							}
							if(!ar[k].getText().equals("=")) {								
								tl.setText(t + ar[k].getText());
							}
							isSign = true;
						}
						buho = ar[k].getText();
					}
				}
			}	
		}
		@Override
		public void mousePressed(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
	}
	public static void main(String[] args) {
		new Calculator();
	}
}
