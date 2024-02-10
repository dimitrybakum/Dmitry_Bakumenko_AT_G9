package com.bubbles;

public class Bubble {
  final float MAX_BUBBLE_V = 0.3f;
  float gazSostav;

  public Bubble(float gazSostav) {
    this.gazSostav = gazSostav;
  }

  public float getGazSostav() {
    return gazSostav;
  }

  public void setGazSostav(float gazSostav) {
    this.gazSostav = gazSostav;
  }
}
