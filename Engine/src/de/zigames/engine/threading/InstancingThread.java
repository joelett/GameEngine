package de.zigames.engine.threading;

import java.util.List;

import de.zigames.engine.game.objects.GameObject;

public class InstancingThread extends Thread{

	public InstancingThread() {
	}
	
	
	List<GameObject> gameObjects;
	
	public void setObjects(List<GameObject> gameObjects) {
		this.gameObjects=gameObjects;
	}

}
