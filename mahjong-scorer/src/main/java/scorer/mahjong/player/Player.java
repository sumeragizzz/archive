package scorer.mahjong.player;

import java.io.Serializable;
import java.math.BigDecimal;

public class Player implements Serializable {

    private String name;

    private BigDecimal score;

    private boolean parent;

    private boolean fireBird;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public boolean isParent() {
        return parent;
    }

    public void setParent(boolean parent) {
        this.parent = parent;
    }

    public boolean isFireBird() {
        return fireBird;
    }

    public void setFireBird(boolean fireBird) {
        this.fireBird = fireBird;
    }

}
