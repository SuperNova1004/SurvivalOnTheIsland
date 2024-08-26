package Field;
import Cells.Cell;

// добавляем речку согласно опциональной части задания

public class River extends Cell {
    @Override
    public String getSymbol() {
        return "🌊";
    }
}

