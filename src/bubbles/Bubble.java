package bubbles;

import java.util.Random;

public class Bubble {
  Random random = new Random();
  final float MAX_BUBBLE_V = 0.3f;

  float bubble_V;
  String gaz = "CO2";
  float[] bubblesArray = new float[10000];
  public Bubble() {

    for (int i = 0; i < bubblesArray.length; i++) {
      bubblesArray[i] = random.nextFloat(MAX_BUBBLE_V);
    }
  }
  public float getBubble_V() {
    return bubble_V;
  }

  //public float[] getBubblesArray() {
  //  return bubblesArray;
  //}

  public String getGaz() {

    return gaz;
  }

  public void setGaz(String gaz) {

    this.gaz = gaz;
  }


}
