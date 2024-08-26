package Threads;

import Animals.Animal;
import Field.Field;

public class SimulatorThread implements Runnable {
    private Field field;
    private Animal rabbit;
    private Animal wolf;

    public SimulatorThread(Field field, Animal rabbit, Animal wolf) {
        this.field = field;
        this.rabbit = rabbit;
        this.wolf = wolf;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) { // 100 шагов симуляции
            System.out.println("Шаг " + (i + 1));
            rabbit.move(field);
            wolf.move(field);
            field.growPlant(); // Рандомный рост травы
            field.printField();
            System.out.println();

            try {
                Thread.sleep(4000); // Задержка в 4 секунды
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


