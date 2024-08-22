package Animals;

import Cells.Plant;
import Cells.Cell;

public abstract class Herbivore extends Animal {

    public Herbivore(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canEat(Cell cell) {
        return cell instanceof Plant; // как раз тут разница между травоядными и плотоядными, проверяем, в клетке ли что-то
    }
}
