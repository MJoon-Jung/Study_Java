package yjp.OOP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
//		e.getSource(); //�̺�Ʈ�� �߻��� ��ü�� object Ÿ������ ��ȯ
		JButton button = (JButton)e.getSource();
		button.setText("cliked");

	}

}
