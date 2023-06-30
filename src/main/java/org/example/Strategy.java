package org.example;

/**
 *  Стратегия атаки игрока
 */
interface Strategy {
    /**
     * Применение стратегии атаки
     * @param damage урон оружия игрока
     * @param energy энергия игрока
     * @return возвращает массив из двух чисел - сколько урона наносит игрок и сколько энергии тратит
     */
    int[] execute(int damage, int energy);
}
