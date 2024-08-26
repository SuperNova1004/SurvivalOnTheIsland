package Animals.Predators;

import Animals.Animal;
import Animals.Herbivores.Rabbit;
import Cells.Cell;
import Field.Field;

public abstract class Predator extends Animal {

    public Predator(int x, int y) {
        super(x, y);
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
}






