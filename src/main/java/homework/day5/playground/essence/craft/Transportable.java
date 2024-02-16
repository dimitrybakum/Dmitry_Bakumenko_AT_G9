package homework.day5.playground.essence.craft;

public interface Transportable {
  default int move(int pointA, int pointB) {
    String text =
        String.format(
            "{I am %s, my name is %s and I am moving from point %d to point %d}",
            getClass().getSimpleName(), this.getName(), pointA, pointB);
    System.out.println(text);
    return pointB - pointA;
  }

  Object getName();
}
