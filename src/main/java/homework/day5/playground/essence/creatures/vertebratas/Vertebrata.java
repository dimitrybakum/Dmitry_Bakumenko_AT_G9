package homework.day5.playground.essence.creatures.vertebratas;

import homework.day5.playground.essence.creatures.Animal;
import homework.day5.playground.essence.creatures.Plant;
import homework.day5.playground.essence.creatures.insects.Insect;

public abstract class Vertebrata extends Animal {

    public Vertebrata(int mass, String name) {
        super(mass, name);
    }

    public void eat(Insect food) {
        //TODO использовать Format string syntax
        System.out.println("I am N and I am eating D");
    }

// -- все позвоночные имеют не абстрактный публичный метод void eat(Insect food) - принимает объект насекомого и печатает в консоль
// фразу "I am N and I am eating D", где N - имя соответствующего объекта класса позвоночного,
//  D - имя объекта насекомого из передаваемого аргумента, использовать Format string syntax
}
