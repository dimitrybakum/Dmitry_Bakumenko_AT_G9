package classwork.day12;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class MyThreads {
  public static void heavyMethod() {
    long t0 = System.currentTimeMillis();
    for (int i = 0; i < 1_00_000_000; i++) {
      double d = tan(atan(123456789.123456789));
    }
    System.out.printf(
        "I am %s, and I have finished in %s millis \r\n",
        Thread.currentThread().getName(), (System.currentTimeMillis() - t0));
  }

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      new Thread(() -> {
        heavyMethod();
      }).start();
    }
  }

}
