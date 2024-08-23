package Cells;

// этот класс нужен, чтобы обозначать клетки на поле

public class EmptyCell extends Cell {

    @Override
    public String getSymbol() {
        return "."; // Символ пустой клетки
    }
}

