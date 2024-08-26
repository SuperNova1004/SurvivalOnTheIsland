package Animals.Predators;


public class Wolf extends Predator {

    public Wolf(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSymbol() {

        return "🐺"; // Символ волка
    }
}

