package org.example;

public class Main {
    /**
     * Пример работы с шаблоном Composite
     */
    public static void main(String[] args) {
        Boss boss1 = new Boss();
        Boss boss2 = new Boss();
        boss2.add(new Minion());
        boss2.add(new Minion());
        boss1.add(new Minion());
        boss1.add(boss2);
        boss1.talk();
    }
}