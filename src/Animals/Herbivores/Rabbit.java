package Animals.Herbivores;


import Cells.Cell;
import Field.Field;

public class Rabbit extends Herbivore {

    public Rabbit(int x, int y) {
        super(x, y);
    }


    @Override
    public String getSymbol() {
        return "🐇"; // Символ зайца
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








