import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Asteroid {
	private int xPos;
	private int yPos = -20;
	private int lato = 35; // for speed and size of asteroid

	Image asteroid = new ImageIcon("assets/asteroid.png").getImage();

	// Constructor
	public Asteroid(int xPos) {
		super();
		this.xPos = xPos;
	}

	// Getters and Setters
	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getLato() {
		return lato;
	}

	public void setLato(Integer lato) {
		this.lato = lato;
	}

	public void moveDown() {
		yPos = yPos + lato;
	}

	// makes asteroid
	public void drawAsteroid(Graphics g) {
		g.drawImage(asteroid, xPos, yPos, 35, 35, null);
	}

}
