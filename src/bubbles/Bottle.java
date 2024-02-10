package com.bubbles;

public class Bottle {
  float bottle_v;
  float water;

  public Bottle(float bottle_v) {
    this.bottle_v = bottle_v;
  }

  public float getBottle_v() {
    return bottle_v;
  }

  public void setBottle_v(float bottle_v) {
    this.bottle_v = bottle_v;
  }

  public float getWater() {
    return water;
  }

  public void setWater(float water) {
    this.water = water;
  }

  public void open(Bubble[] inBottle) {
    SparklingWater sparklingWater = new SparklingWater();
    sparklingWater.degas(inBottle);
  }
}
