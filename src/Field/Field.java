package Field;

import Animals.Animal;
import Cells.Cell;
import Cells.Plant;
import java.util.Random;

// создаём поле, на котором будет происходить экшен!

public class Field {

    public static final int WIDTH = 5;
    public static final int HEIGHT = 3;
    private Cell[][] grid;
    private Random random = new Random();

    public Field() {

        grid = new Cell[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                grid[i][j] = new Plant();
            }
        }
    }

    public void placeAnimal (Animal animal, int x, int y) {

        grid[y][x].setAnimal(animal); // размещение животного
    }

    public void moveAnimal (Animal animal, int newX, int newY) {    // удаление животного с текущей позиции

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (grid[i][j].getAnimal() == animal) {
                    grid[i][j].setAnimal(null);
                    break;
                }
            }
        }

        Cell newCell = grid[newY][newX];
        Animal otherAnimal = newCell.getAnimal();

        if (animal.canEat(newCell)) {
            if (otherAnimal !=null) {
                System.out.println(animal.getSymbol() + " съел " + otherAnimal.getSymbol() + "!");
            } else {
                System.out.println(animal.getSymbol() + " съел растение!");
            }

            newCell.setAnimal(animal); // животное перемещается на новую клетку
        } else if (otherAnimal == null) {
            newCell.setAnimal(animal); // если клетка пустая, животное ничего не делает, просто там находится
        } else {
            // в случае, если клетка кем-то занята и съесть это нельзя - отмена перемещения
            System.out.println("Объекты не могут находится на одной клетке.");
            return;
        }
    }

    public void printField() { // выводит текущую ситуацию на поле

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (grid[i][j].getAnimal() != null) {
                    System.out.println(grid[i][j].getAnimal().getSymbol() + " ");
                } else {
                    System.out.print(grid[i][j].getSymbol() + " ");
                }
            }
            System.out.println();
        }
    }

    // метод, чтобы растения росли только на случайных пустых клетках
    public void growPlant() {
        int x = random.nextInt(WIDTH);
        int y = random.nextInt(HEIGHT);

        if (grid[y][x].getAnimal() == null) {   // чтобы могла расти только на пустых клетках
            grid[y][x] = new Plant();
            System.out.println("Растения выросли на позиции (" + x + ", " + y + ")");
        }
    }
}


