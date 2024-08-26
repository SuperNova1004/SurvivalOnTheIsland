package Animals.Herbivores;

public class Horse extends Herbivore {
    public Horse(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSymbol() {
        return "🐴";
    }
}

