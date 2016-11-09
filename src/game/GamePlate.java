package game;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePlate extends JPanel {
	public static final int WIDTH = 600, HEIGHT = 800;

	// rychlost behu pozadi
	public static final int SPEED = -2;

	// TODO

	private BufferedImage img;

	private Timer animationTimer;

	private boolean isPaused = false;
	private boolean isRunning = true;

	private int BackgroundMoveX = 0;

	public GamePlate() {

	}

	public void paint(Graphics g) {
		super.paint(g);

		g.drawImage(img, BackgroundMoveX, 0, null);

		g.drawImage(img, BackgroundMoveX + img.getWidth(), 0, null);

	}

	private void update() {
		if (!isPaused && isRunning) {

			// TODO

			BackgroundMoveX = BackgroundMoveX + GamePlate.SPEED;

			if (BackgroundMoveX == -img.getWidth()) {
				BackgroundMoveX = 0;
			}
		}

	}

	private void launchGame() {
		animationTimer = new Timer(20, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				update();
			}
		});

		isRunning = true;
		animationTimer.start();
	}

	public void prepareGamePlate() {
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1) {

				}
				// pause

				if (e.getButton() == MouseEvent.BUTTON3) {
					if (isRunning) {
						if (isPaused) {
							isPaused = false;
						} else {
							if (isPaused) {
								isPaused = true;
							}
						}

					} else {
						prepareNewGame();
						launchGame();
						
					}
				}
			}

		});
		
		setSize(WIDTH, HEIGHT);
	}

	protected void prepareNewGame() {
		// TODO Auto-generated method stub
		
	}

}
