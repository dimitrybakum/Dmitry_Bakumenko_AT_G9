package homework.day5.playground.essence;

import static java.lang.Character.getName;

public interface Flyable {
  // летающие (Flyable): воздушные транспортные стредства, комар, муха
  default void fly(String direction) {
    String text =
        String.format(
            "{I am %s, my name is %s and I amd flying to %s}",
                getClass().getSimpleName(), this.getName(), direction);
    System.out.println(text);
  }

  // и печатает в консоль фразу "I am N, my name is M and I amd flying to D",
  // где N - название
  // класса соответствующего объекта,
  // М - значение name объекта,
  // D - строка, подставляемая из
  // значения передаваемого аргумента
  Object getName();
}
// TO DO наверное тоже использовать Format string syntax
// -- интерфейс летающие имеют невозвратный метод fly(String direction); - принимает строку
// направления движения
// и печатает в консоль фразу "I am N, my name is M and I amd flying to D",
// где N - название класса соответствующего объекта,
//     М - значение name объекта,
//     D - строка, подставляемая из значения передаваемого аргумента
