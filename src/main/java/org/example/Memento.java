package org.example;

/**
 * Хранитель - сохраняет внутреннее состояние объекта Game
 */
public class Memento {
    /**
     * Состояение игры
     */
    int status;

    /**
     * Конструктор хранителя
     * @param status статус игры
     */
    public Memento(int status) {
        this.status = status;
    }

    /**
     * Геттер статуса
     * @return статус игры у хранителя
     */
    public int getStatus() {
        return status;
    }
}
