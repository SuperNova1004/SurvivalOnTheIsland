package Animals;



public class Rabbit extends Herbivore {


    public Rabbit(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSymbol() {
        return "\uD83D\uDC07";
    }
}
