package com.cycletask;

public class ScquareArray extends PublicIntArray {
  public void getSquareArray() {

    for (int y = 0; y <= ARRAY_SIZE - 1; y++) {
      newIntArray[y] = random.nextInt(SHORT_VALUE);
      newIntArray[y] = newIntArray[y] * newIntArray[y];
      System.out.println("squared Array element " + y + "  :" + newIntArray[y]);
    }
    System.out.println();
  }
}
