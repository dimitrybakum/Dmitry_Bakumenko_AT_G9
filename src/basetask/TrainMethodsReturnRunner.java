package com.basetask;

// -- создать класс TrainMethodsReturnRunner с методом main, в котором создать обьект класса
// TrainMethodsReturn, и отпечатать в консоль значение, возвращаемое каждым из его методов в виде
// "метод <название метода> вернул " и возвращаемое значение
public class TrainMethodsReturnRunner {
  public static void main(String[] args) {
    TrainMethodsReturn trainMethodsReturn = new TrainMethodsReturn();
    System.out.println("метод <returnNewInt> вернул:  " + trainMethodsReturn.returnNewInt(7));
    System.out.println("метод <returnNewLong> вернул:  " + trainMethodsReturn.returnNewLong(333));
    System.out.println("метод <returnNewChar> вернул:  " + trainMethodsReturn.returnNewChar('%'));
    System.out.println(
        "метод <returnNewFloat> вернул:  " + trainMethodsReturn.returnNewFloat(10000.4F));
    System.out.println(
        "метод <returnNewDouble> вернул:  " + trainMethodsReturn.returnNewDouble(1000.0));
    System.out.println(
        "метод <returnNewShort> вернул:  " + trainMethodsReturn.returnNewShort((short) 1000));
    System.out.println(
        "метод <returnNewByte> вернул:  " + trainMethodsReturn.returnNewByte((byte) 2));
    System.out.println(
        "метод <returnNewBoolean> вернул:  " + trainMethodsReturn.returnNewBoolean(true));
  }
}
