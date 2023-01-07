package Fabric;

public abstract class ItemGenerator {

    public void openReward() {
        GameItem gameItem = createItem();
        gameItem.openReward();
    }

    public abstract GameItem createItem();

}
