import java.awt.*;

public class Person {
	private double health;
	private int level;
	private int xPos;
	private int yPos;
	private Color owner;
	
	public Person() {
		this.health = 100.0;
		this.level = 0;
		this.xPos = (int)(Math.random()*(float)Game.getSpacesX());
		this.yPos = (int)(Math.random()*(float)Game.getSpacesY());
		this.owner = Color.white;
	}

	public Color getOwner(){
		return owner;
	}

	public int getxPos(){
		return xPos;
	}

	public int getyPos(){
		return yPos;
	}
}
