package Field;

import Animals.Animal;
import Animals.Herbivores.Herbivore;
import Animals.Predators.Predator;
import Cells.Cell;
import Cells.CellFactory;
import Cells.EmptyCell;

import java.util.Random;


// создаём поле, на котором будет происходить экшен!


public class Field {
    public static final int WIDTH = 12;
    public static final int HEIGHT = 12;
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

    private boolean canHerbivoreEat(Animal animal, Cell cell) {
        // Проверяем, является ли животное травоядным
        if (animal instanceof Herbivore) {
            // Травоядное не может съесть хищника и других травоядных
            if (cell.getAnimal() instanceof Herbivore) {
                return false; // Травоядное не может съесть другого травоядного
            }
            if (cell.getAnimal() instanceof Predator) {
                return false; // Травоядное не может съесть хищника
            }
        }
        // Если это не травоядное или содержимое клетки не является травоядным или хищником, возвращаем true
        return animal.canEat(cell);
    }



    public void moveAnimal(Animal animal, int newX, int newY) {

        int oldX = animal.getX();
        int oldY = animal.getY();

        // Удаляем животное с его старой позиции
        grid[oldY][oldX].setAnimal(null);

        // Получаем новую клетку
        Cell newCell = grid[newY][newX];
        Animal otherAnimal = newCell.getAnimal();

        // Используем новый метод проверки
        if (canHerbivoreEat(animal, newCell)) {

            if (otherAnimal != null) {
                // Если в новой клетке есть другое животное, то оно съедается
                System.out.println(animal.getSymbol() + " съел " + otherAnimal.getSymbol() + "!");
            } else {
                // Если в новой клетке только растение
                System.out.println(animal.getSymbol() + " съел растение!");
            }
            newCell.setAnimal(animal);
        } else if (otherAnimal == null) {

            // Если клетка пуста, перемещаем животное в эту клетку
            newCell.setAnimal(animal);
        } else {

            // Если клетка занята и животное не может есть содержимое клетки
            System.out.println(animal.getSymbol() + " не может двигаться на занятую клетку.");
            // Возвращаем животное на исходную позицию
            grid[oldY][oldX].setAnimal(animal);
            animal.setPosition(oldX, oldY);
            return;
        }

        // Обновляем позицию животного
        animal.setPosition(newX, newY);
    }


    public void growPlant() {
        if (random.nextInt(100) < 60) { // 60% шанс роста растений
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








