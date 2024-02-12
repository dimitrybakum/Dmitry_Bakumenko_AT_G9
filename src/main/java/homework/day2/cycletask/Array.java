package homework.day2.cycletask;

import java.util.Random;

public class Array {
    Random random = new Random();

    int[] array = new int[7];
    public void showArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(4,100);
        }
    System.out.println("[" + array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4] + " " + array[5] + " " + array[6] + "]");
    }
}
