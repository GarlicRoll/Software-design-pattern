package org.example;

public class Main {
    /**
     * Пример работы с паттерном абстрактная фабрика
     */
    public static void main(String[] args) {
        LocationFactory dungeonFactory = new DungeonFactory();
        Narrator dungeonNarrator = new Narrator(dungeonFactory);
        dungeonNarrator.talk();

        LocationFactory castleFactory = new CastleFactory();
        Narrator castleNarrator = new Narrator(castleFactory);
        castleNarrator.talk();
    }
}