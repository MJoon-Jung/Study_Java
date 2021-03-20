package submit_wdj;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tictactoe implements ActionListener{
	private Random random = new Random();
	private JFrame frame = new JFrame();
	private JPanel titlePanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	private JLabel titleLabel = new JLabel();
	JButton [] buttons = new JButton [9];
	boolean playerTurn = false; // true 이면 player 1의 순서
	JButton rebtn = new JButton("ReStart");
	int [][] checkBoard = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};

	public Tictactoe() {
		titleLabel.setBackground(new Color(25,25,25));
		titleLabel.setForeground(new Color(25,255,0));
		titleLabel.setFont(new Font("Arial", Font.BOLD,75));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setText("Tic Tac Toe");
		titleLabel.setOpaque(true);

		titlePanel.setLayout(new BorderLayout());
		titlePanel.add(titleLabel);

		rebtn.setFont(new Font("Arial",Font.BOLD,50));
		rebtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i < buttons.length; i++) {
					for(int j = 0; j < buttons.length; j++) {						
						buttons[i].setEnabled(true);
						buttons[i].setText("");
						buttons[i].setBackground(Color.GRAY);
					}
				}
				titleLabel.setText("TicTecToe");
			}
		});

		buttonPanel.setLayout(new GridLayout(3,3));
		buttonPanel.setBackground(new Color(150,150,150));


		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setOpaque(true);
			buttons[i].setFocusable(false);
			buttons[i].setBackground(Color.gray);
			buttons[i].setFont(new Font("Arial",Font.BOLD,120));
			buttons[i].addActionListener(this);
			buttonPanel.add(buttons[i]);
		}

		firstTurn();

		frame.add(titlePanel,BorderLayout.NORTH);
		frame.add(buttonPanel,BorderLayout.CENTER);
		frame.add(rebtn,BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setTitle("TicTacToe");
		frame.setSize(800,800);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	private void firstTurn() {
		//		try {
		//			Thread.sleep(2000);
		//		} catch (InterruptedException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		if(random.nextInt(2) == 0) {
			playerTurn = true;
			titleLabel.setText("X Turn");
		}else {
			playerTurn = false;
			titleLabel.setText("O Turn");
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < buttons.length; i++) {				
			if(e.getSource() == buttons[i]) {
				if(buttons[i].getText().equals("")) {
					if(playerTurn) {
						buttons[i].setForeground(Color.RED);
						buttons[i].setText("X");
						playerTurn = !playerTurn;
						titleLabel.setText("O turn");
					}else {
						buttons[i].setForeground(Color.YELLOW);
						buttons[i].setText("O");
						playerTurn = !playerTurn;
						titleLabel.setText("X turn");
					}
					check();
				}
				System.out.println(i+1);
			}
		}

	}
	private void check() {
		boolean istrue = false;
		String winner = "";
		int winidx = -1;
		for(int i = 0; i < checkBoard.length; i++) {
			String s = buttons[checkBoard[i][0]].getText();
			for(int j = 0; j < checkBoard[0].length; j++) {
				if(!(buttons[checkBoard[i][j]].getText()).equals(s)) {
					istrue = false;
					break;
				}
				istrue = true;
			}
			if(istrue) {
				winner = s;
				winidx = i;
				break;
			}
		}
		if(istrue) {			
			if(winner.equals("X")) {
				xWins(checkBoard[winidx][0],checkBoard[winidx][1],checkBoard[winidx][2]);
			}
			else if(winner.equals("O")) {
				oWins(checkBoard[winidx][0],checkBoard[winidx][1],checkBoard[winidx][2]);
			}
		}
	}
	private void xWins(int a, int b, int c) {
		setWinColor(a,b,c);
		endbutton();

		titleLabel.setText("X Wins!");
	}
	private void oWins(int a, int b,int c) {
		setWinColor(a,b,c);
		endbutton();

		titleLabel.setText("O Winds!");
	}
	private void setWinColor(int a,int b, int c) {
		buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
	}
	private void endbutton() {
		for(int i = 0; i < buttons.length; i++) {
			buttons[i].setEnabled(false);
		}
	}
	public static void main(String[] args) {
		new Tictactoe();
	}
}
