package com.basetask;

public class TrainMethodsIf {
  public int returnNewInt(int intValue) {
    if (intValue < 8) {
      return intValue * 7;
    } else {
      return intValue / 4;
    }
  }

  public long returnNewLong(long l) {
    if (l > 300) {
      return l - 300;
    }
    return l + 20;
  }

  public String returnNewChar(char charValue) {
    final String prefix = String.valueOf(Character.valueOf('o'));
    final String gCase = charValue + "o";

    if (charValue == 'g') {
      return gCase;
    }
    return prefix + charValue;
  }

  public float returnNewFloat(float floatValue) {
    if (floatValue == 0.67) {
      return floatValue;
    } else {
      return floatValue * 2;
    }
  }

  public double returnNewDouble(double doubleValue) {
    if (doubleValue > 30 && doubleValue < 80) {
      return doubleValue + 87;
    } else if (doubleValue > 80 && doubleValue < 400) {
      return doubleValue - +87;
    } else {
      return doubleValue;
    }
  }

  public void returnNewBoolean(boolean booleanValue) {
    if (!booleanValue) {
      System.out.print("Я получил на вход ложь ");
    } else {
      System.out.print("Я получил на вход значение истины ");
    }
  }
}
