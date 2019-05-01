package main.java;

/**
 * An ExpandableBall is a ball that implements the Expandable interface.
 * Expandable objects can grow() or shrink() in size.
 * 
 * @author Andrew Case <acase@cs.nyu.edu>
 */
public class ExpandableBall extends Ball implements Expandable {

    // The speed at which the size change occurs
    private static final double CHANGE_SPEED = .1;

    /**
     * Constructor with arguments
     * 
     * @param xPos location for this Ball
     * @param yPos location for this Ball
     */
    public ExpandableBall(int xPos, int yPos) {
        super(xPos, yPos);
    }

    @Override
    public void grow() {
        radius += CHANGE_SPEED;
    }

    @Override
    public void shrink() {
        radius -= CHANGE_SPEED;
    }
}