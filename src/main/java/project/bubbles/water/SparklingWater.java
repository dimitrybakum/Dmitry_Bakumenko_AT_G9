package project.bubbles.water;

import project.bubbles.gas.Bubble;

public class SparklingWater extends Water {
  final int MAX_1l_BUBBLES = 10000;
  public Bubble[] bubbles;

  public void setBubbles(float bottle_v) {
    this.bubbles = new Bubble[(int) (bottle_v * MAX_1l_BUBBLES)];
    this.bubbles = pump(bubbles);
  }

  public Bubble[] pump(Bubble[] bubbles) {
    for (int i = 0; i < bubbles.length; i++) {
      bubbles[i] = new Bubble("Co2");
    }
    return bubbles;
  }

  public void degas() {
    for (int i = 0; i < bubbles.length; i++) {
      this.bubbles[i].crampBubble();
      this.bubbles[i] = null;
    }
  }
}
