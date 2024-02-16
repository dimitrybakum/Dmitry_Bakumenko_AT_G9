package homework.day5.playground.essence.craft.field;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.Rideable;
import homework.day5.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Flyable, Rideable {
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
}
