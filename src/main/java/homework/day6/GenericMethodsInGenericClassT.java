package homework.day6;

public class GenericMethodsInGenericClassT<T> {
  // - создать класс обобщенного типа GenericMethodsInGenericClassT<T> и в нем:
  // -- невозвратный метод genericMethodOneGenArg,
  // принимающий аргумент переменного типа и печатающий в консоль фразу "I am an object of X class",
  // где X - название класса передаваемого аргумента

  public void genericMethodOneGenArg(T a) {
    System.out.println("I am an object of " + a.getClass().getSimpleName() + " class");
  }

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // -- метод genericMethodTwoGenArgs, принимающий 2 аргумента переменного типа и возвращающий
  // строку "We are objects of X class and Y class", где X и Y - название классов передаваемых
  // аргументов
  public <F> Object genericMethodTwoGenArgs(T a, F b) {
    return STR."We are objects of \{a.getClass().getSimpleName()} class and \{b.getClass().getSimpleName()} class.";
  }

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // -- невозвратный метод genericMethodHalfGenArgs,
  // принимающий 1 аргумент переменного типа и второй аргумент типа String,
  // и печатающий в консоль фразу "I got an object of X class and string with N characters",
  // где X - название класса передаваемых аргументов, N - количество символов в переданной строке
  public void genericMethodHalfGenArgs(T a, String string) {

    System.out.println(
        "I got an object of "
            + a.getClass().getSimpleName()
            + " class and string with "
            + string.length()
            + " characters");
  }
}
