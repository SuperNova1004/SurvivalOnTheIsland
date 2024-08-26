package Cells;

import Animals.Animal;

public abstract class Cell {
    private Animal animal;

    public Cell() {
        this.animal = null;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return this.animal;
    }

    public abstract String getSymbol();
}



