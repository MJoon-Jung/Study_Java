package yjp.GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class KeyTest extends JFrame implements KeyListener{
	JPanel panel;
	JTextField field;
	JTextArea area;
	public KeyTest() {
		panel = new JPanel(new GridLayout(0, 2));
        panel.add(new JLabel("문자를 입력하시오."));
        field = new JTextField(20);
        field.addKeyListener(this);

        panel.add(field);

        area = new JTextArea(3, 30); // 행, 열
//        JScrollPane scroll = new JScrollPane(area);
//        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);//수평 스크롤 안쓰게함.
//
//        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
//
//        area.setLineWrap(true);                                           //꽉차면 다음줄로 가게 해줌.

 



   
//        panel.add(scroll);
        this.add(panel, BorderLayout.NORTH);
        this.add(area, BorderLayout.CENTER);

        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
		
	}
	public static void main(String[] args) {
		KeyTest kt = new KeyTest();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Key Typed");
		display(e,"Key Typed!!");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("KeyPressed");
		display(e,"KeyPressed!!");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("KeyReleased");
		display(e,"KeyReleased!!");
	}
	private void display(KeyEvent e, String s) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		System.out.println();
		System.out.println("Event:"+s+", char : "+c+",code["+keyCode+"]");
		
		this.area.append(s+"\n");
	}
}
