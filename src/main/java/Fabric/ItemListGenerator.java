package Fabric;

import Rewards.*;

import java.util.ArrayList;
import java.util.List;

public class ItemListGenerator {

    List<ItemGenerator> generator = new ArrayList<>();

    public ItemListGenerator(playerClass playerClass) {
        switch (playerClass) {
            case MELEE -> {
                generator.add(new GoldGenerator());
                generator.add(new GoldGenerator());
                generator.add(new GemGenerator());
                generator.add(new MeleeWeaponGenerator());
                generator.add(new MeleeWeaponGenerator());
                generator.add(new MeleeWeaponGenerator());
                generator.add(new RangeWeaponGenerator());
            }
            case MARKSMAN -> {
                generator.add(new GoldGenerator());
                generator.add(new GoldGenerator());
                generator.add(new GemGenerator());
                generator.add(new MeleeWeaponGenerator());
                generator.add(new RangeWeaponGenerator());
                generator.add(new RangeWeaponGenerator());
                generator.add(new RangeWeaponGenerator());
            }
            case MAGE -> {
                generator.add(new GoldGenerator());
                generator.add(new GemGenerator());
                generator.add(new GemGenerator());
                generator.add(new MagicScrollGenerator());
                generator.add(new MagicScrollGenerator());
                generator.add(new MagicScrollGenerator());
            }
        }

    }

    public List<ItemGenerator> getGenerator() {
        return generator;
    }

    public void setGenerator(List<ItemGenerator> generator) {
        this.generator = generator;
    }
}
