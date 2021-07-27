package de.zigames.test;

import java.awt.Graphics;

import de.zigames.engine.game.objects.GameObject;

public class DrawingObject extends GameObject{

	public DrawingObject() {
		
	}

	@Override
	public void draw(Graphics g,int width,int height) {
		g.drawLine(0, 0, width, height);
	}

}
