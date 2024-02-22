package homework.day5.playground.essence.craft.field.types;

import homework.day5.playground.essence.craft.field.Vehicle;

import java.io.Serial;
import java.io.Serializable;

public class Car extends Vehicle implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;
  public Car(int mass, String name) {
    super(mass, name);
  }
}
