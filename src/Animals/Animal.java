package Animals;

import Field.Field;
import Cells.Cell;
import java.util.Random;

public abstract class Animal {

    protected int x, y;
    protected Random random = new Random();

    public Animal(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract String getSymbol();
    public abstract void move(Field field);
    public abstract boolean canEat(Cell cell);


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}



