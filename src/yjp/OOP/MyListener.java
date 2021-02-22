package yjp.OOP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
//		e.getSource(); //이벤트가 발생된 객체가 object 타입으로 반환
		JButton button = (JButton)e.getSource();
		button.setText("cliked");

	}

}
