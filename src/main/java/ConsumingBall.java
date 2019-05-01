package main.java;

import java.util.ArrayList;

/**
 * A <code>ConsumingBall</code> is a <code>Ball</code> that is always
 * accelerating in the direction of the closest ball. In other words, it is
 * attempting to consume the closest ball (regardless if that ball is bigger or
 * smaller than it).
 * 
 * @author Catherine McLoughlin <cgm289@nyu.edu>
 */
public class ConsumingBall extends ExpandableBall {

    /**
     * Constructor with arguments
     * 
     * @param xPos location for this <code>Ball</code>
     * @param yPos location for this <code>Ball</code>
     */
    ConsumingBall(int xPos, int yPos) {
        super(xPos, yPos);
        super.setColor(255, 0, 0);  //consuming balls are red by default
    }

    @Override
    public String toString() {
        return super.toString() + " is a consuming ball";
    }

    /**
     * Consuming balls always accelerate towards the closest ball.
     * 
     * @param objects list of balls that it may want to try and consume
     */
    void accelerate(ArrayList<GeometricObject> objects) {
    	Ball consumer = (Ball)getClosest(this, objects);
		accelerate(consumer.xPos, consumer.yPos);
    }
}
