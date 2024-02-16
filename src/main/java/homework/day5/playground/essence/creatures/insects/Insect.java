package homework.day5.playground.essence.creatures.insects;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.creatures.Animal;

public abstract class Insect extends Animal implements Flyable {

    public Insect(int mass, String name) {
        super(mass, name);
    }
}
