package bubbles;

public class SparklingWater extends Water {
  final int MAX_1l_BUBBLES = 10000;

  public void pump(Bubble[] bubbles, Bottle bottle) {
    float bottleCapacity = bottle.bottle_v * MAX_1l_BUBBLES;

  }

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
