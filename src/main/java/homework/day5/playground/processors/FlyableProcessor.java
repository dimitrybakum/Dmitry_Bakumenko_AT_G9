package homework.day5.playground.processors;

import homework.day5.playground.essence.Flyable;

import static homework.day5.playground.utils.DirectionGenerator.generateDirection;

public class FlyableProcessor {

    public void runFlyable(Flyable flyable) {
        flyable.fly(generateDirection());
    }

    public void runFlyable(Flyable flyable, String direction) {
        flyable.fly(direction);
    }
}
