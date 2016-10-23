import java.awt.*;
import java.util.*;

public class Game {
	final static private int spacesX = 100;
	final static private int spacesY = 100;
	private ArrayList<Person> allPersons;
	private ArrayList<Obstacle> allObstacles;
	int playerNumber = 0;
	Color[] playerColor = {Color.red , Color.blue , Color.green , Color.yellow};

	public Game (){
		allPersons = new ArrayList<>();
		allObstacles = new ArrayList<>();
		for(int i = 0; i < 100; i++) {
			addPerson();
		}
		addPlayer();
	}

	public void processClick(int x, int y){
		System.out.println("X: " + x + ", Y: " + y);
	}

	public void addPlayer(){
		if(playerNumber > 4)
			return;
		allPersons.get(playerNumber).setOwner(playerColor[playerNumber]);
		playerNumber++;
	}
	
	public void addPerson(){
		allPersons.add(new Person());
	}

	public void addObstacle(){
		allObstacles.add(new Obstacle());
	}

	public int getNumPersons(){
		return allPersons.size();
	}

	public Person getPerson(int index){
		return allPersons.get(index);
	}

	public static int getSpacesX(){
		return spacesX;
	}

	public static int  getSpacesY(){
		return spacesY;
	}
}
