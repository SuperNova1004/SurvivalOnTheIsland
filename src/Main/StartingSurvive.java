package Main;

import Field.Field;
import Animals.Predators.Wolf;
import Animals.Herbivores.Rabbit;

public class StartingSurvive {
    public static void main(String[] args) {
        Field field = new Field();

        // Добавляем животных
        field.addAnimal(new Wolf(0, 0));
        field.addAnimal(new Rabbit(2, 2));

        // Растим траву и реку
        field.growPlant();
        field.createRiver();

        while (!field.checkEndGame()) {
            field.reproduceAnimals();
            field.growPlant();
            field.printField();
            try {
                Thread.sleep(4000); // Делаем паузу в 4 секунды между ходами
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

