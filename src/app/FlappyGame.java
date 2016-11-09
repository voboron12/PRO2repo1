package app;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import game.GamePlate;

public class FlappyGame extends JFrame {
	private GamePlate gp;
	
	
	public FlappyGame(){
		GamePlate gp = new GamePlate();
		getContentPane().add(gp, "Center");
		
		pack();
	}
	
	
	public void initGUI(){
		setSize(GamePlate.WIDTH, GamePlate.HEIGHT);
		
		
		setVisible(true);
	}
	
	public void launch(){
		gp = new GamePlate();
		
		getContentPane().add(gp,"Center");
		gp.setVisible(true);
		this.revalidate();
		gp.repaint();
		
		gp.prepareGamePlate();
	}
	
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				FlappyGame app = new FlappyGame();
				app.initGUI();
			}
		});
		
		
	}

}
