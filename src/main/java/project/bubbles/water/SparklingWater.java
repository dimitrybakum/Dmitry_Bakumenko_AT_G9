package project.bubbles.water;

import project.bubbles.gas.Bubble;

public class SparklingWater extends Water {
  private boolean isOpened;
  private Bubble[] bubbles;

  public SparklingWater(int temperature, String color, String transparency, String smell) {
    super(temperature, transparency, color, smell);
    isOpened();
  }

  public void pump(Bubble[] bubbles) {
    System.out.println("water carbonation in progress...");
    this.bubbles = bubbles;
  }

  public void setOpened() {
    System.out.printf("bottle is opened").println();
    isOpened = true;
    this.degas();
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
      this.bubbles[i].cramp();
      this.bubbles[i] = null;
    }
    System.out.println(
        "all bubbles are burst, " + bubbles.length + " in total with step " + partOfBubbles);
  }

  private void isOpened() {
    // ------ есть приватный метод void isOpened(), который пока ничего не делает
  }
}
