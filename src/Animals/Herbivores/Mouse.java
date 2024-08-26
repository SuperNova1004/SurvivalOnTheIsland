package Animals.Herbivores;

public class Mouse extends Herbivore {
    public Mouse(int x, int y) {
        super(x, y);
    }

    @Override
    public String getSymbol() {
        return "\uD83D\uDC01"; // Символ мышки
    }
}
