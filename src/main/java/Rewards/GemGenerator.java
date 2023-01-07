package Rewards;

import Fabric.GameItem;
import Fabric.ItemGenerator;

public class GemGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}
