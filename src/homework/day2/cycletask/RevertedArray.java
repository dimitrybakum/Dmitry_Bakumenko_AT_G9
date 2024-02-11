package homework.day2.cycletask;

public class RevertedArray extends PublicIntArray {
    public void getRevertedArray() {
        for (int i = ARRAY_SIZE - 1; i >= 0; i--) {
            PUBLIC_ARRAY[i] = random.nextInt(SHORT_VALUE);
            System.out.println("reverted Array element " + i + "  :" + PUBLIC_ARRAY[i]);
        }
        System.out.println();
    }
}
