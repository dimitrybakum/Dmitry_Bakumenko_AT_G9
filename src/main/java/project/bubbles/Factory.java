package project.bubbles;

import project.bubbles.boxing.Bottle;
import project.bubbles.water.SparklingWater;

public class Factory {
  public static void main(String[] args) throws InterruptedException {
    Bottle bottle1 = new Bottle(0.05);
    Bottle bottle2 = new Bottle(0.1);
    Bottle bottle3 = new Bottle(0.2);

    bottle1.setWater(new SparklingWater( 12, "no", "transparent", "no"));
    bottle2.setWater(new SparklingWater( 18, "no", "transparent", "no"));
    bottle3.setWater(new SparklingWater( 25, "no", "transparent", "no"));

    bottle1.carbonation();
    bottle2.carbonation();
    bottle3.carbonation();

    bottle1.open();
    bottle2.open();
    bottle3.open();

  }
}
