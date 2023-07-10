package org.example;

public class Main {
    /**
     * Пример работы с паттерном "строитель"
     */
    public static void main(String[] args) {
        Mob.Builder mobInConstruction = new Mob.Builder();
        mobInConstruction.withHealth(100);
        mobInConstruction.withArmor(50);
        Mob mob = mobInConstruction.getResult();
        System.out.println("Health: " + mob.getHealth());
        System.out.println("Armor: " + mob.getArmor());
    }
}