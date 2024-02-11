package project.bubbles;

public class Bottle {
  float bottle_v;
  float water;

  public Bottle(float bottle_v) {
    this.bottle_v = bottle_v;
  }

  public float getBottle_v() {
    return bottle_v;
  }

  public float getWater() {
    return water;
  }

  public void open(Bubble[] inBottle) {
    SparklingWater sparklingWater = new SparklingWater();
    sparklingWater.degas(inBottle);
  }
}
