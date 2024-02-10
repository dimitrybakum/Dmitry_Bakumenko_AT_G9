package com.pretask;

public class IncrementDecrementExample {
  public static void main(String[] args) {
    // - класс IncrementDecrementExample, объявите целочисленную переменную и используйте операторы
    // инкремента и декремента для изменения её значения, выведите результаты на экран;
    final int MY_VAR = 5;
    int myDec = MY_VAR;
    int myInc = MY_VAR;
    --myDec;
    System.out.println(myDec);
    ++myInc;
    System.out.println(myInc);
  }
}
