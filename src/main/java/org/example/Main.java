package org.example;

public class Main {
    /**
     * Пример работы с шаблоном Strategy
     */
    public static void main(String[] args) {
        Player player = new Player(100, 100);
        player.setStrategy(new EasyStrategy());
        int[] output;
        output = player.executeStrategy();
        player.setEnergy(player.getEnergy() - output[1]);
        System.out.println(player.getEnergy() + " energy left.");
        System.out.println(output[0] + " damage player tried to inflict.");

        player.setStrategy(new HardStrategy());
        output = player.executeStrategy();
        player.setEnergy(player.getEnergy() - output[1]);
        System.out.println(player.getEnergy() + " energy left.");
        System.out.println(output[0] + " damage player tried to inflict.");
    }
}