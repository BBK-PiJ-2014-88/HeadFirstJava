package exercises;

import java.awt.event.*; //ActionListener and ActionEvent in this package
import javax.swing.*;


public class SimpleGUI1B implements ActionListener {
	JButton button; 
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		button.setText("haha you lose!");

	}

	public static void main(String[] args) {
		SimpleGUI1B gui = new SimpleGUI1B();
		gui.launch();
	}
	public void launch(){
		JFrame frame = new JFrame();
		button = new JButton("Click if you want to win");
		button.addActionListener(this);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

}
