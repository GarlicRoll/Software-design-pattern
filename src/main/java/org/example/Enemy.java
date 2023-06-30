package org.example;

/**
 * Абстрактный класс врага для игры
 */
abstract public class Enemy {
    /**
     * Получение брони
     * @return броня
     */
    public Armor getArmor() {
        return armor;
    }

    /**
     * Установка брони
     * @param armor броня
     */
    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    /**
     * Метод для взаимодействия с бронёй
     */
    public abstract void performWithArmor();

    /**
     * Броня у противника
     */
    protected Armor armor;

}


