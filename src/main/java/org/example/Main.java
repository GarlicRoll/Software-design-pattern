package org.example;

public class Main {
    /**
     * Пример работы с паттерном Bridge
     */
    public static void main(String[] args) {
        SilverArmor armor = new SilverArmor();
        new Snail(armor).performWithArmor();
        new Snake(armor).performWithArmor();
    }
}