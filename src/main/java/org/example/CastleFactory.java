package org.example;

public class CastleFactory implements LocationFactory {

    @Override
    public Sword createSword() {
        return new CastleSword();
    }

    @Override
    public Armor createArmor() {
        return new CastleArmor();
    }
}
