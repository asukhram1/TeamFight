import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class window extends JFrame implements MouseListener{
	static JLabel screen;
	static Game game;

	public window(Game game) {
		super("Team Fight!");
		this.game = game;
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		screen = new JLabel();
		screen.addMouseListener(this);
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
		for(int i = 0; i < game.getNumPersons(); i++){
			Person currPer = game.getPerson(i);
			g.setColor(currPer.getOwner());
			g.fillOval((int)((currPer.getxPos()/(float)game.getSpacesX())*(this.getWidth()-10)),(int)((currPer.getyPos()/(float)game.getSpacesY())*(this.getHeight()-10)),10,10);
		}
		return out;
	}

	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {
		game.processClick((int)((e.getX()/(float)this.getWidth())*(float)game.getSpacesX()),(int)((e.getY()/(float)this.getHeight())*(float)game.getSpacesY()));
	}

}


