package org.example;

/**
 * Противиник - змея в броне
 */
public class Snake extends Enemy {
    /**
     * Конструктор для змеи
     * @param armor броня
     */
    public Snake(Armor armor) {
        setArmor(armor);
    }

    /**
     * Надеваем броню на змею
     */
    @Override
    public void performWithArmor() {
        System.out.print("Putting the armor on the snake: ");
        armor.useArmor();
    }
}
