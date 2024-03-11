package homework.day12;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

public class Mouse1 {
  // private String pattern - содержит паттерн имени мыши формате "Mouse <n>", где n - порядковый
  // номер мыши
  private String pattern = "Mouse ";

  // private String name - имя мыши в формате "Mouse <n>", где n - порядковый номер мыши
  private String name;

  // конструктор public Mouse(int number) - в нем инициализируется поле name
  public Mouse1(int number) {
    this.name = pattern + number;
  }

  // метод public void peep() - печатает в консоль фразу в формате "Mouse <n> PEEP!", где n -
  // порядковый номер мыши, и заставляет поток заснуть на 200мс
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
