package org.example;

public class Main {
    /**
     * Пример работы с шаблоном state
     */
    public static void main(String[] args) {
        Player player = new Player();

        System.out.println("\nNormal State");
        player.setState(new NormalState());
        player.getState().attack();

        System.out.println("\nAttack State");
        player.setState(new AttackState());
        player.getState().attack();

        System.out.println("\nProtection State");
        player.setState(new ProtectionState());
        player.getState().attack();
    }
}