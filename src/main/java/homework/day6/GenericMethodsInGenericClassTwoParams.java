package homework.day6;
// - создать класс обобщенного типа GenericMethodsInGenericClassTwoParams<X, Y> и в нем:
public class GenericMethodsInGenericClassTwoParams<X, Y> {
    // -- перегруженный метод genericMethodGenArgs, принимающий 1 или 2 аргумента переменного типа и
    // возвращающий строку "I received N arguments of type: X class, Y class", где N - количество
    // полученных аргументов, X и Y - название классов передаваемых аргументов
    public String genericMethodGenArgs(X a) {
    return "I received 1 arguments of type: " + a.getClass().getSimpleName() + " class";
    }
    public String genericMethodGenArgs(X a, Y b) {
        return "I received 2 arguments of type: " + a.getClass().getSimpleName() + " class, " + b.getClass().getSimpleName() + " class";
    }
  // -- перегруженный невозвратный метод genericMethodHalfGenArgs, принимающий 1 или 2 аргумента
  // переменного типа
  // и второй или третитй аргумент типа String, и печатающий в консоль фразу
  // "I got an object of X class and Y class and string with N characters",
  // где X - название класса передаваемых аргументов,
  // N - количество символов в переданной строке,
  // перегрузку метода сделать для вариантов параметров типа (X, String), (Y, String)
  public void genericMethodHalfGenArgs(X a, String string) {
      System.out.println("I got an object of " + a.getClass().getSimpleName() + " class and string with " + string.length() + " characters");
  }
  public void genericMethodHalfGenArgs(X a, Y b, String string) {
    System.out.println("I got an object of " + a.getClass().getSimpleName() + " class and " + b.getClass().getSimpleName() + " class and string with " + string.length() + " characters");
  }
}
