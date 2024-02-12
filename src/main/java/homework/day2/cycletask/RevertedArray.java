package homework.day2.cycletask;

import java.util.Arrays;
import java.util.Random;
import homework.day2.cycletask.Array;
public class RevertedArray {
    int[] array = {1,2,3,4,5};
    public void showRevertedArray()  {
    System.out.println(Arrays.toString(this.array));
        int[] revertedArray = new int[array.length];
        for (int i = array.length -1; i >= 0; i-- ) {
            revertedArray[array.length - 1 - i] = array[i];
        }
        System.out.println(Arrays.toString(revertedArray));
    }
}
