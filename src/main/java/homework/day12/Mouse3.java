package homework.day12;

import java.util.ArrayList;
import java.util.List;

public class Mouse3 {
  private String pattern = "Mouse ";
  private String name;

  public Mouse3(int number) {
    this.name = pattern + number;
  }

  public void peep() throws InterruptedException {
    System.out.println(name + " PEEP!");
    Thread.sleep(200);
  }

  public static void main(String[] args) {
    List<Mouse3> mice = new ArrayList<>();
    for (int i = 1; i < 280; i++) {
      mice.add(new Mouse3(i));
    }

    for (int i = 1; i < 6; i++) {
      int finalI = i;
      new Thread(() -> {
                while (!mice.isEmpty()) {
                  try {
                    mice.removeLast().peep();
                    System.out.printf("removed in Thread-%s  ", finalI).println();
                  } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                  }
                }
              })
          .start();
    }
  }
}
