package org.example;

/**
 * Класс декоратора для легендарных существ в игре
 */
public class DecoratorLegendary extends Decorator {

    /**
     * Конструктор декоратора
     *
     * @param mob объект-компонент
     */
    public DecoratorLegendary(MobInterface mob) {
        super(mob);
    }

    /**
     * Метод для вывода текста для примера
     */
    @Override
    public void say() {
        super.say();
        System.out.println("I am LEGENDARY mob.");
    }

    /**
     * Метод дополнительный для вывода текста
     */
    @Override
    public void sayAdditional() {
        super.sayAdditional();
        System.out.println("Last decorator is 'DecoratorLegendary'");
    }
}
