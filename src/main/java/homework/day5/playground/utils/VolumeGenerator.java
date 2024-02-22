package homework.day5.playground.utils;

import homework.day5.playground.essence.material.Pourable;
import homework.day5.playground.essence.material.types.Water;

import java.util.Random;

public class VolumeGenerator {
  public static int generateVolume(Pourable pourable) {
    Random random = new Random();
    int volume;
    if (pourable instanceof Water) {
      volume = random.nextInt(50, 99);
    } else {
      volume = random.nextInt(1, 49);
    }
    System.out
        .printf(
            "VolumeGenerator: I have generated volume of %s with value: %d",
            pourable.getClass().getSimpleName(), volume)
        .println();
    return volume;
  }
}
