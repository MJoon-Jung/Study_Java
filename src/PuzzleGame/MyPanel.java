package PuzzleGame;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	GameOver go = new GameOver();
	JButton[][] buttons = new JButton [3][3];
	JButton [][] result = new JButton[3][3];
	{
		
	}
	ArrayList<String>list;
	boolean [][] check = new boolean [5][5];
	{
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				check[i][j] = true;
			}
		}
	}
	MyPanel(){
		Create_Puzzle();	
		move();
		if(Correct()) {
			this.setVisible(false);
			go.setVisible(true);
		}
		this.setLayout(new GridLayout(3,3,5,5));
		this.setPreferredSize(new Dimension(600,500));
	}
	boolean Correct() {
		int idx = 1;
		for(int i = 0; i < buttons.length; i++) {
			for(int j = 0; j < buttons.length; j++) {
				if(i !=2 && j != 2) { 
					if(buttons[i][j].getName() != Integer.toString(idx)) {
						return false;
					}
				}
			}
		}
		return true;
	}
	void Create_Puzzle() {
		list = new ArrayList<>();
		for(int i = 1; i < 9; i++) {
			list.add(Integer.toString(i));
		}
		list.add(" ");
		
		for(int i = 0; i < buttons.length; i++) {
			for(int j = 0; j < buttons.length; j++) {
				int random = (int)(Math.random()*list.size());
				buttons[i][j] = new JButton(list.get(random));
				list.remove(list.get(random));
				this.add(buttons[i][j]);
			}
		}
	}
	void Rename() {
		list = new ArrayList<>();
		for(int i = 1; i < 9; i++) {
			list.add(Integer.toString(i));
		}
		list.add(" ");
		
		for(int i = 0; i < buttons.length; i++) {
			for(int j = 0; j < buttons.length; j++) {
				int random = (int)(Math.random()*list.size());
				buttons[i][j].setName(list.get(random));
				list.remove(list.get(random));
			}
		}
	}
 	public void move() {
 		for(int i = 0; i < buttons.length; i++) {
 			for(int j = 0; j < buttons[0].length; j++) {
 				buttons[i][j].addActionListener(new buttonAction(this,buttons,i,j));
 			}
 		}
	}
 	public int [] where_move(int i, int j) {
 		int [] dir = new int [2];
 		dir[0] = -1;
 		dir[1] = -1;
 		//i , j-1
 		if(check[i+1][j]) {
 			if(isEmpty(i,j-1)) {
 				dir[0] = i;
 				dir[1] = j-1;
 			}
 		}
 		//i, j+1
 		if(check[i+1][j+2]) {
 			if(isEmpty(i,j+1)) {
 				dir[0] = i;
 				dir[1] = j+1;
 			}
 		}
 		//i-1 j
 		if(check[i][j+1]) {
 			if(isEmpty(i-1,j)) {
 				dir[0] = i-1;
 				dir[1] = j;
 			}
 		}
 		//i+1 j
 		if(check[i+2][j+1]) {
 			if(isEmpty(i+1,j)) {
 				dir[0] = i+1;
 				dir[1] = j;
 			}
 		}
 		return dir;
 	}
	boolean isEmpty(int i, int j) {
		if(buttons[i][j].getText().equals(" ")) {
			return true;
		}
		return false;
	}
}
class buttonAction implements ActionListener{
	private JButton [][] buttons;
	private int i;
	private int j;
	MyPanel panel;
	buttonAction(MyPanel panel,JButton[][] buttons,int i,int j){
		this.panel = panel;
		this.buttons = buttons;
		this.i = i;
		this.j = j;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int [] dir = panel.where_move(i, j);
		if(dir[0] != -1 && dir[1] != -1) {
			buttons[dir[0]][dir[1]].setText(buttons[i][j].getText());
			buttons[i][j].setText(" ");
		}
	}	
}