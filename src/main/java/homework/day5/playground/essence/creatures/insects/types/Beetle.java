package homework.day5.playground.essence.creatures.insects.types;

import homework.day5.playground.essence.creatures.insects.Insect;
import homework.day5.playground.essence.creatures.vegetable.type.Carrot;

public class Beetle extends Insect {

  public Beetle(int mass, String name) {
    super(mass, name);
  }

  public void nest(Carrot home) {
    //TODO Format string syntax
    if (mass < home.getMass()) {
      System.out.println("I am N and I will nest there with D my family members!");
    } else {
      System.out.println("This carrot is too small for nesting :(");
    }
  }
}
// -- у жука есть не абстрактный публичный метод void nest(Carrot home) - принимает объект морковки,
// сравнивает свою массу с массой последней и если его масса меньше,
// то печатает в консоль фразу "I am N and I will nest there with D my family members!",
// где N - имя соответствующего объекта класса жука, D -  целая чаcть от деления массы моркови на
// массу жука,
// в противном случае печатает в консоль фразу "This carrot is too small for nesting :(
// ", использовать, Format string syntax
