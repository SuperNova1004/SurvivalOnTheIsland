package Main;

import Animals.Rabbit;
import Animals.Wolf;
import Field.Field;
import Threads.SimulatorThread;


public class StartingSurvive {
        public static void main(String[] args) throws InterruptedException {


            Field field = new Field();
            Rabbit rabbit = new Rabbit(2,1);
            Wolf wolf = new Wolf(4,2);

            field.placeAnimal(rabbit, rabbit.x, rabbit.y);
            field.placeAnimal(wolf, wolf.x, wolf.y);

            SimulatorThread sumilation = new SimulatorThread(field, rabbit, wolf);
            Thread thread = new Thread(sumilation);
            thread.start();
        }
    }





