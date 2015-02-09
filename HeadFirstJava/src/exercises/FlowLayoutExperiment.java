package exercises;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExperiment {

	public static void main(String[] args) {
		FlowLayoutExperiment launcher = new FlowLayoutExperiment();
		launcher.launch();
	}
	public void launch(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); //IMPORTANT
		JButton button1 = new JButton("shock me");
		JButton button2 = new JButton("bliss");
		JButton button3 = new JButton("huh?");
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

}
