package Animals.Predators;

import Animals.Herbivores.Herbivore;
import Animals.Herbivores.Rabbit;
import Field.Field;
import Cells.Cell;

public class Fox extends Predator {
    public Fox(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSymbol() {
        return "🦊";
    }

    @Override
    public boolean canEat(Cell cell) {
        return cell.getAnimal() instanceof Herbivore;
    }
}

