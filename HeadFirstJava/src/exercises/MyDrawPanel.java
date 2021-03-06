package exercises;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.*;

public class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		//makes random colors and then paints
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		Color startColor = new Color(red, green, blue);
	
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		Color endColor = new Color(red, green, blue);
		
		GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
		g2d.setPaint(gradient);
		g2d.fillOval(70, 70, 100, 100);
		
		/*make an orange square
		g.setColor(Color.orange);
		g.fillRect(20, 50, 100, 100);
		*/
		/* adding an image: 
		Image image = new ImageIcon(getClass().getResource("guido.jpg")).getImage();
		g.drawImage(image, 3, 4, this);
		*/	
	}

}
