import Fabric.ItemGenerator;
import Fabric.ItemListGenerator;
import Fabric.Player;
import Utils.UserInputProcessor;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        UserInputProcessor uip = new UserInputProcessor();
        String playerName = uip.UserInputHandler("Hi, please introduce yourself: ", 0);
        System.out.println("Greetings to you, dear " + playerName);
        String playerClass = uip.UserInputHandler("Choose your Destiny (Melee, Marksman or Mage): ", 1);
        Player player = Player.getInstance(playerName, Fabric.playerClass.valueOf(playerClass.toUpperCase()));
        System.out.println(playerClass + " " + playerName + " begin it's journey");
        ItemListGenerator items = new ItemListGenerator(player.getPlayerClass());
        Random random = new Random();
        int countOfPickups = 10; //just for testing purpose
        for (int i = 0; i < countOfPickups; i++) {
            player.findItem(items.getGenerator().get(random.nextInt(items.getGenerator().size())));
        }
    }
}
