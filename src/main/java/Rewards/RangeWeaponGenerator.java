package Rewards;

import Fabric.GameItem;
import Fabric.ItemGenerator;

public class RangeWeaponGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new RangeWeaponReward();
    }
}
