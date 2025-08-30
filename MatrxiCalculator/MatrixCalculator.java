package newProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MatrixCalculator {
	private static JTextField textField1;
	private static JTextField textField2;
	private static JTextField textField3;
	private static JTextField textField4;
	private static JTextField textField5;
	private static JTextField textField6;
	private static JTextField textField7;
	private static JTextField textField8;

	public static void main(String[] args) {
		JFrame frame = new JFrame("Welcome to a 2x2 matrix calculator");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		JLabel label = new JLabel("Enter the numbers for the 2x2 matrix: ");
		label.setBounds(125, -50, 250, 250);
		frame.add(label);

		textField1 = new JTextField();
		textField1.setBounds(125, 100, 250, 25);
		frame.add(textField1);

		textField2 = new JTextField();
		textField2.setBounds(125, 130, 250, 25);
		frame.add(textField2);

		textField3 = new JTextField();
		textField3.setBounds(125, 160, 250, 25);
		frame.add(textField3);

		textField4 = new JTextField();
		textField4.setBounds(125, 190, 250, 25);
		frame.add(textField4);

		textField5 = new JTextField();
		textField5.setBounds(125, 220, 250, 25);
		frame.add(textField5);

		textField6 = new JTextField();
		textField6.setBounds(125, 250, 250, 25);
		frame.add(textField6);

		textField7 = new JTextField();
		textField7.setBounds(125, 280, 250, 25);
		frame.add(textField7);

		textField8 = new JTextField();
		textField8.setBounds(125, 310, 250, 25);
		frame.add(textField8);

		JButton calculateButton = new JButton("Calculate");
		calculateButton.setBounds(200, 460, 100, 30);
		calculateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showCalculationResult();
			}
		});
		frame.add(calculateButton);

		textField1.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					showCalculationResult();
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println(textField1.getText());
			}
		});

		textField2.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					showCalculationResult();
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println(textField1.getText());
			}
		});

		textField3.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					showCalculationResult();
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println(textField1.getText());
			}
		});

		textField4.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					showCalculationResult();
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println(textField1.getText());
			}
		});

		textField5.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					showCalculationResult();
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println(textField1.getText());
			}
		});

		textField6.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					showCalculationResult();
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println(textField1.getText());
			}
		});

		textField7.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					showCalculationResult();
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println(textField1.getText());
			}
		});

		textField8.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					showCalculationResult();
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println(textField1.getText());
			}
		});

		JLabel hoverLabel = new JLabel();
		hoverLabel.setBounds(200, 30, 250, 25);
		frame.add(hoverLabel);

		textField1.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				hoverLabel.setText("First matrix, 1st row, 1st column");
			}

			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});

		textField2.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				hoverLabel.setText("First matrix, 1st row, 2nd column");
			}

			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});

		textField3.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				hoverLabel.setText("First matrix, 2nd row, 1st column");
			}

			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});

		textField4.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				hoverLabel.setText("First matrix, 2nd row, 2nd column");
			}

			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});

		textField5.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				hoverLabel.setText("Second matrix, 1st row, 1st column");
			}

			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});

		textField6.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				hoverLabel.setText("Second matrix, 1st row, 2nd column");
			}

			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});

		textField7.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				hoverLabel.setText("Second matrix, 2nd row, 1st column");
			}

			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});

		textField8.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				hoverLabel.setText("Second matrix, 2nd row, 2nd column");
			}

			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});

		textField1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
				hoverLabel.setText("");
			}
		});

		textField2.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
				hoverLabel.setText("");
			}
		});

		textField3.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
				hoverLabel.setText("");
			}
		});

		textField4.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
				hoverLabel.setText("");
			}
		});

		textField5.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
				hoverLabel.setText("");
			}
		});

		textField6.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
				hoverLabel.setText("");
			}
		});

		textField7.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
				hoverLabel.setText("");
			}
		});

		textField8.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
				hoverLabel.setText("");
			}
		});

		frame.setVisible(true);
	}

	private static void showCalculationResult() {
		int a11 = Integer.parseInt(textField1.getText());
		int a12 = Integer.parseInt(textField2.getText());
		int a21 = Integer.parseInt(textField3.getText());
		int a22 = Integer.parseInt(textField4.getText());
		int b11 = Integer.parseInt(textField5.getText());
		int b12 = Integer.parseInt(textField6.getText());
		int b21 = Integer.parseInt(textField7.getText());
		int b22 = Integer.parseInt(textField8.getText());

		int result11 = a11 * b11 + a12 * b21;
		int result12 = a11 * b12 + a12 * b22;
		int result21 = a21 * b11 + a22 * b21;
		int result22 = a21 * b12 + a22 * b22;

		int[][] resultArray = { { result11, result12 }, { result21, result22 } };
		System.out.println("Calculation Result:");
		for (int i = 0; i < resultArray.length; i++) {
			for (int j = 0; j < resultArray[i].length; j++) {
				System.out.print(resultArray[i][j] + " ");
			}
			System.out.println();
		}

		double valueToSearch = 8;
		String position = linearSearch(resultArray, valueToSearch);
		if (position != null) {
			System.out.println("Value found at position: " + position);
		} else {
			System.out.println("Value not found.");
		}
	}

	private static String linearSearch(int[][] array, double value) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == value) {
					return i + "," + j;
				}
			}
		}
		return null;
	}
}