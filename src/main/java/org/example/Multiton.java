package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 *  Класс мультитон
 */
public class Multiton {
    /**
     * Статичная мапа для экземпляров класса
     */
    private static Map<String, Multiton> difficulties = new HashMap<String, Multiton>();

    /**
     * Пример поля класса (название сложности)
     */
    private String name;

    /**
     * Приватный конструктор
     * @param name - навзвание сложности
     */
    private Multiton(String name) {
        this.name = name;
    }

    /**
     *
     * @param difficulty - получаем конфигурацию для определенной сложности
     * @return возврощаем конфигурацию в виде объекта Multition
     */
    public static Multiton getInstance(String difficulty) {
        if (!difficulties.containsKey(difficulty)) {
            difficulties.put(difficulty, new Multiton(difficulty));
        }
        return difficulties.get(difficulty);
    }

    /**
     * Метод класса для примера
     * @return Перевод объекта в строку
     */
    @Override
    public String toString() {
        return "Difficulty mode: " + this.name;
    }
}
