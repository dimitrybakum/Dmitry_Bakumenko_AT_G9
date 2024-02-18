package homework.day5.playground.essence.material.types;

import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.material.Pourable;
import homework.day5.playground.essence.material.Powerable;

public class Petrol extends Matter implements Pourable, Powerable {

  public Petrol(int mass) {
    super(mass);
  }

  public void spread(String storeName) {
    System.out.printf(
        "I am %s and I am spreading in %s", this.getClass().getSimpleName(), storeName);
    System.out.println("wheeh..");
    System.out.println();
  }
}
