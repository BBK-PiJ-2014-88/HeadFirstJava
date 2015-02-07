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
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

}
