package Rewards;

import Fabric.GameItem;

public class GoldReward implements GameItem {

    @Override
    public void openReward() {
        System.out.println("You find some Gold");
    }

}
