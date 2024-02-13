package homework.day2.cycletask;

import java.util.Arrays;
import java.util.Random;

public class CycleTaskRunner {
  static Random random = new Random();
  static int[] myTestArray;

  public static void showArray() {
    int[] array = new int[10];
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(1, 12);
    }
    myTestArray = array;
    System.out.println(Arrays.toString(array));
  }

  public static void main(String[] args) {

    Countdown countdown = new Countdown();
    countdown.getCountdownArray();

    ScquareArray scquareArray = new ScquareArray();
    scquareArray.getSquareArray();

    CountWithSpace countWithSpace = new CountWithSpace();
    countWithSpace.getCountWitSpace();

    MinFromArray minFromArray = new MinFromArray();
    minFromArray.getMinFromArray();

    OddCounter oddCounter = new OddCounter();
    oddCounter.getOddCounter();

    MixedArray mixedArray = new MixedArray();
    mixedArray.getMixedArray();

    MultipliedArray multipliedArray = new MultipliedArray();
    multipliedArray.getMultipliedArray();

    RevertedArray revertedArray = new RevertedArray();
    revertedArray.showRevertedArray();
  }
}
