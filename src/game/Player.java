package game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player {
	public static final int WIDTH = 40, HEIGHT = 33;

	// jump height
	private static final int KOEF_ACCELERATION = 1;

	// player fall speed
	private static final int KOEF_SPEED = 2;

	private BufferedImage img = null;

	// starting x coord, final
	private int x;

	// starting y coord, changes
	private int y;
	private int speed;

	public Player(BufferedImage img) {
		this.img = img;
		x = GamePlate.WIDTH / 2 - (img.getWidth() / 2);
		y = GamePlate.HEIGHT / 2;
		speed = KOEF_SPEED;
	}

	public void reset() {
		y = GamePlate.HEIGHT / 2;
		speed = KOEF_SPEED;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void jump() {
		speed = -17;
	}

	/*
	 * Allows player movement
	 */

	public void move() {
		speed = speed + KOEF_ACCELERATION;
		y = y + speed;
	}
	
	public void paint(Graphics g){
		
	}

}
