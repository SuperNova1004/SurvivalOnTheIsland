package Animals;

import Animals.Herbivores.Rabbit;
import Animals.Predators.Wolf;

public class AnimalFactory {

    public static Animal createAnimal(String type, int x, int y) {
        switch (type) {
            case "wolf":
                return new Wolf(x, y);
            case "rabbit":
                return new Rabbit(x, y);
            default:
                throw new IllegalArgumentException("Неизвестное животное : " + type);
        }
    }
}
