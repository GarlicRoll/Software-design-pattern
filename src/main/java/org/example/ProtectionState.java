package org.example;

/**
 * Состояние в котором игрока атакуют (или игрок защищается)
 */
public class ProtectionState implements State {
    /**
     * В данном случае атаковать тоже не получится, так как игрока атакуют
     */
    @Override
    public void attack() {
        System.out.println("\tPlayer is under attack! He cannot attack!");
    }
}
