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
        Animal boar = AnimalFactory.createAnimal("boar", 10, 2);
        Animal buffalo = AnimalFactory.createAnimal("buffalo", 2, 4);
        Animal caterpillar = AnimalFactory.createAnimal("caterpillar", 3, 3);
        Animal deer = AnimalFactory.createAnimal("deer", 4, 3);
        Animal duck = AnimalFactory.createAnimal("duck", 8, 4);
        Animal goat = AnimalFactory.createAnimal("goat", 5, 1);
        Animal horse = AnimalFactory.createAnimal("horse", 5, 5);
        Animal mouse = AnimalFactory.createAnimal("mouse", 6, 11);
        Animal sheep = AnimalFactory.createAnimal("sheep", 6, 6);
        Animal bear = AnimalFactory.createAnimal("bear", 7, 9);
        Animal eagle = AnimalFactory.createAnimal("eagle", 10, 7);
        Animal fox = AnimalFactory.createAnimal("fox", 3, 12);
        Animal snake = AnimalFactory.createAnimal("snake", 1, 8);



        field.placeAnimal(rabbit, rabbit.getX(), rabbit.getY());
        field.placeAnimal(wolf, wolf.getX(), wolf.getY());


        SimulatorThread simulation = new SimulatorThread(field, rabbit, wolf, boar, buffalo, caterpillar, deer, duck,
                goat, horse, mouse, sheep, bear, eagle, fox, snake);
        Thread thread = new Thread(simulation);
        thread.start();
    }
}






