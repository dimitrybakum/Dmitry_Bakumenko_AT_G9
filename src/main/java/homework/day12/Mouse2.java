package homework.day12;

import java.util.Collection;
import java.util.Collections;

public class Mouse2 {
  private String pattern = "Mouse ";
  private String name;

  public Mouse2(int number) {
    this.name = pattern + number;
  }

  public void peep() throws InterruptedException {
    System.out.println(name + " PEEP!");
    Thread.sleep(200);
  }

  public static void main(String[] args) throws InterruptedException {
    new Thread(
            () -> {
              for (int i = 1; i < 8; i++) {
                try {
                  Thread.currentThread().sleep(0);
                } catch (InterruptedException e) {
                  e.printStackTrace();
                }
                for (int y = 1; y < 19; y++) {
                  Collection<Mouse2> mouseCollection = Collections.singleton(new Mouse2(y));
                  int finalY = y;
                  mouseCollection.forEach(
                      mouse -> {
                        try {
                          if (finalY % 2 == 0) {
                            mouse.peep();
                          }
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
