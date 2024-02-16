package homework.day5.playground.essence.creatures.vertebratas;

import homework.day5.playground.essence.creatures.Animal;
import homework.day5.playground.essence.creatures.insects.Insect;

public abstract class Vertebrata extends Animal {

  public Vertebrata(int mass, String name) {
    super(mass, name);
  }

  public void eat(Insect food) {
    String text =
        String.format(
            "Vertebrata = {I am %s , and I am eating %s}",
            Vertebrata.class.getName(), food.getName());
    System.out.println(text);
  }
}
