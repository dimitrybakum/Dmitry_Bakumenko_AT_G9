package homework.day5.playground.essence.craft.field;

import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.Rideable;
import homework.day5.playground.essence.craft.Transportable;

import java.io.Serializable;

public abstract class Vehicle extends Matter implements Transportable, Rideable, Serializable {
  protected String name;

  public Vehicle(int mass, String name) {
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
            getClass().getSimpleName(), getName(), pointA, pointB);
    System.out.println(text);
    return pointB - pointA;
  }

  public void drive(String direction) {
    String text =
        String.format(
            "I am %s, my name is %s and I and driving to %s",
            getClass().getSimpleName(), this.getName(), direction);
    System.out.println(text);
  }
}
