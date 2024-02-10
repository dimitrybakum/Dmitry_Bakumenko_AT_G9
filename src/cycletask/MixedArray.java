package cycletask;

import java.util.Arrays;

public class MixedArray extends PublicIntArray {
    public void getMixedArray() {

        for (int i = 0; i < ARRAY_SIZE; i++) {
            PUBLIC_ARRAY[i] = random.nextInt(SHORT_VALUE);
        }
        System.out.println("MixedArray before" + Arrays.toString(PUBLIC_ARRAY));
        int newVale = PUBLIC_ARRAY[0];
        PUBLIC_ARRAY[0] = PUBLIC_ARRAY[6];
        PUBLIC_ARRAY[6] = newVale;
        System.out.println("MixedArray after" + Arrays.toString(PUBLIC_ARRAY));
        System.out.println();
    }
}
