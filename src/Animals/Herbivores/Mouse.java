package Animals.Herbivores;


import Field.Field;

public class Mouse extends Herbivore {

    public Mouse(int x, int y) {
        super(x, y);
    }


    @Override
    public String getSymbol() {
        return "\uD83D\uDC01";
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