package org.example;

/**
 * Класс игрока
 */
public class Player {
    /**
     * Состояние игрока
     */
    private State state;

    /**
     * Сеттер для состояния
     * @param state состояние игрока
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Геттер для состояния
     * @return состояние игрока
     */
    public State getState() {
        return state;
    }
}
