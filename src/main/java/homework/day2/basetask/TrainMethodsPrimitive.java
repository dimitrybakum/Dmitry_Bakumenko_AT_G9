package homework.day2.basetask;

public class TrainMethodsPrimitive {
  // - создать класс TrainMethodsPrimitive и в нем
  // -- создать невозвратный метод printInt, который принимает на вход целое число (int) и печатает
  // в консоль «я получил на вход число » и это число
  // -- создать невозвратный метод printLong, который принимает на вход целое число (long) и
  // печатает в консоль «я получил на вход  длинное число » и это число
  // -- создать невозвратный метод printChar, который принимает на вход символ (char) и печатает в
  // консоль «я получил на вход символ » и это число
  // -- создать невозвратный метод printFloat, который принимает на вход дробное число (float) и
  // печатает в консоль «я получил на вход дробное число » и это число
  // -- создать невозвратный метод printDouble, который принимает на вход дробное число (double) и
  // печатает в консоль «я получил на вход длинное дробное число » и это число
  // -- создать невозвратный метод printShort, который принимает на вход целое число (short) и
  // печатает в консоль «я получил на вход короткое число » и это число
  // -- создать невозвратный метод printByte, который принимает на вход целое число (byte) и
  // печатает в консоль «я получил на вход очень короткое число » и это число
  // -- создать невозвратный метод printBoolean, который принимает на вход булево значение (boolean)
  // и печатает в консоль «я получил на вход булево » и это число
  // -- создать класс TrainMethodsPrimitiveRunner с методом main, в этом методе создать объект
  // класса TrainMethodsPrimitive и вызвать всего его методы

  public char c1 = '$';

  public void printInt(int value) {
    System.out.println("я получил на вход число " + value);
  }

  public void printLong(long value) {
    System.out.println("я получил на вход длинное число " + value);
  }

  public void printChar(char value) {
    System.out.println("я получил на вход символ " + value);
  }

  public void printFloat(float value) {
    System.out.println("я получил на вход дробное число " + value);
  }

  public void printDouble(double value) {
    System.out.println("я получил на вход длинное дробное число " + value);
  }

  public void printShort(short value) {

    System.out.println("я получил на вход короткое число " + value);
  }

  public void printByte(byte value) {

    System.out.println("я получил на вход короткое число " + value);
  }

  public void printBoolean(boolean value) {
    System.out.println("я получил на вход булево " + value);
  }
}
