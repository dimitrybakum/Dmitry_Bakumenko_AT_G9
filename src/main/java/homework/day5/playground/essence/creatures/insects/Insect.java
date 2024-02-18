package homework.day5.playground.essence.creatures.insects;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.creatures.Animal;
import homework.day5.playground.essence.creatures.Crawlable;

public abstract class Insect extends Animal implements Flyable, Crawlable {

  public Insect(int mass, String name) {
    super(mass, name);
  }

  public void fly(String direction) {
    String text =
        String.format(
            "{I am %s, my name is %s and I and flying to %s}",
            getClass().getSimpleName(), this.getName(), direction);
    System.out.println(text);
  }

  public void crawl(String direction, int distance) {

    String beetle =
        String.format(
            "{I am %s, my name is %s and I am crawling to %s for %d units}",
            this.getClass().getSimpleName(), name, direction, distance);
    System.out.println(beetle);
    System.out.println("vz-vz-vzz-zz..");
    System.out.println();
  }
}
