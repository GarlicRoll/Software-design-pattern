package org.example;

/**
 * Обычное состояние игрока
 */
public class NormalState implements State {
    /**
     * Метод для атаки, в таком состоянии игрок может спокойно атаковать
     */
    @Override
    public void attack() {
        System.out.println("\tThe player successfully attacked!");
    }
}
