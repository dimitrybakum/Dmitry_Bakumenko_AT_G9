package homework.day5.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {

  public static int generateCoordinate() {
    Random random = new Random();
    int randomInt = random.nextInt(1, 80);
    System.out.println("CoordinatesGenerator: I have generated point with value: " + randomInt);
    return randomInt;
  }
}
