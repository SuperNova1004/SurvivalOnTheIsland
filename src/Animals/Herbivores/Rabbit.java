package Animals.Herbivores;


public class Rabbit extends Herbivore {
    public Rabbit(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSymbol() {
        return "🐇"; // Символ зайца
    }

    @Override
    public boolean Reproduce() {
        return false;
    }
}







