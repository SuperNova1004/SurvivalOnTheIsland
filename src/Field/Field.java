package Field;

import Animals.Animal;
import Animals.Herbivores.Herbivore;
import Animals.Predators.Predator;
import Cells.Cell;
import Cells.CellFactory;
import Cells.EmptyCell;
import java.util.List;

// Добавляем поле, на котором будет твориться экшен! Фактически, самый жирный и основной класс из всего проекта

public class Field {
    public static final int WIDTH = 10;
    public static final int HEIGHT = 10;

    private Cell[][] grid;

    public Field() {
        grid = new Cell[WIDTH][HEIGHT];
        initialize();
    }

    private void initialize() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                grid[x][y] = CellFactory.createCell("empty");
            }
        }
    }

    public void addAnimal(Animal animal) {
        grid[animal.getX()][animal.getY()].addAnimal(animal);
    }

    public void removeAnimal(Animal animal) {
        Cell cell = grid[animal.getX()][animal.getY()];
        if (cell != null) {
            cell.removeAnimal(animal);
        }
    }

    public void moveAnimal(Animal animal, int newX, int newY) {
        Cell currentCell = grid[animal.getX()][animal.getY()];
        Cell newCell = grid[newX][newY];

        currentCell.removeAnimal(animal);
        animal.setPosition(newX, newY);

        if (animal.canEat(newCell)) {
            newCell.removeAnimal(newCell.getFirstAnimal());
        }

        newCell.addAnimal(animal);
    }

    public boolean checkEndGame() {
        int herbivoresCount = 0;
        int predatorsCount = 0;

        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                for (Animal animal : grid[x][y].getAnimals()) {
                    if (animal instanceof Herbivore) {
                        herbivoresCount++;
                    } else if (animal instanceof Predator) {
                        predatorsCount++;
                    }
                }
            }
        }

        if (herbivoresCount < 5) {
            System.out.println("Хищники победили! Выживает сильнейший!");
            return true;
        } else if (predatorsCount < 5) {
            System.out.println("Травоядные победили! Больше тут никого не съедят (только растения)!");
            return true;
        }

        return false;
    }

    public void growPlant() {
        int x = (int) (Math.random() * WIDTH);
        int y = (int) (Math.random() * HEIGHT);

        if (grid[x][y] instanceof EmptyCell) {
            grid[x][y] = CellFactory.createCell("grass");
        }
    }

    public void reproduceAnimals() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                List<Animal> animals = grid[x][y].getAnimals();
                if (animals.size() > 1) {
                    Class<? extends Animal> species = animals.get(0).getClass();
                    boolean canReproduce = animals.stream().allMatch(animal -> animal.getClass() == species);

                    if (canReproduce) {
                        try {
                            Animal newAnimal = species.getDeclaredConstructor(int.class, int.class).newInstance(x, y);
                            grid[x][y].addAnimal(newAnimal);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public void createRiver() {
        int riverLength = 120 + (int) (Math.random() * 20);
        for (int i = 0; i < riverLength; i++) {
            int x = (int) (Math.random() * WIDTH);
            int y = (int) (Math.random() * HEIGHT);
            grid[x][y] = new River();
        }
    }

    public void printField() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                System.out.print(grid[x][y].getSymbol() + " ");
            }
            System.out.println();
        }
    }
}






