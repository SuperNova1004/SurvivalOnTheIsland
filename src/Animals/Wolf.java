package Animals;



public class Wolf extends Predator {


    public Wolf(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSymbol() {
        return "\uD83D\uDC3A";
    }
}
