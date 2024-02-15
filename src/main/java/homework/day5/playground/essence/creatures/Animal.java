package homework.day5.playground.essence.creatures;

import homework.day5.playground.essence.Matter;

public abstract class Animal extends Matter {
  protected String name;

  public Animal(int mass, String name) {
    super(mass);
    this.name = name;
  }
  //  this.name = name;
  //}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void eat(Plant food) {
    //TODO использовать Format string syntax
    System.out.println("I am N and I am eating D");
  }
}
// -- все животные имеют не абстрактный публичный метод void eat(Plant food) - принимает объект
// растения
// и печатает в консоль
// фразу "I am N and I am eating D", где N - имя соответствующего объекта класса животного,
//  D - имя объекта растения из передаваемого аргумента, использовать Format string syntax
