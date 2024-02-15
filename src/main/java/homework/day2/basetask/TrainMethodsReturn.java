package homework.day2.basetask;

public class TrainMethodsReturn {
  // - создать класс TrainMethodsReturn и в нем
  // -- создать метод returnNewInt, который принимает на вход целое число (int) и возвращает это
  // число умноженное на 3
  // -- создать метод returnNewLong, который принимает на вход целое число (long) и возвращает это
  // число минус 4
  // -- создать метод returnNewChar, который принимает на вход символ (char) и возвращает строку из
  // двух таких символов
  // -- создать метод returnNewFloat, который принимает на вход дробное число (float) и возвращает
  // это число деленное на 2
  // -- создать метод returnNewDouble, который принимает на вход дробное число (double) и возвращает
  // это число плюс 8
  // -- создать метод returnNewShort, который принимает на вход целое число (short) и возвращает это
  // число минус 1
  // -- создать метод returnNewByte, который принимает на вход целое число (byte) и возвращает это
  // число умноженное на 2
  // -- создать метод returnNewBoolean, который принимает на вход булево значение (boolean) и
  // возвращает обратное булево
  // -- создать класс TrainMethodsReturnRunner с методом main, в котором создать объект класса
  // TrainMethodsReturn, и отпечатать в консоль значение, возвращаемое каждым из его методов в виде
  // "метод <название метода> вернул " и возвращаемое значение
  public int returnNewInt(int intValue) { return 3 * intValue;}

  public long returnNewLong(long longValue) {
    return longValue - 4;
  }

  public String returnNewChar(char charValue) {
    return Character.toString(charValue) + charValue;
  }

  public Float returnNewFloat(float floatValue) {
    return floatValue / 2;
  }

  public Double returnNewDouble(double doubleValue) {
    return doubleValue + 8;
  }

  public Short returnNewShort(short shortValue) {
    return (short) (shortValue - 1);
  }

  public Byte returnNewByte(byte byteValue) {
    return (byte) (byteValue * 2);
  }

  public Boolean returnNewBoolean(boolean booleanValue) {
    return booleanValue;
  }
}
