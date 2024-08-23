package Main;

import Animals.Animal;
import Animals.AnimalFactory;
import Field.Field;
import Threads.SimulatorThread;


public class StartingSurvive {

    public static void main(String[] args) {
        Field field = new Field();

        Animal rabbit = AnimalFactory.createAnimal("rabbit", 5, 5);
        Animal wolf = AnimalFactory.createAnimal("wolf", 10, 4);

        field.placeAnimal(rabbit, rabbit.getX(), rabbit.getY());
        field.placeAnimal(wolf, wolf.getX(), wolf.getY());

        SimulatorThread simulation = new SimulatorThread(field, rabbit, wolf);
        Thread thread = new Thread (simulation);
        thread.start();
    }
}
