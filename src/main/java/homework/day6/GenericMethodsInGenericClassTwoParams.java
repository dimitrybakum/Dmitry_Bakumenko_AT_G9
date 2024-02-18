package homework.day6;

public class GenericMethodsInGenericClassTwoParams<X, Y> {
  public String genericMethodGenArgs(X a) {
    return "I received 1 arguments of type: " + a.getClass().getSimpleName() + " class";
  }

  public String genericMethodGenArgs(X a, Y b) {
    return "I received 2 arguments of type: "
        + a.getClass().getSimpleName()
        + " class, "
        + b.getClass().getSimpleName()
        + " class";
  }

  public void genericMethodHalfGenArgs(X a, String string) {
    System.out.println(
        "I got an object of "
            + a.getClass().getSimpleName()
            + " class and string with "
            + string.length()
            + " characters");
  }

  public void genericMethodHalfGenArgs(X a, Y b, String string) {
    System.out.println(
        "I got an object of "
            + a.getClass().getSimpleName()
            + " class and "
            + b.getClass().getSimpleName()
            + " class and string with "
            + string.length()
            + " characters");
  }
}
