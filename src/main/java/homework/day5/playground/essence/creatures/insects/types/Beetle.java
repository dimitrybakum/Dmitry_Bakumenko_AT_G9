package homework.day5.playground.essence.creatures.insects.types;

import homework.day5.playground.essence.creatures.insects.Insect;
import homework.day5.playground.essence.creatures.vegetable.type.Carrot;

public class Beetle extends Insect {

  public Beetle(int mass, String name) {
    super(mass, name);
  }

  public void nest(Carrot home) {
    // Format string syntax
    if (mass < home.getMass()) {
      String text =
          String.format(
              "{I am %s and I will nest there with %d my family members!}",
              Beetle.class.getName(), home.getMass() / this.mass);
      System.out.println(text);
    } else {
      System.out.println("This carrot is too small for nesting :(");
    }
  }
}