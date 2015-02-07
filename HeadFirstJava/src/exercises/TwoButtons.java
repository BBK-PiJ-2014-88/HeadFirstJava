package exercises;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

public class TwoButtons {
	private JFrame frame;
	private JLabel label;
	
	public static void main(String[] args) {
		TwoButtons launcher = new TwoButtons();
		launcher.launch();
	}
	
	public void launch(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton labelButton = new JButton("Change label");
		labelButton.addActionListener(new LabelListener());
		
		JButton colourButton = new JButton("Click to change circle colour");
		colourButton.addActionListener(new ColourListener());
		
		label = new JLabel("I'm a label");
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, colourButton);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	
	class LabelListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			label.setText("Label has been changed");
		}
	}
	class ColourListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			frame.repaint();
		}
	}

}
