package bubbles;

import java.util.Arrays;
import java.util.Random;

public class Runner {
  public static void main(String[] args) {
    Bubble bubble = new  Bubble();
    Bubble[] bubbles = bubble;
    System.out.println(Arrays.toString(bubble.bubblesArray));

    Bottle bottle = new Bottle(0.05f);

    SparklingWater sparklingWater = new SparklingWater();
    sparklingWater.pump( bubble, bottle);
  };


}
