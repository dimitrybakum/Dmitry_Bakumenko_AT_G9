package com.cycletask;

public class CountWithSpace {
  int printValue = 0;
  String newStr = "";

  public void getCountWitSpace() {

    while (printValue <= 20) {
      newStr += printValue + " ";
      printValue += 1;
    }
    System.out.println("CountWithSpace elements: " + newStr);
  }
}
