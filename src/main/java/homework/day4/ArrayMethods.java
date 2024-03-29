package homework.day4;

import java.util.Arrays;

public class ArrayMethods {

  public void showSumArrayN(int[] array, int n) {
    int sum = 0;
    for (int i = n - 1; i < array.length; i += n) {

      sum += array[i];
    }
    System.out.println(sum);
  }

  public int[] showRevertedArrayN(int[] array, int n) {
    int[] newArray = new int[array.length];
    int c = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > n) {
        newArray[c] = array[i];
        c++;
      }
    }
    int[] revertedArray = new int[c];
    for (int y = 0; y < revertedArray.length; y++) {
      c--;
      revertedArray[y] = newArray[c];
    }
    //System.out.println(Arrays.toString(revertedArray));
    return revertedArray;
  }

  public int showMonthArrayN(int[] array, int n) {
    int sum = 0;
    for (int j : array) {
      if (j % n == 0) {
        sum += j;
      }
    }
    System.out.printf(String.valueOf(sum)).println();
    return sum;
  }

  public void showHorse() {
    System.out.println("\t  ^__^");

    System.out.println("\t  (oo)\\\\_______");

    System.out.println("\t (__)\\ ) \\/\\  \\");

    System.out.println("\t      ||----w |\\");

    System.out.println("\t      ||     ||");
  }
}