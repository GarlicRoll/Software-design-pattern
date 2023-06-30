package org.example;

/**
 * Противник в броне - улитка
 */
public class Snail extends Enemy {
    /**
     * Конструктор для улитки в броне
     * @param armor броня
     */
    public Snail(Armor armor) {
        setArmor(armor);
    }

    /**
     * Надеваем улитке броню
     */
    @Override
    public void performWithArmor() {
        System.out.print("Putting the armor on the snail: ");
        armor.useArmor();
    }
}
