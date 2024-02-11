package project.bubbles;

import java.util.Random;

import static java.lang.Float.valueOf;

public class Bubble {
  public static void main(String[] args){

  }
  Random random = new Random();
  final float MAX_BUBBLE_V = 0.3f;

  float bubble_V=888;
  String gaz = "CO2";

  public Bubble() {
    this.bubble_V = random.nextFloat(MAX_BUBBLE_V);
    }

  public float getBubble_V() {
    System.out.println(valueOf(bubble_V));
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    return bubble_V;
  }

  public Bubble[] bubblesArray() {
    Bubble[] bubblesArray = new Bubble[10000];
    for (int i = 0; i < bubblesArray.length; i++) {
    bubblesArray[i] = new Bubble();
    }
    return bubblesArray;
  }
  public String getGaz() {

    return gaz;
  }

  public void setGaz(String gaz) {

    this.gaz = gaz;
  }


}
