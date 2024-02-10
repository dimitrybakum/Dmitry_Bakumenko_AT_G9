package com.cycletask;

public class MultipliedArray extends PublicIntArray {

  public void getMultipliedArray() {
    for (int y = 0; y <= ARRAY_SIZE - 1; y++) {
      PUBLIC_ARRAY[y] = random.nextInt(SHORT_VALUE);
      PUBLIC_ARRAY[y] = PUBLIC_ARRAY[y] * 5;
      System.out.println("multiplied Array element " + y + "  :" + PUBLIC_ARRAY[y]);
    }
    System.out.println();
  }
}
