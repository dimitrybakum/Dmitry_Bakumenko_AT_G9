package homework.day8.pack;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import static java.lang.String.valueOf;

public class Bubble {
  private int volume;
  private String name;

  public Bubble(int volume, String name) {
    this.volume = volume;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Bubble{" + "volume=" + volume + ", name='" + name + '\'' + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Bubble bubble = (Bubble) o;
    return getVolume() == bubble.getVolume() && Objects.equals(getName(), bubble.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getVolume(), getName());
  }

  public static void main(String[] args) {
    List<Bubble> bubbles = Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));


    System.out.println("Проитерировать список через for-each и отпечатать объемы в консоль через пробел");
    for (Bubble bubble : bubbles) {
      System.out.printf(bubble.getVolume() + " ");
    }
    System.out.println();

    System.out.println("Проитерировать список через for-each и отпечатать имена в консоль через пробел");
    for (Bubble bubble : bubbles) {
      System.out.printf(bubble.getName() + " ");
    }
    System.out.println();

    System.out.println("Посчитать объем всех пузырей и вывести число в консоль");
    int allVolumes = 0;
    for (Bubble bubble : bubbles) {
      allVolumes += bubble.getVolume();
    }
    System.out.printf(valueOf(allVolumes));
    System.out.println();

    System.out.println(
        "Проитерировать список по индексу и отпечатать пузыри (.toString()) в консоль с новой строки");
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
