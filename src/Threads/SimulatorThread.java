package Threads;

import Animals.Animal;
import Field.Field;

public class SimulatorThread implements Runnable {
    private Field field;
    private Animal rabbit;
    private Animal wolf;
    private Animal boar;
    private Animal buffalo;
    private Animal caterpillar;
    private Animal deer;
    private Animal duck;
    private Animal goat;
    private Animal horse;
    private Animal mouse;
    private Animal sheep;
    private Animal bear;
    private Animal eagle;
    private Animal fox;
    private Animal snake;

    public SimulatorThread(Field field, Animal rabbit, Animal wolf, Animal boar, Animal buffalo, Animal caterpillar,
                           Animal deer, Animal duck, Animal goat, Animal horse, Animal mouse, Animal sheep, Animal bear,
                           Animal eagle, Animal fox, Animal snake) {

        this.field = field;
        this.rabbit = rabbit;
        this.wolf = wolf;
        this.boar = boar;
        this.buffalo = buffalo;
        this.caterpillar = caterpillar;
        this. deer = deer;
        this.duck = duck;
        this.goat = goat;
        this.horse = horse;
        this.mouse = mouse;
        this.sheep = sheep;
        this.bear = bear;
        this.eagle = eagle;
        this.fox = fox;
        this.snake = snake;
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
                Thread.sleep(40); // Задержка в 4 секунды
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


