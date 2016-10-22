import java.util.*;
import java.awt.Color;
import java.lang.*;
import javax.swing.JFrame;


public class window extends JFrame {
	
	public window() {
		super("Team Fight!");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.pink);
		this.setVisible(true);
		int Width = (int) java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		int Height = (int) java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		this.setSize(Width-100,Height-100);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	public static void main(String[] args) {
		window test = new window();
	}
}


