import java.util.ArrayList;

public class Game {
	final static private int spacesX = 100;
	final static private int spacesY = 100;
	private ArrayList<Person> allPersons;
	private ArrayList<Obstacle> allObstacles;

	public Game (){
		allPersons = new ArrayList<>();
		allObstacles = new ArrayList<>();
		for(int i = 0; i < 100; i++) {
			addPerson();
		}
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
