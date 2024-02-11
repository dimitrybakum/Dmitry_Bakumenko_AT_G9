package project.bubbles.boxing;

import project.bubbles.water.SparklingWater;

public class Bottle {
  public float bottle_v;
  public SparklingWater water;

  public Bottle(float bottle_v) {
    this.bottle_v = bottle_v;
    this.water = new SparklingWater();
    this.water.setBubbles(this.bottle_v);
  }

  public void open() {
    this.water.degas();
  }

  public float getBottle_v() {
    return bottle_v;
  }

  public SparklingWater getWater() {
    return water;
  }
}
