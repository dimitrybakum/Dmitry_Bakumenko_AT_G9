package homework.day5.playground.essence.craft.hand.types;

import homework.day5.playground.essence.craft.hand.Container;
import homework.day5.playground.essence.material.Pourable;

public class Bottle extends Container {

  public Bottle(int mass, String name) {
    super(mass, name);
  }

  public void store(Pourable pourable, int amount) {
    System.out
        .printf(
            "I am %s, my name is %s and I received %d of %s",
            this.getClass().getSimpleName(), name, amount, pourable.getClass().getSimpleName())
        .println();

    if (amount > this.mass) {
      System.out.println("wooh-wooh-wooh-hh..");
    }
    System.out.println();
  }
}
