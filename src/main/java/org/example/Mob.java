package org.example;

/**
 * Класс существа
 */
public class Mob {
    /**
     * Поле здоровья
     */
    private int health;
    /**
     * Поле брони
     */
    private int armor;

    /**
     * Геттер для здоровья
     * @return здоровье
     */
    public int getHealth() {
        return health;
    }

    /**
     * Геттер для брони
     * @return броня
     */
    public int getArmor() {
        return armor;
    }

    /**
     * Класс строителя для существа, неотделим от самого класса существа
     */
    public static class Builder {
        /**
         * Поле для нового созданного объекта существа
         */
        private Mob newMob;

        /**
         * Конструктор строителя
         */
        public Builder() {
            newMob = new Mob();
        }

        /**
         * Часть строителя для "постройки" здоровья существа
         * @param health здоровье
         * @return часть построенного объекта
         */
        public Builder withHealth(int health) {
            newMob.health = health;
            return this;
        }

        /**
         * Часть строителя для "постройки" брони существа
         * @param armor броня
         * @return часть построенного объекта
         */
        public Builder withArmor(int armor) {
            newMob.armor = armor;
            return this;
        }

        /**
         * Метод получения финального результата
         * @return готовое существо
         */
        public Mob getResult() {
            return newMob;
        }
    }
}
