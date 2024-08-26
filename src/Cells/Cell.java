package Cells;

import Animals.Animal;
import java.util.ArrayList;
import java.util.List;

// создаём клетки на поле

public class Cell {
    private List<Animal> animals;

    public Cell() {
        this.animals = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public boolean hasAnimal() {
        return !animals.isEmpty();
    }

    public Animal getFirstAnimal() {
        return animals.isEmpty() ? null : animals.get(0);
    }

    public String getSymbol() {
        if (!animals.isEmpty()) {
            return animals.get(0).getSymbol();
        }
        return " ";
    }
}

