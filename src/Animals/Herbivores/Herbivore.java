package Animals.Herbivores;

import Animals.Animal;
import Cells.Cell;
import Field.Field;

public abstract class Herbivore extends Animal {
    public Herbivore(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(Field field) {
        // Логика перемещения травоядного
    }

    @Override
    public boolean canEat(Cell cell) {
        return cell.getAnimals().isEmpty(); // Может есть растения
    }
}


