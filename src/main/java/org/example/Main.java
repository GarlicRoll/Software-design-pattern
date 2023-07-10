package org.example;

public class Main {
    /**
     * Пример работы с шаблоном Decorator
     */
    public static void main(String[] args) {
        Decorator mob = new DecoratorLegendary(new DecoratorInvisible(new Mob()));
        mob.say();
        mob.sayAdditional();
    }
}