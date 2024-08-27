package Main;

import Animals.Animal;
import Animals.AnimalFactory;
import Field.Field;
import Threads.SimulatorThread;


// запускать симулятор выживания можно тут! Наслаждайтесь!


public class StartingSurvive {

    public static void main(String[] args) {
        Field field = new Field();

        Animal rabbit = AnimalFactory.createAnimal("rabbit", 2, 1);
        Animal wolf = AnimalFactory.createAnimal("wolf", 1, 2);
        Animal boar = AnimalFactory.createAnimal("boar", 2, 2);
        Animal buffalo = AnimalFactory.createAnimal("buffalo", 2, 3);
        Animal caterpillar = AnimalFactory.createAnimal("caterpillar", 3, 3);
        Animal deer = AnimalFactory.createAnimal("deer", 4, 3);
        Animal duck = AnimalFactory.createAnimal("duck", 4, 4);
        Animal goat = AnimalFactory.createAnimal("goat", 5, 4);
        Animal horse = AnimalFactory.createAnimal("horse", 5, 5);
        Animal mouse = AnimalFactory.createAnimal("mouse", 6, 5);
        Animal sheep = AnimalFactory.createAnimal("sheep", 6, 6);
        Animal bear = AnimalFactory.createAnimal("bear", 7, 6);
        Animal eagle = AnimalFactory.createAnimal("eagle", 7, 7);
        Animal fox = AnimalFactory.createAnimal("fox", 8, 8);
        Animal snake = AnimalFactory.createAnimal("snake", 9, 8);



        field.placeAnimal(rabbit, rabbit.getX(), rabbit.getY());
        field.placeAnimal(wolf, wolf.getX(), wolf.getY());


        SimulatorThread simulation = new SimulatorThread(field, rabbit, wolf, boar, buffalo, caterpillar, deer, duck,
                goat, horse, mouse, sheep, bear, eagle, fox, snake);
        Thread thread = new Thread(simulation);
        thread.start();
    }
}






