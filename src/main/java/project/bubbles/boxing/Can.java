package project.bubbles.boxing;

import project.bubbles.Containable;
import project.bubbles.Transformable;
import project.bubbles.matter.Material;

public class Can extends Vessel implements Containable {
  public Can(double volume, double diameter, Material material) {
    super(volume, diameter, material);
  }

  @Override
  public void addStuff(Transformable stuff) {
    System.out.printf("Adding %s into Can", stuff.getClass().getSimpleName()).println();
    this.stuff = stuff;
  }

  @Override
  public void removeStuff(Transformable stuff) {
    System.out.printf("Removing %s from Can", stuff.getClass().getSimpleName()).println();
  }

  @Override
  public boolean isEmpty() {
    return false;
  }
}
