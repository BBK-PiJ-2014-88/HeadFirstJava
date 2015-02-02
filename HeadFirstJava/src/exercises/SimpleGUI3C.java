package exercises;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class SimpleGUI3C implements ActionListener {

	JFrame frame;
	@Override
	public void actionPerformed(ActionEvent arg0) {
		frame.repaint();
	}

	public static void main(String[] args) {
		SimpleGUI3C gui = new SimpleGUI3C();
		gui.launch();
	}
	public void launch(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("click me to change the colour");
		button.addActionListener(this);
		
		MyDrawPanel myPanel = new MyDrawPanel();
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, myPanel);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

}
