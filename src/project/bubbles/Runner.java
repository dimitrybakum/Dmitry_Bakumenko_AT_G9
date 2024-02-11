package project.bubbles;

import java.util.Arrays;

public class Runner {
  public static void main(String[] args) {
    Bubble bubble = new Bubble();
    System.out.println(bubble.bubble_V);

    bubble.bubblesArray();
    System.out.println(Arrays.toString(bubble.bubblesArray()));

    Bottle bottle = new Bottle(0.05f);

    SparklingWater sparklingWater = new SparklingWater();
    sparklingWater.pump(bubble.bubblesArray(), bottle);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + Arrays.toString(sparklingWater.pump(bubble.bubblesArray(), bottle)));
  };


}
