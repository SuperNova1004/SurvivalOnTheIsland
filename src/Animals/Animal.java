package Animals;

import Cells.Cell;
import Field.Field;

public abstract class Animal {
    protected int x;
    protected int y;

    public Animal(int x, int y) {
        this.x = x;
        this.y = y;
    }

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

    public abstract String getSymbol();

    public abstract void move(Field field);

    public abstract boolean canEat(Cell cell);
}




