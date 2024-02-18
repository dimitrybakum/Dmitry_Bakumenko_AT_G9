package homework.day5.playground.essence.craft.hand.types;

import homework.day5.playground.essence.craft.hand.Container;
import homework.day5.playground.essence.material.Pourable;

public class Can extends Container {

  public Can(int mass, String name) {
    super(mass, name);
  }

  public void store(Pourable pourable, int amount) {
    System.out
        .printf(
            "I am %s, my name is %s and I received %d of %s",
            this.getClass().getSimpleName(), name, amount, pourable.getClass().getSimpleName())
        .println();

    if (amount > this.mass) {
      System.out.println("waah-waah-waah-hh..");
    }
    System.out.println();
  }
}
