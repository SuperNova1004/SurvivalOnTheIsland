package Field;

import Animals.Animal;
import Cells.Cell;
import Cells.CellFactory;
import Cells.EmptyCell;

import java.util.Random;

public class Field {
    public static final int WIDTH = 5;
    public static final int HEIGHT = 5;
    private Cell[][] grid;
    private Random random = new Random();

    public Field() {
        grid = new Cell[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                grid[i][j] = CellFactory.createCell("empty");
            }
        }
    }

    public void placeAnimal(Animal animal, int x, int y) {
        if (grid[y][x].getAnimal() != null) {
            System.out.println("Клетка (" + x + ", " + y + ") уже занята.");
        }
        grid[y][x].setAnimal(animal);
        animal.setPosition(x, y);
    }

    public void moveAnimal(Animal animal, int newX, int newY) {
        int oldX = animal.getX();
        int oldY = animal.getY();

        grid[oldY][oldX].setAnimal(null);

        Cell newCell = grid[newY][newX];
        Animal otherAnimal = newCell.getAnimal();

        if (animal.canEat(newCell)) {
            if (otherAnimal != null) {
                System.out.println(animal.getSymbol() + " съел " + otherAnimal.getSymbol() + "!");
            } else {
                System.out.println(animal.getSymbol() + " съел растение!");
            }
            newCell.setAnimal(animal);
        } else if (otherAnimal == null) {
            newCell.setAnimal(animal);
        } else {
            System.out.println(animal.getSymbol() + " не может двигаться на занятую клетку.");
            return;
        }

        animal.setPosition(newX, newY);
    }

    public void growGrass() {
        if (random.nextInt(100) < 30) {
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);

            if (grid[y][x] instanceof EmptyCell) {
                grid[y][x] = CellFactory.createCell("plant");
                System.out.println("Растения выросли на позиции (" + x + ", " + y + ")");
            }
        }
    }

    public void printField() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                String symbol = grid[i][j].getSymbol();
                Animal animal = grid[i][j].getAnimal();
                if (animal != null) {
                    symbol = animal.getSymbol();
                }
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}








