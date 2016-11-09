package game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePlate extends JPanel{
	public static final int WIDTH = 600, HEIGHT = 800;
	
	//rychlost behu pozadi
	public static final int SPEED = -2;
	
	//TODO
	
	
	
	private BufferedImage img;
	
	private Timer animationTimer;
	
	private boolean isPaused = false;
	private boolean isRunning = true;
	
	private int BackgroundMoveX = 0;
	
	
	public GamePlate(){
		
		
	}
	
	public void paint (Graphics g){
		super.paint(g);
		
		g.drawImage(img, BackgroundMoveX, 0, null);
		
		g.drawImage(img, BackgroundMoveX+img.getWidth(), 0, null);
		
	}
	
	private void update(){
		if( !isPaused && isRunning){
			
			//TODO
			
			BackgroundMoveX = BackgroundMoveX + GamePlate.SPEED;
			
			if(BackgroundMoveX == -img.getWidth()){
				BackgroundMoveX = 0;
			}
		}
		
		
	}
	
}
