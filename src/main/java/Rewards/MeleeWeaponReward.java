package Rewards;

import Fabric.GameItem;

public class MeleeWeaponReward implements GameItem {

    @Override
    public void openReward() {
        System.out.println("You find a handful melee Weapon");
    }

}
