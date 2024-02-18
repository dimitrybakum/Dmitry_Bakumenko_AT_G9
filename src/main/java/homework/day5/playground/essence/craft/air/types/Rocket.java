package homework.day5.playground.essence.craft.air.types;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.craft.air.Aircraft;

public class Rocket extends Aircraft implements Flyable {

  public Rocket(int mass, String name) {
    super(mass, name);
  }
}
