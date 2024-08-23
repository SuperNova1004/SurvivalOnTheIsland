package Field;

import Animals.Animal;

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
        for (int i = 0; i < 10; i++) { // 10 шагов симуляции
            System.out.println("Шаг " + (i + 1));
            rabbit.move(field);
            wolf.move(field);
            field.growPlant(); // Рандомный рост травы
            field.printField();
            System.out.println();

            try {
                Thread.sleep(3000); // Задержка в 3 секунды
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

