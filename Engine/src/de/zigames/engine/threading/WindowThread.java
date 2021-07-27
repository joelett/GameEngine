package de.zigames.engine.threading;

import java.util.ArrayList;
import java.util.List;

import de.zigames.engine.game.objects.GameObject;
import de.zigames.engine.window.Window;

public class WindowThread extends Thread{
	
	List<GameObject> objects = new ArrayList<>();
	
	Window window;
	
	public WindowThread() {
		window = new Window();
	}
	public void setVisibility(boolean b) {
		window.setVisibility(b);
	}
	
	public void setGameObjects(List<GameObject> gameObjects) {
		this.objects = gameObjects;
		window.initGameObjects(gameObjects);
	}
	
	@Override
	public void run() {
		while(true) {
			window.repaintScreen();
		}
	}

}
