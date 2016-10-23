import java.util.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class window extends JFrame {
	static JLabel screen;
	
	public window() {
		super("Team Fight!");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		screen = new JLabel();
		this.getContentPane().setBackground(Color.pink);
		this.add(screen);
		this.setVisible(true);
		int Width = (int) java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int Height = (int) java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		this.setSize(Width-100,Height-100);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	public void runGame(){
		screen.setIcon(new ImageIcon(drawPic()));		
	}
	
	public BufferedImage drawPic(){
		BufferedImage out = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics g = out.getGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.green);
		g.fillOval((int)(Math.random()*(this.getWidth()-88)), (int)(Math.random()*(this.getHeight()-88)), 88, 88);
		return out;
	}
}


