package Animals;

import Field.Field;
import Cells.Cell;

public class Wolf extends Predator {

    public Wolf(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSymbol() {

        return "🐺"; // Символ волка
    }



    @Override
    public boolean canEat(Cell cell) {

        return cell.getAnimal() instanceof Rabbit;
    }
}

