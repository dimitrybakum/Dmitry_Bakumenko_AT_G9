package homework.day5.playground.essence.craft.air;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Transportable, Flyable {

  protected String name;

  public Aircraft(int mass, String name) {
    super(mass);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int move(int pointA, int pointB) {
    String text =
        String.format(
            "{I am %s, my name is %s and I am moving from point %d to point %d}",
            getClass().getSimpleName(), this.getName(), pointA, pointB);
    System.out.println(text);
    return pointB - pointA;
  }

  public void fly(String direction) {
    String text =
        String.format(
            "{I am %s, my name is %s and I and flying to %s}",
            getClass().getSimpleName(), getName(), direction);
    System.out.println(text);
  }
}
