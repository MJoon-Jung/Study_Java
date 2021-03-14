package submit_wdj;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class PizzaOrderDemo extends JFrame implements ActionListener{
	private int sum, temp1, temp2, temp3;
	private JButton orderBtn, cancelBtn, selectBtn;
	private JTextField priceField;
	private JPanel orderPanel;
	
	JPanel welcomPanel = new WelcomePanel();
	JPanel typePanel = new TypePanel();
	JPanel toppingPanel = new ToppingPanel();
	JPanel sizePanel = new SizePanel();
	
	int [] type = {10000, 13000, 30000};
	int [] topping = {0,300,500,1000,1200};
	int [] size = {0,2000,4000};
	
	private ArrayList<Integer> orderlist = new ArrayList<>();
	
	public PizzaOrderDemo() {
		orderBtn = new JButton("�ֹ�");
		orderBtn.addActionListener(this);
		
		cancelBtn = new JButton("�ʱ�ȭ");
		cancelBtn.addActionListener(this);
		
		selectBtn = new JButton("���");
		selectBtn.addActionListener(this);
		
		priceField = new JTextField();
		priceField.setEditable(false);
		priceField.setColumns(6);
		
		int t = type[0] + topping[0] + size[0];
		priceField.setText(String.valueOf(t));
		
		orderPanel = new JPanel();
		orderPanel.add(orderBtn);
		orderPanel.add(cancelBtn);
		orderPanel.add(selectBtn);
		orderPanel.add(priceField);
		
		this.add(welcomPanel, BorderLayout.NORTH);
		this.add(orderPanel, BorderLayout.SOUTH);
		this.add(sizePanel, BorderLayout.EAST);
		this.add(typePanel, BorderLayout.WEST);
		this.add(toppingPanel, BorderLayout.CENTER);
		
		this.setSize(500,200);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setTitle("order");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cancelBtn) {
			priceField.setText("0");
		}
		if(e.getSource() == selectBtn) {
			int ans = JOptionPane.showConfirmDialog(null, "��ٱ��Ͽ� �������?", "��ٱ���", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if(ans == 0) {
				orderlist.add(sum);
				JOptionPane.showMessageDialog(null, "��ٱ��Ͽ� ��ҽ��ϴ�!");
			}else {
				JOptionPane.showMessageDialog(null, "���!");
			}
		}
		if(e.getSource() == orderBtn) {
			int ans = JOptionPane.showConfirmDialog(null, "�ֹ��Ͻðڽ��ϰ�?", "��ٱ���", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if(ans == 0) {
				JOptionPane.showMessageDialog(null, "�ֹ��� �Ϸ�Ǿ����ϴ�.");
			}else {
				JOptionPane.showMessageDialog(null, "�ֹ� ���!");
			}
			priceField.setText("0");
		}
	}
	public void setprice() {
		sum = type[temp1] + topping[temp2] + size[temp3];
		priceField.setText(String.valueOf(sum));
	}
	public static void main(String[] args) {
		new PizzaOrderDemo();
	}
	class TypePanel extends JPanel implements ItemListener{
		private JRadioButton combo,potato,bulgogi;
		private ButtonGroup btnGroup;
		
		public TypePanel() {
			this.setLayout(new GridLayout(3, 1));
			combo = new JRadioButton("�޺�", true);
			combo.addItemListener(this);
			bulgogi = new JRadioButton("�Ұ��");
			bulgogi.addItemListener(this);
			potato = new JRadioButton("��������");
			potato.addItemListener(this);
			
			btnGroup = new ButtonGroup();
			btnGroup.add(combo);
			btnGroup.add(bulgogi);
			btnGroup.add(potato);
			
			this.setBorder(BorderFactory.createTitledBorder("����"));
			
			this.add(combo);
			this.add(bulgogi);
			this.add(potato);
		}
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource() == combo) {
				temp1 = 0;
			}else if(e.getSource() == bulgogi) {
				temp1 = 1;
			}else if(e.getSource() == potato) {
				temp1 = 2;
			}
			setprice();
		}
	}
	class ToppingPanel extends JPanel implements ItemListener{
		private JRadioButton none, pimento,cheese,pepperoni,bacon;
		private ButtonGroup btnGroup;
		public ToppingPanel() {
			this.setLayout(new GridLayout(5,1));
			
			none = new JRadioButton("���� ����",true);
			none.addItemListener(this);
			
			pimento = new JRadioButton("�Ǹ�");
			pimento.addItemListener(this);
			
			cheese = new JRadioButton("ġ��");
			cheese.addItemListener(this);
			
			pepperoni = new JRadioButton("����δ�");
			pepperoni.addItemListener(this);
			
			bacon = new JRadioButton("������");
			bacon.addItemListener(this);
			
			btnGroup = new ButtonGroup();
			btnGroup.add(none);
			btnGroup.add(pimento);
			btnGroup.add(cheese);
			btnGroup.add(pepperoni);
			btnGroup.add(bacon);  
			
			this.setBorder(BorderFactory.createTitledBorder("����"));
			
			this.add(none);
			this.add(pimento);
			this.add(cheese);
			this.add(pepperoni);
			this.add(bacon);
		}
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource() == none) {
				temp2 = 0;
			}else if(e.getSource() == pimento) {
				temp2 = 1;
			}else if(e.getSource() == cheese) {
				temp2 = 2;
			}else if(e.getSource() == pepperoni) {
				temp2 = 3;
			}else if(e.getSource() == bacon) {
				temp2 = 4;
			}			
			
			setprice();
		}
			
	}
	class SizePanel extends JPanel implements ItemListener{
		private JRadioButton small, medium, large;
		private ButtonGroup btnGroup;
		public SizePanel() {
			this.setLayout(new GridLayout(3,1));
			small = new JRadioButton("Small", true);
			small.addItemListener(this);
			
			medium = new JRadioButton("Medium");
			medium.addItemListener(this);
			
			large = new JRadioButton("Large");
			large.addItemListener(this);
			
			btnGroup = new ButtonGroup();
			btnGroup.add(large);
			btnGroup.add(medium);
			btnGroup.add(small);
			
			this.setBorder(BorderFactory.createTitledBorder("������"));
			
			this.add(small);
			this.add(medium);
			this.add(large);
		}
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource() == small) {
				temp3 = 0;
			}else if(e.getSource() == medium) {
				temp3 = 1;
			}else if(e.getSource() == large) {
				temp3 = 2;
			}
			
			setprice();
		}
	}
	class WelcomePanel extends JPanel{
		private JLabel message;
		
		public WelcomePanel() {
			message = new JLabel("�ڹ� ���ڿ� ���Ű��� ���ϵ帳�ϴ�.");
			
			this.add(message);
		}
	}
}