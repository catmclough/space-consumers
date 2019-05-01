package main.java;

import java.util.ArrayList;

/**
 * An intelligent ball is a <code>Ball</code> that:
 * <ol>
 * <li>Tries to accelerate towards smaller balls that are near it (to consume
 * them)
 * <li>Tries to accelerate away from larger balls that are near it (to evade
 * them)
 * </ol>
 * 
 * @author Catherine McLoughlin <cgm289@nyu.edu>
 * 
 */
public class IntelligentBall extends ExpandableBall {
    /**
     * Constructor with arguments
     * 
     * @param xPos location for this <code>IntelligentBall</code>
     * @param yPos location for this <code>IntelligentBall</code>
     */
	IntelligentBall(int xPos, int yPos) {
		super(xPos, yPos);
		super.setColor(0, 0, 255); //intelligent balls are blue by default	
	}
	
	/**
     * Tries to accelerate towards smaller balls that are near it (to consume
     * 	them)
     * 
     * @param objects list of balls that it may want to try and consume
     */
	void accelerate(ArrayList<GeometricObject> objects) {
    	Ball smarty = (Ball)getClosest(this, objects);
    	if (smarty.getArea() < this.getArea()) {
    		accelerate(smarty.xPos, smarty.yPos);
    	}
    }
	
    /**
     * Tries to decelerate away from larger balls that are near it (to evade
     * them)
     * 
     * @param objects
     */
    public void decelerate(ArrayList<GeometricObject> objects) {
    	Ball nearme = (Ball)getClosest(this, objects);
    	if (nearme.getArea() > this.getArea()) {
    		decelerate(nearme.xPos, nearme.yPos);
    	}
    }
	
    
}
