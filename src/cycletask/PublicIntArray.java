package com.cycletask;

import java.util.Arrays;
import java.util.Random;

public class PublicIntArray {
  public static void main(String[] args) {}

  final int[] PUBLIC_ARRAY = new int[7];
  final int ARRAY_SIZE = 7;
  int[] newIntArray = new int[ARRAY_SIZE];

  Random random = new Random();
  final short SHORT_VALUE = (short) random.nextInt(1 << 9);

  public void getPublicArray() {
    for (int i = 0; i < ARRAY_SIZE; i++) {
      PUBLIC_ARRAY[i] = random.nextInt(SHORT_VALUE);
    }
    System.out.println("PublicIntArray: " + Arrays.toString(PUBLIC_ARRAY));
  }
}
