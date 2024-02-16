package homework.day5.playground.essence.creatures.vertebratas;

import homework.day5.playground.essence.creatures.Animal;
import homework.day5.playground.essence.creatures.Plant;
import homework.day5.playground.essence.creatures.insects.Insect;

public abstract class Vertebrata extends Animal {

  public Vertebrata(int mass, String name) {
    super(mass, name);
  }

  public void eat(Insect food) {
    String text =
        String.format(
            "Vertebrata = {I am %s , and I am eating %s}",
            Vertebrata.class.getName(), food.getName());
    // Format string syntax
    System.out.println(text);
  }

  // -- все позвоночные имеют не абстрактный публичный метод void eat(Insect food) - принимает
  // объект насекомого и печатает в консоль
  // фразу "I am N and I am eating D", где N - имя соответствующего объекта класса позвоночного,
  //  D - имя объекта насекомого из передаваемого аргумента, использовать Format string syntax
}
