package org.example;

/**
 * Стратегия, наносящая максимальный урон
 */
public class HardStrategy implements Strategy {
    /**
     * Тяжёлая стратегия, требующая всю энергию игрока
     * @param damage урон оружия игрока
     * @param energy энергия игрока
     * @return возвращает массив из двух чисел - сколько урона наносит игрок (2) и сколько энергии тратит (1)
     */
    @Override
    public int[] execute(int damage, int energy) {
        int[] output = new int[2];
        output[0] = damage * 2;
        output[1] = energy;
        System.out.println("Hard strategy used");
        return output;
    }
}
