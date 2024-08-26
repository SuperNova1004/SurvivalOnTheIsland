package Cells;

public class CellFactory {
    public static Cell createCell(String type) {
        switch (type) {
            case "plant":
                return new Plant();
            case "empty":
            default:
                return new EmptyCell();
        }
    }
}


