package project.bubbles.gas;

import java.util.Random;

public class Bubble {
  Random random = new Random();
  final float MAX_BUBBLE_V = 0.3f;

  float bubble_V = random.nextFloat(MAX_BUBBLE_V);
  String gaz;

  public Bubble(String gaz) {
    this.gaz = gaz;
  }

  public void crampBubble() {
    System.out.println("Cramp!!!");
  }

  public float getBubble_V() {
    return bubble_V;
  }

  public String getGaz() {
    return gaz;
  }

  public void setBubble_V(float bubble_V) {
    this.bubble_V = bubble_V;
  }

  public void setGaz(String gaz) {
    this.gaz = gaz;
  }
}
