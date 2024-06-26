package project.bubbles.water;

import project.bubbles.boxing.gas.Bubble;

public class SparklingWater extends Water {
  private boolean isOpened = false;
  private Bubble[] bubbles;

  public SparklingWater(int temperature, String color, String transparency, String smell) {
    super(temperature, transparency, color, smell);
    new Thread(() -> this.isOpened()).start();
  }

  public void pump(Bubble[] bubbles) {
    System.out.println("water carbonation in progress...");
    this.bubbles = bubbles;
    for (int i = 0; i < bubbles.length; i++) {
      bubbles[i] = new Bubble("CO2");
      this.bubbles = bubbles;
    }
  }

  public void setOpened() {
    System.out.printf("bottle is opened").println();
    isOpened = true;
    // degas();
  }

  private void degas() {
    System.out.println("degas in progress...");
    int partOfBubbles = 10 + 5 * getTemperature();
    for (int i = 0; i <= bubbles.length - 1; i++) {
      if (i % partOfBubbles == 0) {
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("part of bubbles are burst");
      }
      bubbles[i].cramp();
      bubbles[i] = null;
    }
    System.out.println(
        "all bubbles are burst, " + bubbles.length + " in total with step " + partOfBubbles);
  }

  private void isOpened() {
    while (!isOpened) {
      System.out.printf("Bottle still not opened, lets wait for 2 sec").println();
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    System.out.println("Water is opened");
    degas();
  }
}
