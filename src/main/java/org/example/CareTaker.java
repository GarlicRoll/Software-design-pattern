package org.example;

/**
 * Класс смотрителя
 */
public class CareTaker {
    /**
     * Снимок игры
     */
    Memento memento;

    /**
     * Геттер для снимка
     * @return снимок игры
     */
    public Memento getMemento() {
        return memento;
    }

    /**
     * Сеттер для снимка
     * @param memento снимок игры
     */
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
