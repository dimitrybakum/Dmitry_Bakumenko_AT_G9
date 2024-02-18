package homework.day5.playground.utils;

import java.util.Random;

public class DistanceGenerator {

  public static int generateDistance() {
    Random random = new Random();
    int myInt = random.nextInt(1, 99);
    System.out.println("DistanceGenerator: I have generated distance with value: " + myInt);
    return myInt;
  }
}
