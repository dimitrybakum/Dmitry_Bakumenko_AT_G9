package homework.day5.playground.processors;

import homework.day5.playground.essence.craft.Transportable;
import static homework.day5.playground.utils.CoordinatesGenerator.generateCoordinate;

public class TransportableProcessor {
  public void runTransportable(Transportable transportable, int pointA, int pointB) {
    transportable.move(pointA, pointB);
    String text =
        String.format(
            "{Transportable %s was moved to %d points}",
            getClass().getSimpleName(), pointB - pointA);
    System.out.println(text);
  }

  public void runTransportable(Transportable transportable) {
    int movedPoints = transportable.move(generateCoordinate(), generateCoordinate());
    String text =
        String.format(
            "{Transportable %s was moved to %d points}",
            this.getClass().getSimpleName(), movedPoints);
    System.out.println(text);
  }
}
