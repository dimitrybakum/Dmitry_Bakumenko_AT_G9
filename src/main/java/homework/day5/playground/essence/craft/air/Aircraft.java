package homework.day5.playground.essence.craft.air;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.Matter;
import homework.day5.playground.essence.craft.Rideable;
import homework.day5.playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Transportable, Flyable, Rideable {

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
}
