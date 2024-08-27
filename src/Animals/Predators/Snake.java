package Animals.Predators;

import Field.Field;

public class Snake extends Predator {

    public Snake(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSymbol() {
        return "\uD83D\uDC0D";
    }

    @Override
    public void move(Field field) {
        int newX = x + random.nextInt(3) - 1;
        int newY = y + random.nextInt(3) - 1;

        if (newX >= 0 && newX < Field.WIDTH && newY >= 0 && newY < Field.HEIGHT) {
            field.moveAnimal(this, newX, newY);
        }
    }
}