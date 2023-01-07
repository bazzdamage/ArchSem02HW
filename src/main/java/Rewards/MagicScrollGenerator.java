package Rewards;

import Fabric.GameItem;
import Fabric.ItemGenerator;

public class MagicScrollGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new MagicScrollReward();
    }
}
