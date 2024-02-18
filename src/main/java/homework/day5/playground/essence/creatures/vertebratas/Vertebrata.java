package homework.day5.playground.essence.creatures.vertebratas;

import homework.day5.playground.essence.creatures.Animal;
import homework.day5.playground.essence.creatures.Crawlable;
import homework.day5.playground.essence.creatures.insects.Insect;

public abstract class Vertebrata extends Animal implements Crawlable {

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

  public void crawl(String direction, int distance) {
    String crocodile =
        String.format(
            "{I am %s, my name is %s and I am crawling to %s for %d units}",
            this.getClass().getSimpleName(), name, direction, distance);
    System.out.println(crocodile);
    System.out.println("wr-wr-wrr-r..");
    System.out.println();
  }
}
