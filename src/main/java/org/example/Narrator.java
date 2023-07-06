package org.example;

public class Narrator {
    private Sword sword;
    private Armor armor;
    Narrator(LocationFactory factory) {
        sword = factory.createSword();
        armor = factory.createArmor();
    }

    void talk() {
        sword.tell();
        armor.tell();
    }
}
