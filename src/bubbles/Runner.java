package com.bubbles;

import java.util.Random;

public class Runner {
  public static void main(String[] args) {

    SparklingWater sparklingWater = new SparklingWater();

    Bubble[] bubblesArray = new Bubble[sparklingWater.MAX_1l_BUBBLES];

    Random random = new Random();

    for (int i = 0; i < bubblesArray.length; i++) {
      Bubble bubble = new Bubble(random.nextFloat(0.3f));
      bubblesArray[i] = bubble;
    }
    // New bottles created
    Bottle smallBottle = new Bottle(0.05f);
    Bottle midbottle = new Bottle(0.1f);
    Bottle bigBottle = new Bottle(0.2f);
    // New bottles created

    sparklingWater.pump(bubblesArray, smallBottle);
    // Water with gas
    Bubble[] bubblesInSmallBottle = sparklingWater.pump(bubblesArray, smallBottle); // газация
    Bubble[] bubblesInMidddleBottle = sparklingWater.pump(bubblesArray, midbottle); // газация
    Bubble[] bubblesInBigBottle = sparklingWater.pump(bubblesArray, bigBottle);     // газация
    // Water with gas

    // Open bottles one by one
    smallBottle.open(bubblesInSmallBottle);
    midbottle.open(bubblesInMidddleBottle);
    smallBottle.open(bubblesInBigBottle);
    // Open bottles one by one

  }
}
