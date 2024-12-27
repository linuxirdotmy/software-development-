// This is ninjacat

java
import java.awt.*;
public class NinjaCat extends Critter {
    public NinjaCat() {
        // Custom initialization if needed
    }
    public Action getMove(CritterInfo info) {
        if (info.frontThreat()) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }
    public Color getColor() {
        return Color.MAGENTA;
    }
    public String toString() {
        return "NC";
    }
}

