package de.zigames.engine.window;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;

import de.zigames.engine.game.objects.GameObject;

public class Window {
	
	JFrame frame;
	Screen screen;
	List<GameObject> gameObjects;
	
	public Window() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screen = new Screen();
		frame.add(screen);
	}
	
	public void initGameObjects(List<GameObject> gameObjects) {
		this.gameObjects=gameObjects;
	}
	
	public void setVisibility(boolean b) {
		frame.setVisible(b);
	}
	
	public void repaintScreen() {
		screen.repaint();
	}

	public void setSize(int w, int h) {
		frame.setSize(w, h);
	}
	
	
	private class Screen extends JLabel{
		
		@Override
		public void paint(Graphics g) {			
			super.paint(g);
			for(GameObject obj : gameObjects) {
				obj.draw(g,screen.getWidth(),screen.getHeight());
			}
		}
		
	}

}
