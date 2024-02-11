package project.bubbles;

public class SparklingWater extends Water {
  final int MAX_1l_BUBBLES = 10000;
  float water;

  public Bubble[] pump(Bubble[] bubbles, Bottle bottle) {
    Bubble[] packedBottle;

    float getBublesForBottle = (float) MAX_1l_BUBBLES * bottle.getBottle_v();  // get bubbles qty for abstract bottle N
    Bubble[] packedBottle = new Bubble[(int) getBublesForBottle];              // get array.length of bubbles for abstract bottle N
    for (int i = 0; i < packedBottle.length; i++) {                            // fill out array with particular qty of bubble objects
      packedBottle[i] = bubbles[i];
    }

    System.out.println("adsfdfsfsdf   " + packedBottle.length);
    return packedBottle;
  }

  //public Bubble[] getBubbles() {
  //  return bubbles;
  //}

  public void crampBubble() {
    System.out.println("Cramp!!!");
  }

  public void degas(Bubble[] qtyOfBubblesInTheBottle) {
    for (int i = 0; i < qtyOfBubblesInTheBottle.length; i++) {
      System.out.println(qtyOfBubblesInTheBottle[i].gaz);
      qtyOfBubblesInTheBottle[i] = null;
      crampBubble();
    }
    System.out.println("Cramped bubbles counter  " + qtyOfBubblesInTheBottle.length);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
  }
}
