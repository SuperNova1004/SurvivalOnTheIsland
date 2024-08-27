package Cells;

public class CellFactory {

    // площадка для заполнения растениями пустых клеток. Если растение уже есть, то просто обновляется
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


