package org.example;

/**
 * Класс игрока (Context), применяющий стратиегии
 */
public class Player {
    /**
     * Поле выбранной стратегии
     */
    private Strategy strategy;
    /**
     * Поле наносимого урона
     */
    int damage;
    /**
     * Поле энергии игрока
     */
    int energy;

    /**
     * Конструктор класса игрока
     */
    public Player(int energy, int damage) {
        setDamage(damage);
        setEnergy(energy);
    }

    /**
     * Геттер урона
     * @return урон
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Сеттер урона
     * @param damage урон
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * Геттер энергии
     * @return энергия
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * Сеттер энергии
     * @param energy энергия
     */
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /**
     * Сеттер стратегии
     * @param strategy стратегия
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Использование стратегии атаки (атака)
     * @return возвращает массив из двух чисел - сколько урона наносит игрок и сколько энергии тратит
     */
    public int[] executeStrategy() {
        return strategy.execute(damage, energy);
    }
}
