package homework.day4;

public class ArrayMethods {
  public void showSumArrayN(int[] array, int n) {
    int sum = 0;
    for (int i = n - 1; i < array.length; i += n) {

      sum += array[i];
    }
    System.out.println(sum);
  }
}
