package exercises;

import javax.swing.*;
import java.awt.*;


public class SimpleAnimation {
	private int x = 70;
	private int y = 70;
	
	public static void main(String[] args) {
		SimpleAnimation launcher = new SimpleAnimation();
		launcher.launch();
	}
	public void launch(){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		AnimatedDrawPanel drawPanel = new AnimatedDrawPanel();
		
		frame.getContentPane().add(drawPanel);
		frame.setSize(400,400);
		frame.setVisible(true);
		
		for (int i = 0; i < 130; i++){
			x++;
			y++;
			drawPanel.repaint();
			try{
				Thread.sleep(50);
			} catch(Exception e){e.printStackTrace();}
		}
		
	}
	
	class AnimatedDrawPanel extends JPanel{
		public void paintComponent(Graphics g){
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, this.getWidth(), this.getHeight());
			g.setColor(Color.RED);
			g.fillOval(x, y, 40, 40);
		}
	}

}
