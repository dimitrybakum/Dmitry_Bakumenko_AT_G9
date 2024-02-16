package homework.day5.playground.essence;

public interface Flyable {
  default void fly(String direction) {
    String text =
        String.format(
            "{I am %s, my name is %s and I amd flying to %s}",
            getClass().getSimpleName(), this.getName(), direction);
    System.out.println(text);
  }

  Object getName();
}
