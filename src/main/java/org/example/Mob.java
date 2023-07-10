package org.example;

/**
 * Основной класс существа
 */
public class Mob implements MobInterface {
    /**
     * Метод для примера для вывода текста
     */
    @Override
    public void say() {
        System.out.println("I am mob.");
    }
}
