package org.example;

/**
 * Класс декоратора для невидимых существ
 */
public class DecoratorInvisible extends Decorator {
    /**
     * Переадресация конструктора
     * @param mob объект-компонент
     */
    public DecoratorInvisible(MobInterface mob) {
        super(mob);
    }

    /**
     * Метод для вывода текста для примера
     */
    @Override
    public void say() {
        super.say();
        System.out.println("I am invisible mob.");
    }

    /**
     * Метод дополнительный для вывода текста
     */
    @Override
    public void sayAdditional() {
        super.sayAdditional();
        System.out.println("Last decorator is 'DecoratorInvisible'");
    }
}
