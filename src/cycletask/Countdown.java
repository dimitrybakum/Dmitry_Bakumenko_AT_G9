package cycletask;

import java.util.Arrays;
import java.util.Collections;
// need public integer array

public class Countdown extends PublicIntegerArray {
  public void getCountdownArray() {
    for (int i = 0; i < ARRAY_SIZE; i++) {
      PUBLIC_INT_ARRAY[i] = random.nextInt(SHORT_VALUE);
    }
    Arrays.sort(PUBLIC_INT_ARRAY, Collections.reverseOrder());
    System.out.println();
    System.out.println("Countdown elements : " + Arrays.toString(PUBLIC_INT_ARRAY));
    System.out.println();
  }
}
