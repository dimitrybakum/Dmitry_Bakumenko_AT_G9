package homework.day6;

public class GenericMethodsInGenericClassT<T> {

  public void genericMethodOneGenArg(T a) {
    System.out.println("I am an object of " + a.getClass().getSimpleName() + " class");
  }
  public <F> Object genericMethodTwoGenArgs(T a, F b) {
    return STR."We are objects of \{a.getClass().getSimpleName()} class and \{b.getClass().getSimpleName()} class.";
  }
  public void genericMethodHalfGenArgs(T a, String string) {

    System.out.println(
        "I got an object of "
            + a.getClass().getSimpleName()
            + " class and string with "
            + string.length()
            + " characters");
  }
}
