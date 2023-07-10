package org.example;

/**
 * Абстрактный класс декоратора для существа
 */
abstract class Decorator implements MobInterface {
    /**
     * Ссылка на объект-компонент
     */
    protected MobInterface mob;

    /**
     * Конструктор декоратора
     * @param mob объект-компонент
     */
    public Decorator(MobInterface mob) {
        this.mob = mob;
    }

    /**
     * Переадресация операции
     */
    @Override
    public void say() {
        mob.say();
    }

    /**
     * Дополнительный метод для вывода текста для примера
     */
    public void sayAdditional() {
        System.out.println("Additional information:");
    }
}
