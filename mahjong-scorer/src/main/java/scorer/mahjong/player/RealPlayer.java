package scorer.mahjong.player;

import java.math.BigDecimal;

public class RealPlayer implements Player {

    private String name;

    private BigDecimal score;

    private boolean parent;

    private boolean fireBird;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    @Override
    public boolean isParent() {
        return parent;
    }

    public void setParent(boolean parent) {
        this.parent = parent;
    }

    @Override
    public boolean isFireBird() {
        return fireBird;
    }

    public void setFireBird(boolean fireBird) {
        this.fireBird = fireBird;
    }

}
