package cycletask;

import java.util.Arrays;

public class MinFromArray extends PublicIntArray {
  public void getMinFromArray() {

    for (int i = 0; i < ARRAY_SIZE; i++) {
      PUBLIC_ARRAY[i] = random.nextInt(SHORT_VALUE);
    }
    System.out.println();
    System.out.println("MinFromArray full  :" + Arrays.toString(this.PUBLIC_ARRAY));
    System.out.println(
        "MinFromArray minimal  :" + Arrays.stream(this.PUBLIC_ARRAY).min().getAsInt());
    System.out.println();
  }
}
