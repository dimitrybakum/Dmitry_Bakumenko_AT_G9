package homework.day5.playground.processors;

import homework.day5.playground.essence.craft.Rideable;

import static homework.day5.playground.utils.DirectionGenerator.generateDirection;

public class RideableProcessor {
  public void runRideable(Rideable rideable) {
    // runRideable(Rideable rideable) - принимает объект ездящего и вызывает у него метод drive,
    // которому передает случайное направления, которое генерируется вызовом метода
    // generateDirection() из утилиты DirectionGenerator
      rideable.drive(generateDirection());
  }

  public void runRideable(Rideable rideable, String direction) {
    // - принимает объект ездящего и строку направления, и вызывает у первого метод drive, которому
    // передает строку направления, переданную в качестве аргумента
      rideable.drive(direction);
  }
}
