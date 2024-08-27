package Animals.Predators;

import Animals.Animal;
import Animals.Herbivores.Herbivore;
import Cells.Cell;

public abstract class Predator extends Animal {

    public Predator(int x, int y) {

        super(x, y);
    }

    @Override
    public boolean canEat(Cell cell) {
        Animal animal = cell.getAnimal();
        return animal instanceof Herbivore; // именно над этой строчкой я бился почти 8 часов
    }
}






