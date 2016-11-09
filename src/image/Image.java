package image;

import game.Player;
import game.GamePlate;

import java.awt.Color;

public enum Image {
	
	PLAYER("player", Player.WIDTH, Player.HEIGHT, new Color(255,255,255)),
	BACKGROUND("background", GamePlate.WIDTH*3, GamePlate.HEIGHT, new Color(255,255,255));
	
	
	private static final int size = Image.values().length;

	private final String key;
	private final int width;
	private final int height;
	private final Color color;
	
	private Image(String key, int width, int height, Color color) {
		this.key = key;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	
	
	public static int getSize() {
		return size;
	}

	public String getKey() {
		return key;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Color getColor() {
		return color;
	}

	
}
