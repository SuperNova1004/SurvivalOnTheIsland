package Animals;

import Cells.Cell;

public abstract class Predator extends Animal {

    public Predator(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canEat(Cell cell) {
        return cell.getAnimal() instanceof Herbivore;
    }
}
