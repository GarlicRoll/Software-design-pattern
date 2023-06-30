package org.example;

/**
 * Конкретная реализация серебряной брони
 */
public class SilverArmor extends Armor {
    /**
     * Использование серебряной брони
     */
    @Override
    public void useArmor() {
        System.out.println("Silver armor");
    }
}
