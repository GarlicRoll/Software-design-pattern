package org.example;

/**
 * Пример неэнергозатратной стратегии
 */
public class EasyStrategy implements Strategy {
    /**
     * Применение лёгкой стратегии
     * @param damage урон оружия игрока
     * @param energy энергия игрока
     * @return возвращает массив из двух чисел - сколько урона наносит игрок (1/4) и сколько энергии тратит (1/2)
     */
    @Override
    public int[] execute(int damage, int energy) {
        int[] output = new int[2];
        output[0] = damage / 4;
        output[1] = energy / 2;
        System.out.println("Easy strategy used");
        return output;
    }
}
