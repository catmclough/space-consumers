package main.java;

import java.util.ArrayList;

/**
 * An <code>EvadingBall</code> is a <code>Ball</code> that is always trying to
 * move in the direction away from the nearest ball to it.
 * 
 */
public class EvadingBall extends ExpandableBall {

	/**
	 * Constructor with arguments
	 * 
	 * @param xPos location for this <code>Ball</code>
	 * @param yPos location for this <code>Ball</code>
	 */
	EvadingBall(int xPos, int yPos) {
		super(xPos, yPos);
		super.setColor(0, 255, 0);
	}

	/**
	 * Always accelerates way from the closest ball.
	 * 
	 * @param objects list of balls that it may want to try and evade
	 */
	void accelerate(ArrayList<GeometricObject> objects) {
		Ball evader = (Ball)getClosest(this, objects);
		decelerate(evader.xPos, evader.yPos);
	}
}
