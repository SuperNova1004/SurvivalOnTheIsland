package Animals;

import Field.Field;
import Cells.Cell;
import Cells.Plant;

public class Rabbit extends Herbivore {
    public Rabbit(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSymbol() {
        return "🐇"; // Символ зайца
    }


}




