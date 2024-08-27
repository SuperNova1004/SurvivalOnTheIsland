package Main;

import Animals.Animal;
import Animals.AnimalFactory;
import Field.Field;
import Threads.SimulatorThread;

public class StartingSurvive {
    public static void main(String[] args) {
        Field field = new Field();

        Animal rabbit = AnimalFactory.createAnimal("rabbit", 2, 1);
        Animal wolf = AnimalFactory.createAnimal("wolf", 1, 2);
        Animal rabbit1 = AnimalFactory.createAnimal("rabbit", 3, 1);
        Animal wolf1 = AnimalFactory.createAnimal("wolf", 4, 2);


        field.placeAnimal(rabbit, rabbit.getX(), rabbit.getY());
        field.placeAnimal(wolf, wolf.getX(), wolf.getY());
        field.placeAnimal(rabbit1, rabbit1.getX(), rabbit1.getY());
        field.placeAnimal(wolf1, wolf1.getX(), wolf1.getY());

        SimulatorThread simulation = new SimulatorThread(field, rabbit, wolf);
        Thread thread = new Thread(simulation);
        thread.start();
    }
}






