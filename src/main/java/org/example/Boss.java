package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для босса, который может иметь приспешников
 */
public class Boss implements Mob {

    /**
     * Список приспешников (могут быть мобы, которые тоже имеют приспешников)
     */
    private List<Mob> minions = new ArrayList<Mob>();

    /**
     * Добавление приспешника
     * @param mob приспешник
     */
    public void add(Mob mob) {
        minions.add(mob);
    }

    /**
     * Удаление приспешника
     * @param mob приспешник
     */
    public void remove(Mob mob) {
        minions.remove(mob);
    }


    /**
     * Метод для примера - печать
     */
    @Override
    public void talk() {
        System.out.println("I am boss!");
        for (Mob minion:minions) {
            minion.talk();
        }
    }
}
