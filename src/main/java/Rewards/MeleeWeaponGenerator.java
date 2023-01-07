package Rewards;

import Fabric.GameItem;
import Fabric.ItemGenerator;

public class MeleeWeaponGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new MeleeWeaponReward();
    }
}
