package homework.day5.playground.essence.craft.hand.types;

import homework.day5.playground.essence.craft.hand.Container;
import homework.day5.playground.essence.material.Pourable;

public class Mug extends Container {

  public Mug(int mass, String name) {
    super(mass, name);
  }

  @Override
  public void store(Pourable pourable, int amount) {}
}
