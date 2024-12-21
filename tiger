// this is tiger class

java
import java.awt.*;
import java.util.*;
public class Tiger extends Critter {
    private int moves;
    private Color currentColor;
    private static final Color[] COLORS = {Color.RED, Color.GREEN, Color.BLUE};
    public Tiger() {
        this.moves = 0;
        this.currentColor = COLORS[new Random().nextInt(COLORS.length)];
    }
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
    public Color getColor() {
        if (moves % 3 == 0) {
            currentColor = COLORS[new Random().nextInt(COLORS.length)];
        }
        moves++;
        return currentColor;
    }
    public String toString() {
        return "TGR";
    }
}
