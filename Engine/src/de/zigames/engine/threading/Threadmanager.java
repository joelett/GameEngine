package de.zigames.engine.threading;

import java.util.List;

import de.zigames.engine.game.objects.GameObject;

public class Threadmanager {
	
	private Thread[] threads = new Thread[3];
	
	public Threadmanager() {
		threads[0]=new InstancingThread();
		threads[1]=new LogicThread();
		threads[2]=new WindowThread();
	}
	
	public void setWindowVisibility(boolean b) {
		((WindowThread) threads[2]).setVisibility(b);
	}

	public void setWindowSize(int w, int h) {
		((WindowThread) threads[2]).window.setSize(w,h);
	}
	
	List<GameObject> gameObjects;
	
	public void initObjectList(List<GameObject> objects) {
		gameObjects = objects;
		((InstancingThread)threads[0]).setObjects(gameObjects);
		((WindowThread)threads[2]).setGameObjects(gameObjects);
	}
	
	public void startThreads() {
		for(int i=0;i<threads.length;i++) {
			threads[i].start();
		}
	}

}
