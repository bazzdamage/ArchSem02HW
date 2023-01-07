package Rewards;

import Fabric.GameItem;

public class RangeWeaponReward implements GameItem {

    @Override
    public void openReward() {
        System.out.println("You find a well-crafted Ranged Weapon");
    }

}
