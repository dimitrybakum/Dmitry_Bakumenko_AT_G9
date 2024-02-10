package cycletask;

public class PublicIntegerArray extends PublicIntArray {

  final Integer[] PUBLIC_INT_ARRAY = new Integer[ARRAY_SIZE];

  public void newIntegerArray() {

    for (int i = 0; i < ARRAY_SIZE; i++) {
      PUBLIC_INT_ARRAY[i] = random.nextInt(SHORT_VALUE);
      System.out.println("MyIntegerArray element " + i + "  :" + PUBLIC_INT_ARRAY[i]);
    }
    System.out.println();
  }
}
