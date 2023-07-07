package org.example;

/**
 * Класс игры, которую можно соххранять и которую можно загружать
 */
public class Game {
    /**
     * Геттер для статуса игры
     * @return статус игры
     */
    public int getStatus() {
        return status;
    }

    /**
     * Сеттер для статуса игры
     * @param status статус игры
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * Пример поля - состояение игры - например прогресс прохождения
     */
    int status;

    /**
     * Сохарнение игры
     * @return снимок состояния игры
     */
    public Memento saveGame() {
        return new Memento(status);
    }

    /**
     * Загрузка игры
     * @param memento восстановление из снимка игры
     */
    public void restoreGame(Memento memento) {
        this.status = memento.getStatus();
    }


}
