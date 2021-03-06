package lib.Plants;

import lib.Plant;

public class Helianthus extends Plant {
    public Helianthus() {
        super();
        point = 130;
    }

    @Override
    protected void validateGrowth() {
        if (waterCount >= 3 && fertilizerCount >= 3) {
            waterCount -= 3;
            fertilizerCount -= 3;
            growthStage++;
        }
    }
}
