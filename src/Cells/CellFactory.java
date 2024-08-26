package Cells;

public class CellFactory {
    public static Cell createCell(String type) {
        switch (type.toLowerCase()) {
            case "grass":
                return new Plant();
            case "empty":
            default:
                return new EmptyCell();
        }
    }
}


