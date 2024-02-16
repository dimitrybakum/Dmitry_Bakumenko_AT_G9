package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Matter;

public abstract class Animal extends Matter {
  protected String name;

  public Animal(int mass, String name) {
    super(mass);
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void eat(Plant food) {
    String text =
        String.format("Animal = {I am %s , and I am eating %s}", getName(), food.getName());
    System.out.println(text);
  }
}
