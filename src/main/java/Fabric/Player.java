package Fabric;

/**
 * Singleton pattern class, there be a single instance of player at once.
 */
public class Player implements iPlayer {

    static String playerName;
    static playerClass playerClass;

    private static Player instance;

    private Player(String playerName, playerClass playerClass) {
        Player.playerName = playerName;
        Player.playerClass = playerClass;
    }

    public static Player getInstance(String playerName, playerClass playerClass) {
        if (instance == null) {
            instance = new Player(playerName, playerClass);
        }
        return instance;
    }

    public playerClass getPlayerClass() {
        return playerClass;
    }

    @Override
    public void findItem(ItemGenerator item) {
        System.out.println(playerClass + " " + "find some item: ");
        item.openReward();
    }

}
