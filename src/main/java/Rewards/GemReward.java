package Rewards;

import Fabric.GameItem;

public class GemReward implements GameItem {

    @Override
    public void openReward() {
        System.out.println("You find some Gem");
    }

}
