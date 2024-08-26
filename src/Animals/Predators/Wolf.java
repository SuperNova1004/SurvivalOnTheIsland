package Animals.Predators;

import Animals.Herbivores.Rabbit;
import Field.Field;
import Cells.Cell;

public class Wolf extends Predator {
    public Wolf(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSymbol() {
        return "🐺"; // Символ волка
    }

    @Override
    public void move(Field field) {
        int newX = x + random.nextInt(3) - 1;
        int newY = y + random.nextInt(3) - 1;

        if (newX >= 0 && newX < Field.WIDTH && newY >= 0 && newY < Field.HEIGHT) {
            field.moveAnimal(this, newX, newY);
        }
    }

    @Override
    public boolean canEat(Cell cell) {
        return cell.getAnimal() instanceof Rabbit;
    }

    @Override
    public boolean Reproduce() {
        return false;
    }
}



