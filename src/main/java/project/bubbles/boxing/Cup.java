package project.bubbles.boxing;

import project.bubbles.Containable;
import project.bubbles.Transformable;
import project.bubbles.matter.Material;

public class Cup extends Vessel implements Containable {
  public Cup(double volume, double diameter, Material material) {
    super(volume, diameter, material);
  }

  @Override
  public void addStuff(Transformable stuff) {
    System.out.printf("Adding %s into Cup", stuff.getClass().getSimpleName()).println();
    this.stuff = stuff;
  }

  @Override
  public void removeStuff(Transformable stuff) {
    System.out.printf("Removing %s from Cup", stuff.getClass().getSimpleName()).println();
  }

  @Override
  public boolean isEmpty() {
    return false;
  }
}
