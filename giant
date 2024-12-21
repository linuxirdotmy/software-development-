// This is Giant class

java
import java.awt.*;
public class Giant extends Critter {
    private int steps;
    private static final String[] PHRASES = {"fee", "fie", "foe", "fum"};
    public Giant() {
        this.steps = 0;
    }
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }
    public Color getColor() {
        return Color.GRAY;
    }
    public String toString() {
        return PHRASES[(steps / 6) % PHRASES.length];
    }
}
