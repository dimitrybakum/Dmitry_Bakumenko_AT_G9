package homework.day8.pack;

import java.util.*;

public class Sand {
  private int weight;
  private String name;

  public Sand(int weight, String name) {
    this.weight = weight;
    this.name = name;
  }

  public static void main(String[] args) {
    List<Sand> sands = new ArrayList<>();

    sands.add(0, new Sand(2, "Речной"));
    sands.add(1, new Sand(4, "Речной"));
    sands.add(2, new Sand(2, "Карьерный"));
    sands.add(3, new Sand(7, "Речной"));

    System.out.println(
        "Проитерировать список через for-each и отпечатать вес в консоль через пробел");
    for (Sand sand : sands) {
      System.out.printf(sand.getWeight() + " ");
    }System.out.println();

    System.out.println(
        "Проитерировать список через for-each и отпечатать имена в консоль через пробел");
    for (Sand sand : sands) {
      System.out.printf(sand.getName() + " ");
    }System.out.println();

    System.out.println(
        "Создать пустую карту, где ключом является целое число, а значением объект песка");
    Map<Integer, Sand> sandMap = new HashMap<>();

    System.out.println(
        "Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число");

    int key = 1;
    for (Sand sand : sands) {
      sandMap.put(key++, sand);
    }
    System.out.println(sandMap);

    System.out.println("Проитерировать карту и отпечатать ключи в консоль");
    for (Integer keys : sandMap.keySet()) {
      System.out.println("Ключ: " + keys);
    }System.out.println();

    System.out.println("Проитерировать карту и отпечатать значения в консоль");
    for (Sand values : sandMap.values()) {
      System.out.println("Значение: " + values.getName());
    }System.out.println();

    System.out.println("Проитерировать карту и отпечатать пары ключ-значение в консоль");
    for (Map.Entry<Integer, Sand> entry : sandMap.entrySet()) {
      System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
    }
  }

  @Override
  public String toString() {
    return "Sand{" + "weight=" + weight + ", name='" + name + '\'' + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Sand sand = (Sand) o;
    return getWeight() == sand.getWeight() && Objects.equals(getName(), sand.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getWeight(), getName());
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
