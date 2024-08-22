package Cells;
import Animals.Animal;


public abstract class Cell {

    protected Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public abstract char getSymbol();

}
