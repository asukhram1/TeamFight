import java.awt.*;

public class Person {
	double health;
	int level;
	int xPos;
	int yPos;
	Color owner;
	
	public Person() {
		this.health = 100.0;
		this.level = 0;
		this.xPos = (int)(Math.random()*100);
		this.yPos = (int)(Math.random()*100);
		this.owner = Color.white;
	}
}
