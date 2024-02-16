package homework.day5.playground.essence.craft;

public interface Rideable {
  // ездящие (Rideable): наземные транспортные стредства
  default void drive(String direction) {
      String text =
              String.format("I am %s, my name is %s and I amd driving to %s",
                      getClass().getSimpleName(), this.getName(), direction);
      System.out.println(text);
  }

    Object getName();
}
//где N - название класса соответствующего объекта,
//М - значение name объекта,
//D - строка, подставляемая из значения передаваемого аргумента