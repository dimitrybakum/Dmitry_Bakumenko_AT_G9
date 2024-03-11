package homework.day12;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

public class Mouse1 {
  private String pattern = "Mouse ";
  private String name;
  public Mouse1(int number) {
    this.name = pattern + number;
  }
  public void peep() throws InterruptedException {
    System.out.println(name + " PEEP!");
    Thread.sleep(200);
  }

  public static void main(String[] args) throws InterruptedException {
    new Thread(
            () -> {
              for (int i = 1; i < 6; i++) {
                try {
                  Thread.currentThread().sleep(0);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
                for (int y = 1; y < 21; y++) {
                  Collection<Mouse1> mouseCollection = Collections.singleton(new Mouse1(y));
                  mouseCollection.stream()
                      .forEach(
                          mouse -> {
                            try {
                              mouse.peep();
                            } catch (InterruptedException e) {
                              throw new RuntimeException(e);
                            }
                          });
                }
                System.out.printf("End of Thread-%s  ", i).println();
              }
            })
        .start();
  }
}
