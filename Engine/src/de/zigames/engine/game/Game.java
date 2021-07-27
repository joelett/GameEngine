package de.zigames.engine.game;

import java.util.ArrayList;
import java.util.List;

import de.zigames.engine.game.objects.GameObject;
import de.zigames.engine.threading.Threadmanager;

public class Game {
	
	List<GameObject> objects = new ArrayList<>();
	Threadmanager tman;
	
	public Game() {
		tman = new Threadmanager();
		tman.initObjectList(objects);
		tman.setWindowVisibility(true);
		tman.setWindowSize(800,600);
		tman.startThreads();
	}
	
	public void addObjects(GameObject...gameObjects) {
		for(int i=0;i<gameObjects.length;i++) {
			objects.add(gameObjects[i]);
		}
	}
	
}
