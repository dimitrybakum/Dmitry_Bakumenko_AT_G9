package homework.day2.cycletask;


public class MinFromArray {
  int[] array = {2345, 243, 55, 234, 63};

  public void getMinFromArray() {
    int tempV = 0;
    for (int i = 0; i < array.length; i++) {
      tempV = array[i];
      for (int y = 1; y < array.length; y++) {
        if (tempV > array[y]) {
          tempV = array[y];
        }
      }
    }
    System.out.println("minimall value from array : " + tempV);
  }
}
