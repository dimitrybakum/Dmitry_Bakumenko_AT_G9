package com.cycletask;

public class OddCounter {
  public void getOddCounter() {
    for (int i = 3; i < 20; i++) {
      if (i % 2 != 0) {
        System.out.println("OddCounter element: " + i);
      }
    }
    System.out.println();
  }
}
