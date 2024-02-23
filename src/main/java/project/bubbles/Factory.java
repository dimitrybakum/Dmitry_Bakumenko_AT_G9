package project.bubbles;

import project.bubbles.boxing.Bottle;
import project.bubbles.boxing.gas.Bubble;
import project.bubbles.matter.Material;
import project.bubbles.matter.Plastic;
import project.bubbles.water.SparklingWater;

public class Factory {
  public static void main(String[] args) throws InterruptedException {
    Plastic plastic = new Plastic();
    Bottle bottle1 = new Bottle(0.05, 0.25, plastic);
    Bottle bottle2 = new Bottle(0.1, 0.25, plastic);
    Bottle bottle3 = new Bottle(0.2, 0.25, plastic);

    bottle1.setWater(new SparklingWater( 12, "no", "transparent", "no"));
    bottle2.setWater(new SparklingWater( 18, "no", "transparent", "no"));
    bottle3.setWater(new SparklingWater( 25, "no", "transparent", "no"));

    bottle1.addStuff(bottle1.getWater());
    bottle2.addStuff(bottle1.getWater());
    bottle3.addStuff(bottle1.getWater());

    bottle1.open();
    bottle2.open();
    bottle3.open();

  }
}
