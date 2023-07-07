package org.example;

public class Main {
    /**
     * Пример работы с шаблоном Memento
     */
    public static void main(String[] args) {
        Game game = new Game();
        CareTaker careTaker = new CareTaker();
        game.setStatus(170603);
        System.out.println("Status before saving: " + game.getStatus());
        careTaker.setMemento(game.saveGame());
        game.setStatus(999999);
        System.out.println("Status after saving: " + game.getStatus());
        game.restoreGame(careTaker.getMemento());
        System.out.println("Status after restoring: " + game.getStatus());

    }
}