package homework.day2.cycletask;

public class MultipliedArray {

  int[] array = {1, 2, 3, 4, 5};

  public void getMultipliedArray() {
    for (int y = 0; y <= array.length - 1; y++) {
      //array[y] = random.nextInt(SHORT_VALUE);
      array[y] = array[y] * 5;
      System.out.println("multiplied Array element " + y + "  :" + array[y]);
    }
    System.out.println();
  }
}
