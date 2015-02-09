package exercises;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class TextArea1 implements ActionListener {
	JTextArea text;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		text.append("button clicked \n");
	}

	public static void main(String[] args) {
		TextArea1 launcher = new TextArea1();
		launcher.launch();
	}
	
	public void launch(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Just click it");
		button.addActionListener(this);
		text = new JTextArea(10,20);
		text.setLineWrap(true);
		
		JScrollPane scroller = new JScrollPane(text);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scroller);
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		
		frame.setSize(350,300);
		frame.setVisible(true);
	}
	

}
