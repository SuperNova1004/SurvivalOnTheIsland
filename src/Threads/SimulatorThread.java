package Threads;

import Animals.Rabbit;
import Animals.Wolf;
import Field.Field;

public class SimulatorThread implements Runnable {

    private Field field;
    private Rabbit rabbit;
    private Wolf wolf;

    public SimulatorThread(Field field, Rabbit rabbit, Wolf wolf) {
        this.field = field;
        this.rabbit = rabbit;
        this.wolf = wolf;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Шаг " + (i + 1));
            rabbit.move(field);
            wolf.move(field);
            field.growPlant(); // рост травы
            field.printField();
            System.out.println();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
