package homework.day2.cycletask;

import java.util.Arrays;

public class MixedArray {
  int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};

  public void getMixedArray() {

    for (int i = 0; i < array.length; i++) {}
    System.out.println("MixedArray before" + Arrays.toString(array));
    int newVale = array[0];
    array[0] = array[6];
    array[6] = newVale;
    System.out.println("MixedArray after" + Arrays.toString(array));
    System.out.println();
  }
}
