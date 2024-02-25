package homework.day8.pack;

import java.util.*;

// 15.
public class Chair {
  private int height;
  private int width;

  public static void main(String[] args) {
    // Создать список стульев (класса Chair) furniture из 3 стульев высотой (1, 4, 2) и шириной (2,
    // 2, 4) соответственно,
    // через (Arrays.asList())
    List<Chair> chairs = Arrays.asList(new Chair(1, 2), new Chair(4, 2), new Chair(2, 4));
    System.out.println(chairs);
    // Проитерировать список через for-each и отпечатать произведение высоты на ширину в консоль
    // через пробел
    for (Chair chair : chairs) {
      System.out.printf(String.valueOf(chair.getWidth() * chair.getHeight()) + " ");
    }
    System.out.println();
    // Создать пустую карту, где ключом является целое число, а значением объект стула
    Map<Integer, Chair> myChairs = new HashMap<>();

    // Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное
    // число
    int key = 1;
    for (Chair chair : chairs) {
      myChairs.put(key++, chair);
    }
    System.out.println(myChairs);
    System.out.println();
    // Проитерировать карту и отпечатать ключи в консоль
    for (Integer key2 : myChairs.keySet()) {
      System.out.println(key2);
    }
    System.out.println();
    // Проитерировать карту и отпечатать значения в консоль
    for (Chair values : myChairs.values()) {
      System.out.println(values);
    }
    System.out.println();
    // Проитерировать карту и отпечатать пары ключ-значение в консоль
    for (Map.Entry<Integer, Chair> entry : myChairs.entrySet()) {
      System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
    }
  }

  public Chair(int height, int width) {
    this.height = height;
    this.width = width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Chair chair = (Chair) o;
    return getHeight() == chair.getHeight() && getWidth() == chair.getWidth();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getHeight(), getWidth());
  }

  @Override
  public String toString() {
    return "Chair{" + "height=" + height + ", width=" + width + '}';
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }
}
