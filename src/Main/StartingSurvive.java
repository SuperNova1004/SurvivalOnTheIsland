package Main;

import Animals.Rabbit;
import Animals.Rabbit;
import Animals.Wolf;
import Field.Field;



    public class StartingSurvive {
        public static void main(String[] args) {


            Field field = new Field();
            Rabbit rabbit = new Rabbit();
            Wolf wolf = new Wolf();

            field.placeAnimal(rabbit, rabbit.x, rabbit.y);
            field.placeAnimal(wolff, wolf.x, wolf.y);

            for (int i = 0; i < 10; i++) {
                System.out.println("Шаг " + (i + 1));
                rabbit.move(field);
                wolf.move(field);
                field.growPlant(); // рост травы
                field.printField();
                System.out.println();
            }
        }
    }





