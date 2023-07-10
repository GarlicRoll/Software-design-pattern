package org.example;

/**
 * Интерфейс состоянеи игрока
 */
public interface State {
    /**
     * Метод для атаки, будет по разному реализован в разных состояниях
     */
    void attack();
}
