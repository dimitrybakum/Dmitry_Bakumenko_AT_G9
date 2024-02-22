package project.bubbles.boxing;

import project.bubbles.Transformable;
import project.bubbles.matter.Material;

public abstract class Vessel {
  private double volume;
  private double diameter;
  private int weight;
  private Material material;
  protected Transformable stuff;

  public Vessel(double volume, double diameter, Material material) {
    this.volume = volume;
    this.diameter = diameter;
    this.material = material;
    setWeight();
  }

  public double getVolume() {
    System.out.printf("Getting %s volume: %s", this.getClass().getSimpleName(), volume).println();
    return volume;
  }

  public void setVolume(double volume) {
    System.out.printf("Setting %s volume: %s", this.getClass().getSimpleName(), volume).println();
    this.volume = volume;
  }

  public double getDiameter() {
    System.out
        .printf("Getting %s diameter: %s", this.getClass().getSimpleName(), diameter)
        .println();
    return diameter;
  }

  public void setDiameter(double diameter) {
    System.out
        .printf("Setting %s diameter: %s", this.getClass().getSimpleName(), diameter)
        .println();
    this.diameter = diameter;
  }

  public int getWeight() {
    System.out.printf("Getting %s weight: %s", this.getClass().getSimpleName(), weight).println();
    return weight;
  }

  public void setWeight() {
    System.out.printf("Setting %s weight: %s", this.getClass().getSimpleName(), weight).println();
    double density = material.getDensity();
    double weightDouble = (volume * density) / diameter;
    weight = (int) Math.round(weightDouble);
  }

  public Material getMaterial() {
    System.out
        .printf("Getting %s material: %s", this.getClass().getSimpleName(), material)
        .println();
    return material;
  }

  public void setMaterial(Material material) {
    System.out
        .printf("Setting %s material: %s", this.getClass().getSimpleName(), material)
        .println();
    this.material = material;
  }
}
