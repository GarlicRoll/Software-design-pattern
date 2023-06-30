package org.example;

public class Main {
    /**
     * Пример работы с классом Multition
     */
    public static void main(String[] args) {
        Multiton difficulty1 = Multiton.getInstance("Easy");
        Multiton difficulty2 = Multiton.getInstance("Normal");
        Multiton difficulty3 = Multiton.getInstance("Hard");
        System.out.println(difficulty1);
        System.out.println(difficulty2);
        System.out.println(difficulty3);
    }
}