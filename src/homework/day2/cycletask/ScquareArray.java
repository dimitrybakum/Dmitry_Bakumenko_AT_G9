package homework.day2.cycletask;

public class ScquareArray {
  public void getSquareArray() {

    int[] array = {1,2,3,4,5};
    int[] sqArray = new int[array.length];

    for (int y = 0; y <= array.length - 1; y++) {
      sqArray[y] = array[y] * array[y];
      System.out.println("squared Array element " + y + "  :" + sqArray[y]);
    }
    System.out.println();
  }
}
