package Animals;

import Animals.Herbivores.*;
import Animals.Predators.*;

public class AnimalFactory {

    public static Animal createAnimal(String type, int x, int y) {
        switch (type) {
            case "wolf":
                return new Wolf(x, y);
            case "rabbit":
                return new Rabbit(x, y);
            case "boar":
                return new Boar(x, y);
            case "buffalo":
                return new Buffalo(x, y);
            case "caterpillar":
                return new Caterpillar(x, y);
            case "deer":
                return new Deer(x, y);
            case "duck":
                return new Duck(x, y);
            case "goat":
                return new Goat(x, y);
            case "horse":
                return new Horse(x, y);
            case "mouse":
                return new Mouse(x, y);
            case "sheep":
                return new Sheep(x, y);
            case "bear":
                return new Bear(x, y);
            case "eagle":
                return new Eagle(x, y);
            case "fox":
                return new Fox(x, y);
            case "snake":
                return new Snake(x, y);
            default:
                throw new IllegalArgumentException("Неизвестное животное : " + type);
        }
    }
}
