package homework.day12;

import java.util.ArrayList;
import java.util.List;

public class Mouse4 {
  private String pattern = "Mouse ";
  private String name;

  public Mouse4(int number) {
    this.name = pattern + number;
  }

  public void peep() throws InterruptedException {
    System.out.println(name + " PEEP!");
    Thread.sleep(200);
  }

  public static void main(String[] args) {
    List<Mouse4> mice = new ArrayList<>();
    for (int i = 1; i < 28; i++) {
      mice.add(new Mouse4(i));
    }

    for (int i = 1; i < 8; i++) {
      int finalI = i;
      new Thread(
              () -> {
                while (!mice.isEmpty()) {
                  try {
                    mice.getLast().peep();
                    mice.removeLast();
                    System.out.printf("removed in Thread-%s  ", finalI).println();
                    Thread.sleep(250);
                  } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                  }
                }
              })
          .start();
    }
  }
}
