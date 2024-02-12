package project.bubbles.boxing;

import project.bubbles.water.Water;
import project.bubbles.water.SparklingWater;
import project.bubbles.gas.Bubble;

public class Bottle {
  private double volume;
  private Water water = new SparklingWater(78, "v", "h", "d");

  public Bottle(double volume) {
    this.volume = volume;
    //carbonation();
  }

  public double getVolume() {
    System.out.println("current volume is" + volume);
    return volume;
  }

  public void setVolume(double volume) {
    System.out.println("new volume " + volume + " installed");
    this.volume = volume;
  }

  public void open() {
    System.out.println("the bottle cork flew somewhere far away");
    SparklingWater sparklingWater = (SparklingWater) water;
    sparklingWater.setOpened();
  }

  public void warm(int temperature) {
    System.out.printf("Warming water to: %s", temperature).println();
    water.setTemperature(temperature);
  }

  public Water getWater() {
    System.out.printf("looking for a water").println();
    return water;
  }

  public void setWater(Water water) {
    System.out.printf("pouring water into the bottle...").println();
    this.water = water;
  }

  public double getBottlevolume() {
    System.out.printf("volume of the bottle is:" + volume).println();
    return volume;
  }

  public void carbonation() {
    System.out.println("bubbles creation in progress...");

    int bubblesArray = (int) (10000 * volume);

    Bubble[] bubbles = new Bubble[bubblesArray];

    for (int i = 0; i < bubblesArray; i++) {
      bubbles[i] = new Bubble("CO2");
    }

    ((SparklingWater) water).pump(bubbles);
  }
}
