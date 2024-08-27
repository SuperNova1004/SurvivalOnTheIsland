package Animals.Herbivores;

import Animals.Animal;
import Cells.Cell;
import Cells.Plant;

public abstract class Herbivore extends Animal {

    public Herbivore(int x, int y) {

        super(x, y);
    }

    @Override
    public  boolean canEat(Cell cell){
        return cell instanceof Plant;
    }
}






