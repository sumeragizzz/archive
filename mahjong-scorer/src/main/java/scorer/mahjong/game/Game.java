package scorer.mahjong.game;

import java.io.Serializable;
import java.math.BigDecimal;

public class Game implements Serializable {

    private BigDecimal honba;

    private BigDecimal riichiBoh;

    public BigDecimal getHonba() {
        return honba;
    }

    public void setHonba(BigDecimal honba) {
        this.honba = honba;
    }

    public BigDecimal getRiichiBoh() {
        return riichiBoh;
    }

    public void setRiichiBoh(BigDecimal riichiBoh) {
        this.riichiBoh = riichiBoh;
    }

}
