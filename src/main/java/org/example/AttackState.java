package org.example;

/**
 * Состояние в котором игрок атакует
 */
public class AttackState implements State {
    /**
     * Метод для атаки
     * В этом состоянии игрок уже атакует, атаковать снова не получится
     */
    @Override
    public void attack() {
        System.out.println("\tAttack already in process!");
    }
}
