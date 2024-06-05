

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Tic_Tac_Toe {

	private JFrame frmTicTacToe;
	private JTextField xCount;
	private JTextField oCount;
	private int xCount1 = 0;
	private int oCount1 = 0;
	private String startGame = "X";
	private int b1 = 10;
	private int b2 = 10;
	private int b3 = 10;
	private int b4 = 10;
	private int b5 = 10;
	private int b6 = 10;
	private int b7 = 10;
	private int b8 = 10;
	private int b9 = 10;
	private int i = 0;

	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tic_Tac_Toe window = new Tic_Tac_Toe();
					window.frmTicTacToe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tic_Tac_Toe() {
		initialize();
	}
		
	private void choosePlayer() {
		if (startGame.equalsIgnoreCase("X")) {
			startGame = "O";
		} else {
			startGame = "X";
		}
	}

	boolean win = false;

	private void winningGame() {
		//For Player 1 Logic
		if (b1 == 1 && b2 == 1 && b3 == 1) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X wins");
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
			win = true;
		} else if (b4 == 1 && b5 == 1 && b6 == 1) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X wins");
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
			win = true;
		} else if (b7 == 1 && b8 == 1 && b9 == 1) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X wins");
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
			win = true;
		} else if (b1 == 1 && b4 == 1 && b7 == 1) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X wins");
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
			win = true;
		} else if (b2 == 1 && b5 == 1 && b8 == 1) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X wins");
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
			win = true;
		} else if (b3 == 1 && b6 == 1 && b9 == 1) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X wins");
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
			win = true;
		} else if (b1 == 1 && b5 == 1 && b9 == 1) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X wins");
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
			win = true;
		} else if (b3 == 1 && b5 == 1 && b7 == 1) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player X wins");
			xCount1++;
			xCount.setText(String.valueOf(xCount1));
			win = true;
		}

		// For player 2 Logic
		if (b1 == 0 && b2 == 0 && b3 == 0) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O wins");
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
			win = true;
		} else if (b4 == 0 && b5 == 0 && b6 == 0) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O wins");
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
			win = true;
		} else if (b7 == 0 && b8 == 0 && b9 == 0) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O wins");
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
			win = true;
		} else if (b1 == 0 && b4 == 0 && b7 == 0) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O wins");
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
			win = true;
		} else if (b2 == 0 && b5 == 0 && b8 == 0) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O wins");
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
			win = true;
		} else if (b3 == 0 && b6 == 0 && b9 == 0) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O wins");
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
			win = true;
		} else if (b1 == 0 && b5 == 0 && b9 == 0) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O wins");
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
			win = true;
		} else if (b3 == 0 && b5 == 0 && b7 == 0) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Player O wins");
			oCount1++;
			oCount.setText(String.valueOf(oCount1));
		} else if (i == 9) {
			JOptionPane.showMessageDialog(frmTicTacToe, "Game Draw!");
			win = true;
		}
		// Button Disabled Functionality after winning game Or The game has been drawn
		if (win) {
			btn1.setEnabled(false);

			btn2.setEnabled(false);
			btn5.setEnabled(false);
			btn4.setEnabled(false);
			btn8.setEnabled(false);
			btn7.setEnabled(false);
			btn9.setEnabled(false);
			btn6.setEnabled(false);
			btn3.setEnabled(false);
		}

	}

	private void initialize() {
		frmTicTacToe = new JFrame();
		frmTicTacToe.setTitle("TIC TAC TOE");
		frmTicTacToe.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 55));
		frmTicTacToe.getContentPane().setBackground(new Color(0, 0, 0));
		frmTicTacToe.setBounds(100, 100, 593, 430);
		frmTicTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTicTacToe.setLocationRelativeTo(null);
		frmTicTacToe.getContentPane().setLayout(null);

		btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn1.setForeground(Color.RED);
					b1 = 1;
					i++;
				} else {
					btn1.setForeground(Color.BLACK);
					b1 = 0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 55));
		btn1.setBackground(new Color(255, 255, 255));
		btn1.setBounds(34, 63, 94, 88);
		frmTicTacToe.getContentPane().add(btn1);

		btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn2.setForeground(Color.RED);
					b2 = 1;
					i++;
				} else {
					btn2.setForeground(Color.BLACK);
					b2 = 0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 55));
		btn2.setBackground(new Color(255, 255, 255));
		btn2.setBounds(132, 63, 94, 88);
		frmTicTacToe.getContentPane().add(btn2);

		btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn5.setForeground(Color.RED);
					b5 = 1;
					i++;
				} else {
					btn5.setForeground(Color.BLACK);
					b5 = 0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 55));
		btn5.setBackground(new Color(255, 255, 255));
		btn5.setBounds(132, 156, 94, 88);
		frmTicTacToe.getContentPane().add(btn5);

		btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn4.setForeground(Color.RED);
					b4 = 1;
					i++;
				} else {
					btn4.setForeground(Color.BLACK);
					b4 = 0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 55));
		btn4.setBackground(new Color(255, 255, 255));
		btn4.setBounds(34, 156, 94, 88);
		frmTicTacToe.getContentPane().add(btn4);

		btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn8.setForeground(Color.RED);
					b8 = 1;
					i++;
				} else {
					btn8.setForeground(Color.BLACK);
					b8 = 0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 55));
		btn8.setBackground(new Color(255, 255, 255));
		btn8.setBounds(132, 249, 94, 88);
		frmTicTacToe.getContentPane().add(btn8);

		btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn7.setForeground(Color.RED);
					b7 = 1;
					i++;
				} else {
					btn7.setForeground(Color.BLACK);
					b7 = 0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 55));
		btn7.setBackground(new Color(255, 255, 255));
		btn7.setBounds(34, 249, 94, 88);
		frmTicTacToe.getContentPane().add(btn7);

		btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn9.setForeground(Color.RED);
					b9 = 1;
					i++;
				} else {
					btn9.setForeground(Color.BLACK);
					b9 = 0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 55));
		btn9.setBackground(new Color(255, 255, 255));
		btn9.setBounds(231, 249, 94, 88);
		frmTicTacToe.getContentPane().add(btn9);

		btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn6.setForeground(Color.RED);
					b6 = 1;
					i++;
				} else {
					btn6.setForeground(Color.BLACK);
					b6 = 0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 55));
		btn6.setBackground(new Color(255, 255, 255));
		btn6.setBounds(231, 156, 94, 88);
		frmTicTacToe.getContentPane().add(btn6);

		btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(startGame);
				if (startGame.equalsIgnoreCase("X")) {
					btn3.setForeground(Color.RED);
					b3 = 1;
					i++;
				} else {
					btn3.setForeground(Color.BLACK);
					b3 = 0;
					i++;
				}
				choosePlayer();
				winningGame();
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 55));
		btn3.setBackground(new Color(255, 255, 255));
		btn3.setBounds(231, 63, 94, 88);
		frmTicTacToe.getContentPane().add(btn3);

		JButton exitBtn = new JButton("EXIT");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmTicTacToe = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmTicTacToe, "Do you Want to Exit?", "Tic Tac Toe",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		exitBtn.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		exitBtn.setBackground(SystemColor.inactiveCaption);
		exitBtn.setBounds(472, 336, 89, 23);
		frmTicTacToe.getContentPane().add(exitBtn);

		JLabel playerXLbl = new JLabel("Player X");
		playerXLbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		playerXLbl.setForeground(new Color(255, 255, 255));
		playerXLbl.setBounds(384, 80, 67, 23);
		frmTicTacToe.getContentPane().add(playerXLbl);

		xCount = new JTextField();
		xCount.setEditable(false);
		xCount.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		xCount.setForeground(new Color(255, 255, 255));
		xCount.setBackground(new Color(0, 0, 0));
		xCount.setBounds(450, 78, 89, 27);
		frmTicTacToe.getContentPane().add(xCount);
		xCount.setColumns(10);

		JLabel playerOLbl = new JLabel("Player O");
		playerOLbl.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		playerOLbl.setBackground(new Color(0, 0, 0));
		playerOLbl.setForeground(new Color(255, 255, 255));
		playerOLbl.setBounds(384, 139, 67, 23);
		frmTicTacToe.getContentPane().add(playerOLbl);

		oCount = new JTextField();
		oCount.setEditable(false);
		oCount.setForeground(Color.WHITE);
		oCount.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		oCount.setColumns(10);
		oCount.setBackground(Color.BLACK);
		oCount.setBounds(450, 135, 89, 27);
		frmTicTacToe.getContentPane().add(oCount);

		JButton newGameBtn = new JButton("New Game");
		newGameBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win = false;
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
				b1 = 10;
				b2 = 10;
				b3 = 10;
				b4 = 10;
				b5 = 10;
				b6 = 10;
				b7 = 10;
				b8 = 10;
				b9 = 10;
				i = 0;

				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn5.setEnabled(true);
				btn4.setEnabled(true);
				btn8.setEnabled(true);
				btn7.setEnabled(true);
				btn9.setEnabled(true);
				btn6.setEnabled(true);
				btn3.setEnabled(true);

			}
		});
		newGameBtn.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 11));
		newGameBtn.setForeground(new Color(0, 0, 0));
		newGameBtn.setBackground(SystemColor.inactiveCaption);
		newGameBtn.setBounds(472, 300, 89, 25);
		frmTicTacToe.getContentPane().add(newGameBtn);
	}
}
