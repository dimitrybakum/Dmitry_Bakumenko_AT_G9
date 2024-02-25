package homework.day8.pack;

import java.util.Arrays;
import java.util.List;

import static java.lang.String.valueOf;

// 11.x
public class Bubble {
  private int volume;
  private String name;

  public Bubble(int volume, String name) {
    this.volume = volume;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Bubble{" +
            "volume=" + volume +
            ", name='" + name + '\'' +
            '}';
  }

  public static void main(String[] args) {
    // Создать список пузырей (класса Bubble) bubbles из 3 пузырьков с обьемами (2, 4, 5) и именами
    // (CO2, O2, CO) соответственно, через (Arrays.asList())
    List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));

    // Проитерировать список через for-each и отпечатать объемы в консоль через пробел
    for (Bubble bubble : bubbles) {
      System.out.printf(bubble.getVolume() + " ");
    }
    System.out.println();

    // Проитерировать список через for-each и отпечатать имена в консоль через пробел
    for (Bubble bubble : bubbles) {
      System.out.printf(bubble.getName() + " ");
    }
    System.out.println();

    // Посчитать объем всех пузырей и вывести число в консоль
    int allVolumes = 0;
    for (Bubble bubble : bubbles) {
      allVolumes += bubble.getVolume();
    }
    System.out.printf(valueOf(allVolumes));
    System.out.println();

    // Проитерировать список по индексу и отпечатать пузыри (.toString()) в консоль с новой строки
    for (int i = 0; i < bubbles.size(); i++) {
      System.out.println(bubbles.get(i).toString());
    }
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
