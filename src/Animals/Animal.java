package Animals;

import Field.Field;
import Cells.Cell;

// cоздаём общий абстрактный класс, от которого будут наследоваться травоядные и хищники

public abstract class Animal {
    public int x;
    public int y;

    public Animal (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract String getSymbol ();

    public abstract boolean canEat (Cell cell);

    public void move (Field field){

        int newX = x + (int) (Math.random() * 3) - 1;
        int newY = y + (int) (Math.random() * 3) - 1;

        if (newX >= 0 && newX < Field.WIDTH && newY >= 0 && newY < Field.HEIGHT) {
            field.moveAnimal(this, newX, newY);
        }
    }
}

