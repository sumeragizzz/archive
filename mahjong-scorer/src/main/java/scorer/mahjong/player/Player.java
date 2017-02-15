package scorer.mahjong.player;

import java.math.BigDecimal;

public interface Player {

    String getName();

    BigDecimal getScore();

    boolean isParent();

    boolean isFireBird();

}
