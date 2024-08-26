package Animals.Predators;

import Animals.Herbivores.Mouse;
import Animals.Herbivores.Rabbit;
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
        return cell.getAnimals().stream().anyMatch(animal -> animal instanceof Rabbit || animal instanceof Mouse);
    }
}


