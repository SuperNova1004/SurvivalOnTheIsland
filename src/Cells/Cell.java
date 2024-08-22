package Cells;
import Animals.Animal;

// создаём клетки на поле

public abstract class Cell {

    protected Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public abstract String getSymbol();

}
