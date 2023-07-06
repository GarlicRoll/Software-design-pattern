package org.example;

public class DungeonFactory implements LocationFactory {
    @Override
    public Sword createSword() {
        return new DungeonSword();
    }

    @Override
    public Armor createArmor() {
        return new DungeonArmor();
    }
}
