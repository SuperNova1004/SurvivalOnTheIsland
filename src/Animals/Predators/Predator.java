package Animals.Predators;

import Animals.Animal;
import Cells.Cell;
import Field.Field;
import utils.Config;

public abstract class Predator extends Animal {
    private int hunger;

    public Predator(int x, int y) {
        super(x, y);
        this.hunger = Config.getConfigValue(getClass().getSimpleName().toLowerCase() + ".maxHunger", 5);
    }

    @Override
    public void move(Field field) {
        // Логика перемещения
        hunger--;
        if (hunger <= 0) {
            field.removeAnimal(this);
        }
    }

    @Override
    public boolean canEat(Cell cell) {
        Animal prey = cell.getFirstAnimal();
        if (prey != null) {
            double probability = Config.getConfigValue(getClass().getSimpleName().toLowerCase() + ".eatProbability", 0.8);
            if (ThreadLocalRandom.current().nextDouble() < probability) {
                hunger = Config.getConfigValue(getClass().getSimpleName().toLowerCase() + ".maxHunger", 5);
                return true;
            }
        }
        return false;
    }
}


